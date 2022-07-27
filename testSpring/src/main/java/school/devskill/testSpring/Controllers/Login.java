package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.testSpring.Command.LoginCommand;
import school.devskill.testSpring.DTO.UserDTO;

@RestController
@RequestMapping("login")
public class Login {
    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginCommand utente){
        UserDTO user = new UserDTO();
        user.setId(null);
        user.setName(null);
        user.setSurname(null);
        user.setEmail(utente.getEmail());
        return user;
    }
}
