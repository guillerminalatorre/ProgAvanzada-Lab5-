package com.company.Dao;
import com.company.Model.Human;

import java.sql.*;

public class WinnersDao {

    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/torneo_de_frescas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public WinnersDao(){
        super();
    }

    public void addWinner(Human h){
        try {
            Class.forName(DATABASE_DRIVER);
            Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
           ///System.out.println("Conectado correctamente");

            //Insertar un dato

            Statement stInsert = con.createStatement();
            int rowsAffected = stInsert.executeUpdate("insert into winners(id_human, name, drink_in_body) values " +
                    "("+ h.getId()+", '"+ h.getName()+"', "+ h.getDrinkInBody()+")");

            //System.out.println(String.format("Rows Affected : %d",  rowsAffected));

            stInsert.close();
            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver");
        } catch (SQLException e) {
            System.out.println("SQL State : " + e.getSQLState());
            System.out.println("Message : " + e.getMessage());
            System.out.println("error code : " + e.getErrorCode());
        }
    }

    public String getWinners(){
        StringBuilder reply = new StringBuilder();

        reply.append("GANADORES: ");

        try {
            Class.forName(DATABASE_DRIVER);
            Connection con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            //System.out.println("Conectado correctamente");

            //Ejecutar una query de manera simple

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from winners");
            while (rs.next()) {
                Integer id_winner = rs.getInt("id_winner");
                Integer id_human = rs.getInt("id_human");
                String name = rs.getString("name");
                Integer drink_in_body = rs.getInt("drink_in_body");

                reply.append(String.format("\n id_winner : %d, id_human : %d, name : %s, drink_in_body : %d", id_winner, id_human, name, drink_in_body));
            }
            rs.close();
            st.close();
            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver");
        } catch (SQLException e) {
            System.out.println("SQL State : " + e.getSQLState());
            System.out.println("Message : " + e.getMessage());
            System.out.println("error code : " + e.getErrorCode());
        }

        return reply.toString();
    }
}
