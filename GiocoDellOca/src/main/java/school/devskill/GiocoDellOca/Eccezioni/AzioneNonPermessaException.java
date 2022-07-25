package school.devskill.GiocoDellOca.Eccezioni;

public class AzioneNonPermessaException extends RuntimeException{
    public AzioneNonPermessaException(){

        super("Azione non permessa!");
    }
}
