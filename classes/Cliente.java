package classes;

import java.util.List;

import utils.Dados;
import utils.Salvar;

public class Cliente extends Usuario {

    public String email;
    public String senha;
    public Salvar salvar; // associacao de classe

    public Cliente(String nome, String idade, String genero, String cpf,
                   String cidade, String estado_uf, String telefone, String email, String senha) {

        super(nome, idade, genero, cpf, cidade, estado_uf, telefone, "cliente");
        this.email = email;
        this.senha = senha;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public void cadastrar() {
        String infoCliente = this.getEmail() + "," + this.getSenha() + "," + this.getNome() + "," +
                this.getGenero() + "," + this.getCpf() + ", " + this.getIdade() + ", " +
                this.getCidade() + "," + this.getEstado_uf() + ",0,0,cliente," + gerarID(true);
        
        salvar.persistir(infoCliente); // associacao de classe
    }

    public static String ver_saldo(String email) {
        List<String[]> dados = Dados.ler();
        String saldo = "0";

        for (String[] usuario : dados) {
            if (usuario[0].equals(email)) {
                saldo = usuario[8];
            }
        }

        return saldo;
    }

    public static String ver_credito(String email) {
        List<String[]> dados = Dados.ler();

        String credito = "0";
        
        for (String[] usuario : dados) {
            if (usuario[0].equals(email)) {
                credito = usuario[9];
            }
        }
        return credito;
    }

    // sobreescrita de método (classe Conta esta sonbreescrevendo esse metodo)
    public static void ver_dados_cadastrais(String id) {
        // ver dados referente ao cliente

    }
}
