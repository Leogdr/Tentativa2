import java.util.List;
import utils.Dados;

public class Autentica {

    public static String autentica(String EMAIL, String SENHA) {

        if(EMAIL.equals("admin") & SENHA.equals("admin")) {
            return "admin";
        }

        List<String[]> dados = Dados.ler();
        
        for (String[] linha : dados) {
            String email = linha[0];
            String senha = linha[1];
    
            if (email.equals(EMAIL) && senha.equals(SENHA)) {
                return "correta";
            }
        }
    
        return "incorreto";
    }

    public static String autentica(String EMAIL) {
        List<String[]> dados = Dados.ler();

        for (String[] linha : dados) {
            String email = linha[1];
    
            if (email.equals(EMAIL)) {
                return "existente";
            }
        }         
        
        return "nao_existente";
    }
}
