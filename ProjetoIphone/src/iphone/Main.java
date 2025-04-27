public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.ligar("(11)91659-8329");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica("Apenas mais uma dose");
        iphone.tocar(); 
        iphone.pausar();    
        iphone.exibirPagina();
        iphone.adicionarNovaAba();    
        iphone.atualizarPagina();
    }
}