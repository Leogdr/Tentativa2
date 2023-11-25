package classes;

import java.util.List;
import utils.Dados;

public class Conta extends Cliente {
    // persistir os objetos instanciados da classe Conta em persistencia de objetos

    String id_conta;
    String id_gerente; 
    String saldo;
    String credito;
    String ativa;


    public Conta(String nome, String idade, String genero, String cpf,
    String cidade, String estado_uf, String telefone, String email, String senha,
    String id_conta, String id_gerente, String saldo, String credito, String ativa) {

        super(nome, idade, genero, cpf, cidade, estado_uf, telefone, email, senha);
        
        this.id_conta = id_conta;
        this.id_gerente = id_gerente;
        this.saldo = saldo;
        this.credito = credito;
        this.ativa = ativa;
    }



    @Override
    public static void ver_dados_cadastrais(String id) {
        // ver dados referente a conta
        List<String[]> dados = Dados.ler();


    }


}
