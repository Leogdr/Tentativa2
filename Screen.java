import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import classes.Cliente;
import utils.Dados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen implements ActionListener {
    public static JTextField email;
    public static JTextField senha;
    public static JTextField nome;
    public static JTextField genero;
    public static JTextField cpf;
    public static JTextField idade;
    public static JTextField cidade;
    public static JTextField estado_uf;    
    public static JTextField telefone;    

    
    public static JLabel label_email;
    public static JLabel label_senha;

    public static JButton botao_entrar;
    public static JButton botao_cadastrar;
    public static JButton cadastrarButton;

    public static JFrame loginFrame;
    public static JFrame cadastroFrame;
    public static JFrame dashboardFrame;
    public static JFrame adminDashboFrame;

    public static JLabel statusLogin;
    public static JLabel statusCadastro;

    
    public static void Login() {
        JPanel panel = new JPanel(); // painel
        loginFrame = new JFrame(); // tela login

        loginFrame.setSize(400,400);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(null);


        // campo para email
        label_email = new JLabel("Email");
        label_email.setBounds(10, 20, 80, 25);

        email = new JTextField(20);
        email.setBounds(100,20,185,25);

        // campo para senha
        label_senha = new JLabel("Senha");
        label_senha.setBounds(10, 50, 80, 25);

        senha = new JTextField(20);
        senha.setBounds(100,50,185,25);

        // botoes
        botao_entrar = new JButton("Login");
        botao_entrar.setBounds(100, 80, 90, 25);
        botao_entrar.addActionListener(new Screen());;

        botao_cadastrar = new JButton("Cadastro");
        botao_cadastrar.setBounds(195, 80, 90, 25);
        botao_cadastrar.addActionListener(new Screen());;

        // status login
        statusLogin = new JLabel("");
        statusLogin.setBounds(10,110,300,25);

        // <--< ADICIONANDO >--> //
        loginFrame.add(panel);

        // inputs
        panel.add(label_email);
        panel.add(email);

        panel.add(label_senha);
        panel.add(senha);

        // botoes
        panel.add(botao_entrar);
        panel.add(botao_cadastrar);

        // status
        panel.add(statusLogin);

        // habilitando
        loginFrame.setVisible(true);

    }

    public static void Cadastro() {

        JPanel panel = new JPanel(); // painel
        cadastroFrame = new JFrame(); // tela login

        cadastroFrame.setSize(800,800);
        cadastroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(null);


        // campo para nome
        JLabel label_nome = new JLabel("Nome");
        label_nome.setBounds(10, 80, 80, 25);

        nome = new JTextField(20);
        nome.setBounds(100, 80, 185, 25);

        // campo para gênero
        JLabel label_genero = new JLabel("Gênero");
        label_genero.setBounds(10, 110, 80, 25);

        genero = new JTextField(20);
        genero.setBounds(100, 110, 185, 25);

        // campo para CPF
        JLabel label_cpf = new JLabel("CPF");
        label_cpf.setBounds(10, 140, 80, 25);

        cpf = new JTextField(20);
        cpf.setBounds(100, 140, 185, 25);

        // campo para idade
        JLabel label_idade = new JLabel("Idade");
        label_idade.setBounds(10, 170, 80, 25);

        idade = new JTextField(20);
        idade.setBounds(100, 170, 185, 25);

        // campo para cidade
        JLabel label_cidade = new JLabel("Cidade");
        label_cidade.setBounds(10, 200, 80, 25);

        cidade = new JTextField(20);
        cidade.setBounds(100, 200, 185, 25);

        // campo para Estado/UF
        JLabel label_estado_uf = new JLabel("Estado/UF");
        label_estado_uf.setBounds(10, 230, 80, 25);

        estado_uf = new JTextField(20);
        estado_uf.setBounds(100, 230, 185, 25);

        JLabel label_telefone = new JLabel("telefone");
        label_telefone.setBounds(10, 230, 80, 25);

        telefone = new JTextField(20);
        telefone.setBounds(100, 230, 185, 25);        

        // botão de cadastrar
        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(100, 260, 100, 25);


        // botao_cadastrar = new JButton("Cadastrar");
        // botao_cadastrar.setBounds(195, 80, 90, 25);
        cadastrarButton.addActionListener(new Screen());

        // status cadastro
        statusCadastro = new JLabel("");
        statusCadastro.setBounds(10,110,300,25);

        // <--< ADICIONANDO >--> //
        cadastroFrame.add(panel);

        // inputs
        panel.add(label_email);
        panel.add(email);

        panel.add(label_senha);
        panel.add(senha);

        panel.add(label_nome);
        panel.add(nome);
        
        panel.add(label_genero);
        panel.add(genero);
        
        panel.add(label_cpf);
        panel.add(cpf);
        
        panel.add(label_idade);
        panel.add(idade);
        
        panel.add(label_cidade);
        panel.add(cidade);
        
        panel.add(label_estado_uf);
        panel.add(estado_uf);
        
        // botao para cadastrar
        panel.add(cadastrarButton);

        // status
        panel.add(statusCadastro);

        // habilitando
        cadastroFrame.setVisible(true);
    }

    public static void Dashboard(String email) {
        String CREDITO = Dados.pegarCredito(email);
        String SALDO = Dados.pegarSaldo(email);


        JPanel panel = new JPanel(); // painel
        dashboardFrame = new JFrame(); // tela login

        dashboardFrame.setSize(400,400);
        dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(null);

        // <-- ADICIONANDO PAINEL -->
        dashboardFrame.add(panel);

        JLabel msg = new JLabel("Bem vindo!");
        msg.setBounds(100, 10, 100, 25);

        JLabel saldo = new JLabel("SALDO: R$"+SALDO+",00");
        saldo.setBounds(100, 30, 200, 25);

        JLabel credito = new JLabel("CREDITO: R$"+CREDITO+",00");
        credito.setBounds(100, 50, 200, 25);


        panel.add(msg);
        panel.add(saldo);
        panel.add(credito);
        
        dashboardFrame.setVisible(true);
    }

    
    public static void AdminDashboard() {
        JPanel panel = new JPanel(); // painel
        JFrame frame = new JFrame(); // tela login^

        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(null);

        JLabel dashboard = new JLabel("Bem vindo!");
        dashboard.setBounds(100, 260, 100, 25);

        panel.add(dashboard);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tipo = e.getActionCommand();

        System.out.println(tipo);


        switch (tipo) {
            case "Login":
                // verifica cadastro
                String EMAIL = email.getText();
                String SENHA = senha.getText();

                String info = Autentica.autentica(EMAIL,SENHA);

                if(info.equals("incorreto")) {
                    // label credenciais invalidas
                    statusLogin.setText("Credenciais inválidas");
                } 
                else if (info.equals("admin")) {
                    AdminDashboard();
                }

                else {
                    // label dashboard do usuario
                    if(cadastroFrame != null) {
                        cadastroFrame.setVisible(false);
                    }
                    if(loginFrame!= null) {
                        loginFrame.setVisible(false);
                    }
                    Dashboard(EMAIL);
                }

                break;

            case "Cadastro":
                // cadastro label
                loginFrame.setVisible(false);
                Cadastro();
                break;

            case "Cadastrar":

            System.out.println("AQUI");
            
                EMAIL = email.getText();
                SENHA = senha.getText();
                String NOME = nome.getText();
                String GENERO = genero.getText();
                String CPF = cpf.getText();
                String IDADE = idade.getText();
                String CIDADE = cidade.getText();
                String ESTADO_UF = estado_uf.getText();
                String TELEFONE = telefone.getText();
                
                Cliente cliente = new Cliente(NOME, IDADE, GENERO, CPF, CIDADE, ESTADO_UF, TELEFONE, EMAIL, SENHA);

                String existencia = Autentica.autentica(EMAIL);
                
                if(existencia.equals("nao_existente")) {
                    cliente.cadastrar();
                    cadastroFrame.setVisible(false);
                    Dashboard(EMAIL);
                } else {
                    statusCadastro.setText("Email já utilizado");
                }
                break;
        }

    }

    
    public static void main(String[] args) {
        Login();
    }
}
