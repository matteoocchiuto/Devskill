package school.devskill.GiocoDellOca.service.interfaces;

import school.devskill.GiocoDellOca.Eccezioni.GiocoInCorsoException;
import school.devskill.GiocoDellOca.Eccezioni.NoPlayersException;
import school.devskill.GiocoDellOca.ElementiDiGioco.Player;


public interface IBoardManager {

    void aggiungiGiocatore(Player p) throws GiocoInCorsoException;

    void Reset() throws NoPlayersException;

    String giocaTurno() throws NoPlayersException;

    String statoPartita();
}

