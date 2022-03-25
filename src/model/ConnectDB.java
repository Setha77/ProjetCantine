package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
static Connection con = null;
static String databaseName = "";
static String url = "jdbc:mysql://localhost:3306/" +databaseName;

static String username ="root";
static String password = "110401Sultan77";

public static void  main (String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
   // Class.forName("Ccon.mysql.jdbc.Driver").newInstance();
    con = DriverManager.getConnection(url,username,password);
    //PreparedStatement ps = con.prepareStatement("INSERT INTO cantine.ENFANT (idENFANT, FIRST_NAME, LAST_NAME, DATE_NAISSANCE,SEXE) VALUES ('4', 'Gianny', 'Sevret', '18/10/200','Homme');");
    PreparedStatement ps2 = con.prepareStatement("UPDATE  cantine.ENFANT (idENFANT, FIRST_NAME, LAST_NAME, DATE_NAISSANCE,SEXE) VALUES ('4', 'Gianny', 'PONTAT', '18/10/200','Homme');");
    //int status  = ps.executeUpdate();
    int status  = ps2.executeUpdate();
    if (status != 0){
         System.out.println("Database was Connected");
          System.out.println("Record was INSERTED");
    }
}
}