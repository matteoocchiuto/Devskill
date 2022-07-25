package school.devskill.GiocoDellOca.ElementiDiGioco;

import school.devskill.GiocoDellOca.Eccezioni.AzioneNonPermessaException;

public interface ICasellaSpeciale {


    int calcolaPosizione(int posizioneGiocatore) throws AzioneNonPermessaException;
}
