/* Nama File    : MainDAO.java
 * Deskripsi    : MainClass MainDAO
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Mei 2025
 */
package Pertemuan10.Modul;

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
