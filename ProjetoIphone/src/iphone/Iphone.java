public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private String modelo;
    private String cor;
    private String capacidadeArmazenamento;
    private String sistemaOperacional;

    public Iphone(String modelo, String cor, String capacidadeArmazenamento, String sistemaOperacional) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + "...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
