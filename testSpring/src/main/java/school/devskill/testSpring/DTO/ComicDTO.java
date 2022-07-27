package school.devskill.testSpring.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import school.devskill.testSpring.Command.AuthorCommand;
import school.devskill.testSpring.Command.CategoryCommand;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComicDTO {
    private Integer id;
    private String name;
    private String description;
    private String type;
    private AuthorCommand author;
    private CategoryCommand category;
    private String photo;
}
