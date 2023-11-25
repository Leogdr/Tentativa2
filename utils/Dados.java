package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static List<String[]> ler() {

        List<String[]> data = new ArrayList<>();

        String arquivo = "usuarios.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                data.add(partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Converter a lista de arrays em uma matriz bidimensional.
        String[][] matriz = new String[data.size()][];
        data.toArray(matriz);
        
        return data;
    }

    public static String pegarSaldo(String email) {
        List<String[]> dados = Dados.ler();
        String saldo = "0";

        for (String[] usuario : dados) {
            if (usuario[0].equals(email)) {
                saldo = usuario[8];
            }
        }

        return saldo;
    }
    public static String pegarCredito(String email) {
        List<String[]> dados = Dados.ler();

        String credito = "0";
        
        for (String[] usuario : dados) {
            if (usuario[0].equals(email)) {
                credito = usuario[9];
            }
        }
        return credito;
    }   
 
}