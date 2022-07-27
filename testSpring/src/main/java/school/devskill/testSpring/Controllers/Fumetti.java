package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Command.ComicCommand;
import school.devskill.testSpring.DTO.ComicDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("comic")
public class Fumetti {

    @GetMapping(value = HTTPUtilty.GET)
    public ComicDTO comicGet(@PathVariable Integer id){
        ComicDTO comic = new ComicDTO();
        comic.setId(id);
        comic.setName(null);
        comic.setDescription(null);
        comic.setAuthor(null);
        comic.setCategory(null);
        comic.setPhoto(null);
        return comic;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public ComicDTO comicCreate(@RequestBody ComicCommand fumetto){
        ComicDTO comic = new ComicDTO();
        comic.setId(null);
        comic.setName(fumetto.getName());
        comic.setDescription(fumetto.getDescription());
        comic.setType(fumetto.getType());
        comic.setAuthor(fumetto.getAuthor());
        comic.setCategory(fumetto.getCategory());
        comic.setPhoto(fumetto.getPhoto());
        return comic;
    }

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void comicUpdate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void comicDelete(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void comicSearch(){}

}
