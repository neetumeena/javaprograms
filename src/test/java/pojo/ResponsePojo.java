package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResponsePojo {

    List<String> web_pages;
    List<String> domains;
    String country;
    String alpha_two_code;
    String name;
    @JsonProperty("state-province")
    String state_province;


}
