package school.devskill.GiocoDellOca.Eccezioni;

public class NoPlayersException extends Exception {
    public NoPlayersException() {
        super("Non ci sono Giocatori in partita!");
    }
}
