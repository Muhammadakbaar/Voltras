import java.util.*;
import java.util.regex.*;

public class StringPickerTest {
    public static void main(String[] args) {
        String arg = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consectetur sagittis risus ${PRICE}, sed finibus ante ornare a. Donec a dolor ultricies, bibendum eros in ${Ticket 09}, commodo nibh. Morbi eget dui facilisis, imperdiet quam vitae, faucibus sem.";
        stringPicker(arg);
    }

    public static void stringPicker(String arg) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\$\\{([^}]+)\\}");
        Matcher matcher = pattern.matcher(arg);

        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        System.out.println(result);
    }
}