package org.example;
// 1. Import package
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
            1. Import package
            2. Load, register and create connection
            3. Create and Execute statement
            4. Process the result
            5. Close

        */

        // 2. Load, register and create connection
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "P@ssw0rd";

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");

        // 3. Create and Execute statement
        Statement st = con.createStatement();
            // General query
             String query = "SELECT * FROM test.new_table;";
             ResultSet rs = st.executeQuery(query);

            // Inserting -> General query
            // String query = "insert into new_table values (" + 2 + ", " + "'Sai'" + ", " + 24 + ");";
            // st.execute(query);

            // Inseting -> Prepare statement
//            String query = "insert into new_table values(?,?,?)";
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setInt(1, 3);
//            ps.setString(2, "Yamuna");
//            ps.setInt(3, 23);
//            ps.execute();


        // 4. Process the result
        while(rs.next()) {
            System.out.println("Name: " + rs.getString("name"));

        }

        // 5. Close
        con.close();
        System.out.println("Connection closed");

    }
}