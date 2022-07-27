package school.devskill.testSpring.Utility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HTTPUtilty {
    public static final String CREATE = "/create";
    public static final String DELETE = "/delete/{id}";
    public static final String UPDATE = "/update";
    public static final String GET = "/get/{id}";
    public static final String SEARCH = "/search";
}
