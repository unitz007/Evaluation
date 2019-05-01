package org.bcda.includes;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 * @author Dinneya Charles . C
 */
public class PdfReader {

    public PdfReader() throws IOException {
        File file = new File("C:/Personal/read.pdf");
        PDDocument d = PDDocument.load(file);
        
        PDFTextStripper pd = new PDFTextStripper();

        StringBuilder s = new StringBuilder();
        s.append(pd.getText(d));
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        
        try {
            PdfReader p = new PdfReader();
        } catch (IOException e) {
            System.err.println(e);
           
        }
    }
}