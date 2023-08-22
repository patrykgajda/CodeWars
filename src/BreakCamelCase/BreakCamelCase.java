package BreakCamelCase;

import java.util.ArrayList;
import static java.lang.Character.isUpperCase;

public class BreakCamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("camelCase"));

    }
    public static String camelCase(String input) {

        ArrayList<Character> test = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            if (isUpperCase(input.charAt(i))){
                test.add(' ');
                test.add(input.charAt(i));
        } else {test.add(input.charAt(i));}
        }
        StringBuilder builder = new StringBuilder(test.size());
        for(Character ch: test)
        {
            builder.append(ch);
        }
        input = builder.toString();

        return input;
    }
}

