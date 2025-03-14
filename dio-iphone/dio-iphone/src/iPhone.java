public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("Preto", 128, "Iphone 7");

        iphone1.exibirPagina("teste");
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();
        iphone1.ligar("123456789");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica("Música bem legal");
    }

    String cor;
    int capacidadeArmazenamento;
    String modelo;
    
    public iPhone(String cor, int capacidadeArmazenamento, String modelo) {
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.modelo = modelo;
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }
}
