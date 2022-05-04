package Generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import interfaces.Printable;

public class GeneratePDF {

    public void writePDF(Printable informacion) {

        Document document = new Document();

        try {
            String path = new File(".").getCanonicalPath();
            String FILE_NAME = path + "/Empleados.pdf";

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            document.open();

            Paragraph paragraphinfo = new Paragraph();
            paragraphinfo.add(informacion.infoToPrint());
            paragraphinfo.setAlignment(Element.ALIGN_JUSTIFIED);

            document.add(paragraphinfo);

            document.close();

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
