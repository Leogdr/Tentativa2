package classes;

import java.util.List;

import utils.Dados;

public abstract class Usuario {
    String id;
    String nome; // 1
    String genero; // 3
    String cpf;
    String idade; // 4
    String cidade; // 5
    String estado_uf; // 6
    String telefone; // 7
    String tipo_usuario;
    
    public Usuario(String nome, String idade, String genero, String cpf,
                   String cidade, String estado_uf, String telefone, String tipo_usuario) {
                    
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cidade = cidade;
        this.estado_uf = estado_uf;
        this.telefone = telefone;
        this.tipo_usuario = tipo_usuario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado_uf() {
        return estado_uf;
    }

    public void setEstado_uf(String estado_uf) {
        this.estado_uf = estado_uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // metodos abstratos
    public void cadastrar(){};


    // gerar um id para cada usuario adicionado em usuarios.txt
    public static int gerarID(boolean cliente) {
        // pegar ultimo dado salvo no txt --> pegar utlimo da lista (id) --> transformar em String --> novo_id = id + 1;
        List<String[]> dados = Dados.ler();
        String[] ultimoArray = dados.get(dados.size() - 1); // utlimo array


        if(cliente) {
            // criando novo id para gerente
        
            String ultimoItem = ultimoArray[ultimoArray.length - 2].trim(); // ultimo item do penultimo array em String sem espaço
            int novo_id = Integer.parseInt(ultimoItem) + 1;
            
            return novo_id;
        } else {
            // criando novo id para gerente
        
            String penultimo = ultimoArray[ultimoArray.length - 1].trim(); // ultimo item do ultimo array em String sem espaço
            int novo_id = Integer.parseInt(penultimo) + 1;
            
            return novo_id;
        }
    }
}
