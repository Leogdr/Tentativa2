package classes;

import utils.Salvar;

public class Gerente extends Usuario {

    public String email;
    public String senha;
    public Salvar salvar; // associacao entre classes

    public Gerente(String nome, String idade, String genero, String cpf,
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
        // ser usada ao criar novo gerente em interface grafica
    
        String infoCliente = this.getEmail() + "," + this.getSenha() + "," + this.getNome() + "," +
                this.getGenero() + "," + this.getCpf() + "," + this.getIdade() + "," +
                this.getCidade() + "," + this.getEstado_uf() + ",0,0,gerente,"+gerarID(false);
        
        salvar.persistir(infoCliente); 
    }
}
