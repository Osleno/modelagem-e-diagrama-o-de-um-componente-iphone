public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.ligar("(11)91458-5697");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica("Apenas mais uma dose");
        iphone.tocar(); 
        iphone.pausar();    
        iphone.exibirPagina("WWW.teste.com.br");
        iphone.adicionarNovaAba();    
        iphone.atualizarPagina();
    }
}
