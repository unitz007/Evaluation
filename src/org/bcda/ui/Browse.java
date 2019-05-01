package org.bcda.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class Browse extends JDialog {

    public Browse(JDialog parent, boolean modal, String frameTitle, String url) {
        super(parent, modal);

        JFXPanel fxPanel = new JFXPanel();

        Platform.runLater(() -> {
            WebView web = new WebView();
            fxPanel.setScene(new Scene(web));

            web.getEngine().load(url);

        });
        this.add(fxPanel, BorderLayout.CENTER);
        this.setTitle(frameTitle);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);

            }
        });
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}

