package school.devskill.GiocoDellOca.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.GiocoDellOca.Eccezioni.GiocoInCorsoException;
import school.devskill.GiocoDellOca.Eccezioni.NoPlayersException;
import school.devskill.GiocoDellOca.ElementiDiGioco.Player;
import school.devskill.GiocoDellOca.service.interfaces.IBoardManager;
import school.devskill.GiocoDellOca.web.command.InfoGiocatore;
import school.devskill.GiocoDellOca.web.interfaces.IGiocoController;

@RestController
@RequestMapping("/oca/")
public class GiocoController implements IGiocoController {

    private final IBoardManager boardManager;
    private final ObjectMapper michael;

    @Autowired
    public GiocoController(IBoardManager boardManager, ObjectMapper michael) {
        this.boardManager = boardManager;
        this.michael = michael;
    }


    @PostMapping("aggiungiGiocatore")
    @Override
    public String aggiungiGiocatore(@RequestBody InfoGiocatore i)  {

        String message = "";

        try {
            boardManager.aggiungiGiocatore(michael.convertValue(i, Player.class));
            message="Giocatore aggiunto!";
        } catch (GiocoInCorsoException e) {
            e.printStackTrace();
            message=e.getMessage();
        }


        return message;
    }
    @PostMapping("reset")
    @Override
    public String reset() {
        String message="";
        try {
            boardManager.Reset();
            message= "Partita resettata correttamente!";
        } catch (NoPlayersException e) {
            e.printStackTrace();
            message=e.getMessage();
        }
        return message;
    }
    @GetMapping("statoPartita")
    @Override
    public String statoPartita() {
    return boardManager.statoPartita();
    }
    @PostMapping("giocaTurno")
    @Override
    public String giocaTurno() {
       String message="";
        try {
            message=  boardManager.giocaTurno();
        } catch (NoPlayersException e) {
            e.printStackTrace();
       message =e.getMessage();
        }
        return message;
    }
}
