public class TesteCorreio {
    public static void main(String[] args) {
        Mediator correio = new Correio();

        Destinatario joao = new Usuario("João");
        Destinatario maria = new Usuario("Maria");
        Destinatario jose = new Usuario("José");

        correio.adicionarDestinatario(joao);
        correio.adicionarDestinatario(maria);
        correio.adicionarDestinatario(jose);

        joao.receberMensagem("Olá, pessoal!");
        maria.receberMensagem("Oi, João!");
        jose.receberMensagem("Tudo bem por aí?");

        correio.enviar("Vamos marcar uma reunião.", maria);
    }
}