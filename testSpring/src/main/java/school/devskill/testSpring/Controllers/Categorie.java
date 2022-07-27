package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Command.CategoryCommand;
import school.devskill.testSpring.DTO.CategoryDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("category")
public class Categorie {

    @GetMapping(value = HTTPUtilty.GET)
    public CategoryDTO categoryGet(@PathVariable Integer id){
        CategoryDTO category = new CategoryDTO();
        category.setId(id);
        category.setName(null);
        category.setDescription(null);
        return category;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public CategoryDTO categoryCreate(@RequestBody CategoryCommand categoria){
        CategoryDTO category = new CategoryDTO();
        category.setId(null);
        category.setName(categoria.getName());
        category.setDescription(categoria.getDescription());
        return category;
    }

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void categoryUpdate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void categoryDelete(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void categorySearch(){}

}
