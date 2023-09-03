public class Main {
    public static void main(String[] args) {

        iPhone meuiPhone = new iPhone("iPhone 20", "12345");

        meuiPhone.ligar();
        meuiPhone.fazerChamada("123-456-789");
        meuiPhone.receberChamada("987-654-321");
        meuiPhone.encerrarChamada();
        meuiPhone.enviarMensagem("Olá, como você está?", "555-555-555");
        meuiPhone.receberMensagem("Oi, estou bem, obrigado!", "555-555-555");
        meuiPhone.reproduzirMusica();
        meuiPhone.tocarMusica();
        meuiPhone.pausarMusica();
        meuiPhone.avançarMusica();
        meuiPhone.voltarMusica();
        meuiPhone.navegarInternet();
        meuiPhone.abrirNavegador();
        meuiPhone.navegarPagina("https://www.example.com");
        meuiPhone.voltarPagina();
        meuiPhone.avançarPagina();
        meuiPhone.fecharNavegador();
        meuiPhone.desligar();
    }
}
