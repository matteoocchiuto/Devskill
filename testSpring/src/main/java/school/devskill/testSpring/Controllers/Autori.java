package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Command.AuthorCommand;
import school.devskill.testSpring.DTO.AuthorDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("author")
public class Autori {

    @GetMapping(value = HTTPUtilty.GET)
    public AuthorDTO authorGet(@PathVariable Integer id){
        AuthorDTO author = new AuthorDTO();
        author.setId(id);
        author.setName(null);
        author.setSurname(null);
        return author;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public AuthorDTO authorCreate(@RequestBody AuthorCommand autore){
        AuthorDTO author = new AuthorDTO();
        author.setId(null);
        author.setName(autore.getName());
        author.setSurname(autore.getSurname());
        return author;
    }

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void authorUpdate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void authorDelete(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void authorSearch(){}

}
