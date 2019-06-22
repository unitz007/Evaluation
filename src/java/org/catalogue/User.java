package org.catalogue;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;

@Named(value = "user")
@ApplicationScoped

public class User implements Serializable {

    String email;
    String password;
    String firstName;
    String lastName;
    String title;

    public String getFirstName() {
        String name = "";
        try {
            
            name =  rs.getString("firstname");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        String name = "";
        try {
            name =  rs.getString("lastname");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        String title = "";
        try {
            title =  rs.getString("title");
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    public User() {

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

    public void login() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/catalogue", "charles", "1993");
            String query = "SELECT * FROM CHARLES.USERS WHERE EMAIL= '" + email + "' AND PASSWORD='" + password + "'";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();

           rs.next(); 
                if (email.equals(rs.getString(4)) && password.equals(rs.getString(5))) {
                    
                    FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "profile.xhtml");
                } else {
                    FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "home.xhtml");
                }
            
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }

}
