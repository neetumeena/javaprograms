import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class GetUniversityList {


    public static void main(String[] args) {
//        getList();
//        assertJsonSchema();

        String abc = "bhjcgsgshdvhgvdgcvybn";

//        printRepeatingCharacters(abc);
        String str="I love My India";
        System.out.println(str.substring(3,11));

    }

    private static void printRepeatingCharacters(String abc) {
        int len = abc.length();

        int[] ch = new int[26];

        for (int i = 0; i < len; i++) {

            int index = abc.charAt(i) - 'a';
            ch[index] = ch[index] + 1;
        }

        for (int i = 0; i < 26; i++) {
            if (ch[i] > 1)
                System.out.println(abc.charAt('a' + i) + ch[i]);
        }

//        for (int i = 0; i < len - 1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < len; j++) {
//                if (abc.charAt(i) == abc.charAt(j))
//                    count++;
//            }
//            if (count > 1)
//                System.out.println(abc.charAt(i) + count);
//        }


    }

    private static void assertJsonSchema() {

        Response response = given().get("https://api.nationalize.io/?name=nathaniel");

        System.out.println(JsonSchemaValidator.matchesJsonSchema("src/test/resources/createUserJsonSchema.json"));


        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());


    }

    private static void getList() {

        Response response = given().get("http://universities.hipolabs.com/search?country=India");

//        System.out.println(response.prettyPrint());

        List<LinkedHashMap<String, Object>> list = response.jsonPath().get(".");

//        System.out.println(list.get(0).get("state-province"));
        List<String> universityList = new ArrayList<>();

        for (LinkedHashMap<String, Object> linkedHashMap : list) {
            if (Objects.equals(String.valueOf(linkedHashMap.get("state-province")), "Punjab"))
                universityList.add(linkedHashMap.get("name").toString());

        }

        for (String str : universityList)
            System.out.println(str);

    }
}
