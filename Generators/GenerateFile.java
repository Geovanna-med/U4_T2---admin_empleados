package Generators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import interfaces.Storable;

public class GenerateFile {

    private String FileName = "Empleados.csv";

    public void WriteCSV(Storable info)
            throws IOException {
        String str = info.infoToStore(); // cambiar a el infotostore
        BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
        writer.write(str);

        writer.close();
    }

}
