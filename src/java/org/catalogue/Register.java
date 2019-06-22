package org.catalogue;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Register implements Serializable {

    String title;
    String firstName;
    String lastName;
    String email;
    String password;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    Connection con;

    public Register() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/catalogue", "charles", "1993");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insert() {
        try {

            String query = "INSERT INTO CHARLES.USERS (TITLE, FIRSTNAME, LASTNAME, EMAIL, PASSWORD) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt;
            stmt = con.prepareStatement(query);
            stmt.setString(1, getTitle());
            stmt.setString(2, getFirstName());
            stmt.setString(3, getLastName());
            stmt.setString(4, getEmail());
            stmt.setString(5, getPassword());

            stmt.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
