package potato.prog.improvedspork.examples;

import java.util.Arrays;
import java.util.List;

public class ConvertStrings {

    public static void main(String[] args) {

        String str = "1, 2, 3, 4, 5, 6           , 7     , 8   ";
        String strReplace = str.replaceAll("\\s", "");
        System.out.println("**************************" + strReplace);
        String[] strArray = str.split(",");
        System.out.println("-------------------------------" + strArray);

        List<String> strArrayList = Arrays.asList(strReplace);
        System.out.println("List String ************* ::::" + strArrayList);
    }


}
