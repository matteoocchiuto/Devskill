package school.devskill.GiocoDellOca.ElementiDiGioco;

import school.devskill.GiocoDellOca.Eccezioni.AzioneNonPermessaException;

public class CasellaStop implements ICasellaSpeciale {



    @Override
    public int calcolaPosizione(int posizioneGiocatore) {

        throw new AzioneNonPermessaException();
    }

}
