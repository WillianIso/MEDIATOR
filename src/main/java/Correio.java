import java.util.ArrayList;
import java.util.List;
class Correio implements Mediator {
    private List<Destinatario> destinatarios;

    public Correio() {
        this.destinatarios = new ArrayList<>();
    }

    @Override
    public void enviar(String mensagem, Destinatario destinatario) {
        for (Destinatario d : destinatarios) {
            if (d != destinatario) {
                d.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void adicionarDestinatario(Destinatario destinatario) {
        this.destinatarios.add(destinatario);
    }
}