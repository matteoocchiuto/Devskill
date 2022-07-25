package school.devskill.GiocoDellOca.web.interfaces;

import school.devskill.GiocoDellOca.Eccezioni.GiocoInCorsoException;
import school.devskill.GiocoDellOca.web.command.InfoGiocatore;

public interface IGiocoController {
    String aggiungiGiocatore(InfoGiocatore i) throws GiocoInCorsoException;
    String reset();
    String statoPartita();
    String giocaTurno();
}
