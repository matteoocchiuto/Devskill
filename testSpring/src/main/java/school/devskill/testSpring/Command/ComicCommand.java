package school.devskill.testSpring.Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComicCommand {
    private String name;
    private String description;
    private String type;
    private AuthorCommand author;
    private CategoryCommand category;
    private String photo;
}
