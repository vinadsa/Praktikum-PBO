/* Nama File    : DAOManager.java
 * Deskripsi    : Class DAOManager, sebagai penghubung antara PersonDAO dan MainClass
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Mei 2025
 */
package Pertemuan10.Modul;

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
