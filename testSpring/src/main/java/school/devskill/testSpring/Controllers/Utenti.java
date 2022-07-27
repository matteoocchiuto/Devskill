package school.devskill.testSpring.Controllers;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Command.UserCommand;
import school.devskill.testSpring.DTO.UserDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("user")
public class Utenti {

    @GetMapping(value = HTTPUtilty.GET)
    public UserDTO userGet(@PathVariable Integer id){
        UserDTO user = new UserDTO();
        user.setId(id);
        user.setName(null);
        user.setSurname(null);
        user.setEmail(null);
        user.setPassword(null);
        return user;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public UserDTO userCreate(@RequestBody UserCommand utente){
        UserDTO user = new UserDTO();
        user.setId(null);
        user.setName(utente.getName());
        user.setSurname(utente.getSurname());
        user.setEmail(utente.getEmail());
        user.setPassword(utente.getPassword());
        return user;
    }


    @PutMapping(value = HTTPUtilty.UPDATE)
    public void userUpdate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void userDelete(@PathVariable Integer id){
    }

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void userSearch(){}

}
