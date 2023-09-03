// Importe as classes necessárias, se houver
// Importe as classes das interfaces ReprodutorMusical, AparelhoTelefônico e NavegadorInternet, se já estiverem definidas

public class iPhone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {
    private String modelo;
    private String númeroDeSérie;

    public iPhone(String modelo, String númeroDeSérie) {
        this.modelo = modelo;
        this.númeroDeSérie = númeroDeSérie;
    }

    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void enviarMensagem(String texto, String numero) {
        System.out.println("Enviando mensagem para " + numero + ": " + texto);
    }

    @Override
    public void receberMensagem(String texto, String numero) {
        System.out.println("Recebendo mensagem de " + numero + ": " + texto);
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void avançarMusica() {
        System.out.println("Avançando música...");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando música...");
    }

    @Override
    public void navegarInternet() {
        System.out.println("Navegando na internet...");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }

    @Override
    public void navegarPagina(String webpage) {
        System.out.println("Navegando para " + webpage + "...");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página...");
    }

    @Override
    public void avançarPagina() {
        System.out.println("Avançando página...");
    }
}
