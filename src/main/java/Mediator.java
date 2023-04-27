import java.util.ArrayList;
import java.util.List;
interface Mediator {
    void enviar(String mensagem, Destinatario destinatario);
    void adicionarDestinatario(Destinatario destinatario);
}