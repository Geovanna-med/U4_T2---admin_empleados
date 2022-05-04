import java.io.IOException;

import Generators.GenerateFile;
import Generators.GeneratePDF;
import interfaces.Printable;
import models.Empleado;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1, "Geyo", "De la cruz", 3000);

        GenerateFile file = new GenerateFile();

        try {
            file.WriteCSV(empleado1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        GeneratePDF pdf = new GeneratePDF();

        pdf.writePDF(empleado1);

    }
}