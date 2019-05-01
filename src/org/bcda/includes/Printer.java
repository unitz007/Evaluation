package org.bcda.includes;

import com.sun.glass.ui.Screen;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Dinneya Charles
 */
public class Printer implements Printable {

    JFrame frame;

    public Printer(JFrame frame) {
        this.frame = frame;
    }

    public int print(Graphics g, PageFormat pf, int pageIndex)
            throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        frame.getGraphics();
        g = frame.getGraphics();

        return PAGE_EXISTS;

    }

    public void print() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printer(frame));
        Printer p = new Printer(frame);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (Exception e) {
                System.err.println(e);
            }

        } else {
            System.out.println("Coundnt print");
        }
    }

    public static void main(String[] args) throws IOException, AWTException {

    }

}


