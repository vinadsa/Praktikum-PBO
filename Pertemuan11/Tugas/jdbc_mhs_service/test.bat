@echo off
echo ================================================
echo       COMPREHENSIVE JDBC MAHASISWA TEST
echo ================================================
echo.
echo Menjalankan comprehensive test...
echo.

java -cp "build;mysql-connector-java-8.0.33.jar" jdbc.program.TestProgram

echo.
echo Test selesai!
pause
