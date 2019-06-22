package org.catalogue;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Inject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Named(value = "excerpt")
@ApplicationScoped
public class Excerpt {

    String date;
    String title;
    String email;
    String content;

    public Excerpt() {
    }

    public String getDate() {
        Date date = new Date();
        
        return date.toString();
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Inject User user;
    public String getEmail() {
       return user.getEmail();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void insert() {
        ApplicationContext context = new ClassPathXmlApplicationContext("foo.xml");
        String s = (String)context.getBean("foo");
        s.chars();
    }

}
