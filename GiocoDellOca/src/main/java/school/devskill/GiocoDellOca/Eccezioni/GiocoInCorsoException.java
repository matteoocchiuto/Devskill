package school.devskill.GiocoDellOca.Eccezioni;

public class GiocoInCorsoException extends Exception {
    public GiocoInCorsoException() {
        super("Azione non permessa mentre il gioco è in esecuzione!");
    }
}
