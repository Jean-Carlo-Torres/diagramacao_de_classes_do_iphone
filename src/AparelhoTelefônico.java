public interface AparelhoTelefônico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void enviarMensagem(String texto, String numero);
    void receberMensagem(String texto, String numero);
}

