package model;
import java.net.Socket;
import java.sql.*;

public class ConnectDB {
    Connection connexion;
    Statement statement;
    String SQL;

    String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;

    public ConnectDB(String url, String username, String password, String Host, int Port){
        this.url = url;
        this.username = username;
        this.password = password;
        this.Host = Host;
        this.Port = Port;
    }
    // méthode qui permet de faire la connection avec la BD
    public Connection connexionDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connexion;
    }

    //méthode qui permet de fermer la connexion avec la BD
    public Connection closeConnexion(){
        try{
            connexion.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return connexion;
    }

    // permet d'exécuter des requêtes
    public ResultSet executionQuery(String sql){
        connexionDatabase();
        ResultSet resultSet = null;

        try {
            statement = connexion.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return resultSet;
    }

    //pour mettre à jour la requête
    public String executionUpdate(String sql){
        connexionDatabase();
        String result = "";

        try {
            statement = connexion.createStatement();
            statement.executeUpdate(sql);
            result = sql;
        } catch (SQLException ex){
            result = ex.toString();
        }
        return result;
    }

    //pour afficher toutes les requêtes
    public ResultSet querySelectAll(String nomTable){
        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable;
        System.out.println(SQL);
        return this.executionQuery(SQL);
    }
    //pour afficher toute les requêtes selon ou on peut les trouver
    public ResultSet querySelectAll(String nomTable, String etat){
        connexionDatabase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
        return this.executionQuery(SQL);
    }

    public ResultSet foundAllChildren(String nomTable, int idParent){
        connexionDatabase();
        SQL = "SELECT idENFANT FROM " + nomTable + " WHERE PARENT_ID = " + idParent;
        return this.executionQuery(SQL); 
    }
    //pour afficher toute les colonnes de la table shouaité
    public ResultSet querySelect(String[] nomColonne, String nomTable){
        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i < nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable;
        return this.executionQuery(SQL);
    }
    //
    public ResultSet forSelectCommand(String[] nomColonne, String nomTable, String etat){
        connexionDatabase();
        int i;
        SQL = "SELECT ";

        for (i = 0; i < nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable + " WHERE " + etat;
        return this.executionQuery(SQL);
    }
    //permet d'entrée des données
    public String queryInsert(String nomTable, String[] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO  " + nomTable + " VALUES(";

        for (i = 0; i < contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if(i < contenuTableau.length -1){
                SQL += ",";
            }
        }

        SQL += ")";
        return this.executionUpdate(SQL);
    }
    //
    public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau){
        connexionDatabase();
        int i;
        SQL = "INSERT INTO  " + nomTable + "(";

        for (i = 0; i < nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if(i < nomColonne.length -1){
                SQL += ",";
            }
        }

        SQL += ") VALUES(";
        for (int j = 0; j < contenuTableau.length; j++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (j < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.executionUpdate(SQL);
    }
    //
    public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String etat){
        connexionDatabase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";

        for(i = 0; i <= nomColonne.length - 1; i++){
            SQL += nomColonne[i] + "='" +  contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += " WHERE  " + etat;
        return this.executionUpdate(SQL);
    }
    //permet de supprimer la reqûete chosit
    public String queryDelete(String nomTable){
        connexionDatabase();
        SQL = "DELETE FROM " + nomTable;
        return this.executionUpdate(SQL);
    }
    //permet de supprimer une requête avec une condition
    public String queryDelete(String nomTable, String etat){
        connexionDatabase();
        SQL = "DELETE FROM " + nomTable + " WHERE " + etat;
        return this.executionUpdate(SQL);
    }



public static void  main (String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
   // Class.forName("Ccon.mysql.jdbc.Driver").newInstance();
    connexion = DriverManager.getConnection(url,username,password);
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