import java.util.HashMap;
import java.util.Map;

public class TestPostApi {

    // string = my name is neetu. I love walmart and i want to in walmart;
    public static void main(String[] args) {

//        Response res = given().get("https://jsonplaceholder.typicode.com/posts");
//
//        List<Object> list= res.jsonPath().getList("");
//
//        System.out.println(list.size());


        String str = "my name is neetu. I love walmart and I want to in walmart my neetu";

        printDuplicate(str);


    }

    private static void printDuplicate(String str) {

        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strArr) {

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else
                map.put(s, 1);

        }

        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            if (map1.getValue() > 1) {
                System.out.println(map1.getKey() + " - " + map1.getValue());
            }
        }

        


    }
}
