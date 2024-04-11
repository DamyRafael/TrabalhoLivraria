
package Geral;
import java.util.Scanner;
import java.util.ArrayList;

public class Livraria {
    public static Scanner scan = new Scanner(System.in);
    private static ArrayList<Cliente> listarCliente = new ArrayList<Cliente>();
    private static ArrayList<Livro> listarLivros= new ArrayList<Livro>();
    private static ArrayList<Livro> listarLivrosSelecionados = new ArrayList<Livro>();
    private static ArrayList<String> listarFormasPagamento = new ArrayList<String>();
    private static int idCliente = 0;
    private static boolean SairMenuGeral = false;
    private static boolean SairMenuCliente = false;
    public static void main(String[]args){
    CadastroLivro();
    MenuGeral();
    }
    public static void MenuCliente() {
        SairMenuCliente = false;
        System.out.println("O que deseja fazer?");
        System.out.println("0-Cadastrar\n1-Atualizar o cadastro\n2-sair");
        int recebevalor = scan.nextInt();
        Boolean escolheusair = false; 
    while(!escolheusair){
        switch (recebevalor)
        {
        case 0:
            CadastrarCliente();
            escolheusair = true;
            break;
        case 1:
            EditarCliente();
            escolheusair = true;
            break;
        case 2:
            escolheusair = true;
            System.out.println("Você escolheu sair, até mais");
            System.out.close();
            break;
        default:
            System.out.println("Digitou um número inválido");
            break;
            }

        }
    }
    public static void MenuGeral() {
        SairMenuGeral = false;
        System.out.println("O que deseja fazer?");
        System.out.println("0-Clientes\n1-Livros\n2-sair");
        int recebevalor = scan.nextInt();
        Boolean escolheusair = false; 
    while(!escolheusair){
        switch(recebevalor)
        {
        case 0:
            MenuCliente();
            break;
        case 1:
            MenuLivro();
            break;
        case 2:
            escolheusair = true;
            System.out.println("Você escolheu sair, até mais");
            System.out.close();
            break;
        default:
            System.out.println("Digitou um número inválido");
            break;
            }

        }
    }
    public static void MenuLivro() {
        System.out.println("O que deseja fazer?");
        System.out.println("0-Selecione o livro\n1-sair\n2-Listar livro");
        int recebevalor = scan.nextInt();
        Boolean escolheusair = false;
    while(!escolheusair){
        switch (recebevalor)
        {
        case 0:
            ProcessoCompraLivro();
            escolheusair = true;
            break;
        case 1:
            System.out.println("Você irá retornar para o menu anterior.");
            escolheusair = true;
            MenuGeral();
            break;
        case 2:
            ListarLivros();
            escolheusair = true;
            break;
        default:
            System.out.println("Digitou um número inválido");
            break;
            }
        }
    }
    public static void CadastrarCliente() {
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        System.out.println("Digite seu nome: ");
        String nomeCliente = scan.next(); 
        cliente.setNomeCliente(nomeCliente);
        
        System.out.println("Digite o nome da sua rua: ");
        String nomeRua = scan.next();
        endereco.setNomeRua(nomeRua); 
        
        System.out.println("Digite o número da sua casa: ");
        int numeroCasa = scan.nextInt();
        endereco.setNumeroCasa(numeroCasa);
        
        System.out.println("Digite o bairro que você mora: ");
        String bairro = scan.next();
        endereco.setBairro(bairro);
        
        System.out.println("Digite a cidade que você mora: ");
        String cidade = scan.next();
        endereco.setCidade(cidade);
        
        System.out.println("Digite o CEP da sua rua: ");
        String cep = scan.next();
        endereco.setCep(cep);
        
        System.out.println("Digite o estado que você mora: ");
        String estado = scan.next();
        endereco.setEstado(estado);
        
        System.out.println("Digite o país que você mora: ");
        String pais = scan.next();
        endereco.setPais(pais);
        cliente.setEndereco(endereco);
        
        System.out.println("Digite o seu CPF: ");
        String cpfCliente = scan.next();
        cliente.setCpfCliente(cpfCliente);
        
        System.out.println("Digite a sua idade: ");
        int idadeCliente = scan.nextInt();
        cliente.setIdadeCliente(idadeCliente);
        
        System.out.println("Digite o seu e-mail: ");
        String emailCliente = scan.next();
        cliente.setEmailCliente(emailCliente);
            
        System.out.println("Digite o seu telefone: ");
        String telefoneCliente = scan.next(); 
        cliente.setTelefoneCliente(telefoneCliente);
        
        idCliente = idCliente + 1; 
        cliente.setCodigoCliente(idCliente);
        listarCliente.add(cliente);
        System.out.println(cliente.toString());
    }
    
    public static void EditarCliente() {
       Endereco endereco = new Endereco();
       System.out.println("Selecione um cliente: ");
       int clienteId = scan.nextInt();
       var ClienteSelecionado = listarCliente.get(clienteId - 1);
       
       System.out.println("Digite seu nome: ");
        String nomeCliente = scan.next(); 
        ClienteSelecionado.setNomeCliente(nomeCliente);
        System.out.println("Você selecionou o cliente: "+ ClienteSelecionado.getNomeCliente());
        
        System.out.println("Digite o nome da sua rua: ");
        String nomeRua = scan.next();
        endereco.setNomeRua(nomeRua);
        
        System.out.println("Digite o número da sua casa: ");
        int numeroCasa = scan.nextInt();
        endereco.setNumeroCasa(numeroCasa);
        
        System.out.println("Digite o bairro que você mora: ");
        String bairro = scan.next();
        endereco.setBairro(bairro);
        
        System.out.println("Digite a cidade que você mora: ");
        String cidade = scan.next();
        endereco.setCidade(cidade);
        
        System.out.println("Digite o CEP da sua rua: ");
        String cep = scan.next();
        endereco.setCep(cep);
        
        System.out.println("Digite o estado que você mora: ");
        String estado = scan.next();
        endereco.setEstado(estado);
        
        System.out.println("Digite o país que você mora: ");
        String pais = scan.next();
        endereco.setPais(pais);
        ClienteSelecionado.setEndereco(endereco);
        
        System.out.println("Digite o seu CPF: ");
        String cpfCliente = scan.next();
        ClienteSelecionado.setCpfCliente(cpfCliente);
        
        System.out.println("Digite a sua idade: ");
        int idadeCliente = scan.nextInt();
        ClienteSelecionado.setIdadeCliente(idadeCliente);
        
        System.out.println("Digite o seu e-mail: ");
        String emailCliente = scan.next();
        ClienteSelecionado.setEmailCliente(emailCliente);
            
        System.out.println("Digite o seu telefone: ");
        String telefoneCliente = scan.next(); 
        ClienteSelecionado.setTelefoneCliente(telefoneCliente);
       
        System.out.println(ClienteSelecionado.toString());
    }
    public static void ListarLivros() {
        for (Livro index : listarLivros) {
            System.out.println(index.getIdLivro());
            System.out.println(index.getNomeLivro());
            System.out.println(index.getValorLivro());
            System.out.println(" ");
        }
    }
    
    public static void ListarCliente() {
        for (Cliente index : listarCliente) {
            System.out.println(index.getCodigoCliente());
            System.out.println(index.getCodigoCliente());
            System.out.println(index.getCodigoCliente());
            System.out.println(" ");
        }
    }
    public static void ProcessoCompraLivro() {
       Boolean escolheusair = true;
        
       System.out.println("Selecione um Livro: ");
       int CodigoLivro = scan.nextInt();
       var LivroSelecionado = listarLivros.get(CodigoLivro - 1);
       listarLivrosSelecionados.add(LivroSelecionado);
       System.out.println("Selecione a quantidade de livros: ");
       int qntdLivro = scan.nextInt();
       if(qntdLivro >= LivroSelecionado.getQntEstoqueLivro()){
           System.out.println("Não temos essa quantidade em estoque, temos somente: " + LivroSelecionado.getQntEstoqueLivro());
           return;
       }
       LivroSelecionado.setQntdLivroSelecionado(qntdLivro);
       System.out.println("Selecione o valor de desconto: ");
       int qntdDesconto = scan.nextInt();
       LivroSelecionado.setQntdDesconto(qntdDesconto);
       System.out.println(LivroSelecionado.toString());
       System.out.println("O que deseja fazer?");
       System.out.println("0-Continuar escolhendo livros \n1- Escolha a forma de pagamento \n2-sair");
       int recebevalor = scan.nextInt();
        
    while(!escolheusair){
        switch(recebevalor)
        {
        case 0:
            //escolheusair = false;
            break;
        case 1:
            escolheusair = true;
            break;
        default:
            System.out.println("Digitou um número inválido");
            break;
            }

        }
    var ValorTotal = 0.0;
    int TotalLivros = 0;
    for (Livro index : listarLivrosSelecionados) {
        var qntdLivroEstoque = index.getQntEstoqueLivro();
        index.setQntEstoqueLivro(qntdLivroEstoque - qntdLivro);
         ValorTotal = (index.getValorLivro() - index.getQntdDesconto()) * index.getQntdLivroSelecionado();
         TotalLivros += qntdLivro;
        }
    Venda venda = new Venda();
    
    System.out.println("Quantas formas de pagamento você deseja pagar? Aceitamos: Crédito, débito e PIX ");
    int QntdFormasPagamento = scan.nextInt();
    if(QntdFormasPagamento >= 1 ){
        for (int i = 0; i < QntdFormasPagamento; i++) 
        {
            System.out.println("Selecione quantas formas de pagamento!");
            String formaPagamento = scan.next();
            listarFormasPagamento.add(formaPagamento);
            venda.setFormaPagamento(listarFormasPagamento);
        }
    }
    venda.setValorPagar(ValorTotal);
    venda.setQntProdutos(TotalLivros);
    System.out.println(venda.toString());
    }
    
    public static void CadastroLivro() {
       Livro livro = new Livro();
       livro.setIdLivro(1);
       livro.setNomeLivro("Senhor dos Anéis ");
       livro.setAutorLivro("J. R. R. Tolkien");
       livro.setGeneroLivro("Literatura Fantástica");
       livro.setEditoraLivro("‎HarperCollins");
       livro.setAnoLancamentoLivro(1949);
       livro.setQntPaginasLivro(576);
       livro.setQntEstoqueLivro(70);
       livro.setValorLivro(41);
       
       listarLivros.add(livro);
       livro = new Livro();
       livro.setIdLivro(2);
       livro.setNomeLivro(" Harry potter e a Pedra Filosofal");
       livro.setAutorLivro(" J. K. Rowling");
       livro.setGeneroLivro(" Fantasia");
       livro.setEditoraLivro(" Bloomsbury Publishing Rocco Presença");
       livro.setAnoLancamentoLivro(1997);
       livro.setQntPaginasLivro(317);
       livro.setQntEstoqueLivro(80);
       livro.setValorLivro(50);
       
       listarLivros.add(livro);
       livro = new Livro();
       livro.setIdLivro(3);
       livro.setNomeLivro(" Passaro contra a vidraça");
       livro.setAutorLivro(" Giselda Laporta Nicolelis");
       livro.setGeneroLivro(" iteratura Infanto-Juvenil");
       livro.setEditoraLivro(" MODERNA");
       livro.setAnoLancamentoLivro(1992);
       livro.setQntPaginasLivro(103);
       livro.setQntEstoqueLivro(50);
       livro.setValorLivro(35);

    }
}
