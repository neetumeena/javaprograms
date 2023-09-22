package restassured.RequestPojos;

import lombok.Data;
import org.testng.annotations.DataProvider;

@Data
public class CreateUserPojo {
    private String name;
    private String job;
}
