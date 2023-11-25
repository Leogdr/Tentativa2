package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Salvar {
    public void persistir(String info) {
        String arquivo = "usuarios.txt"; 

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            writer.write(info); 
            writer.newLine(); 
            System.out.println("ESCRITO");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}
