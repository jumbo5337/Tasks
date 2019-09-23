package Tasks.Tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String string = "Hello world";

        char[] inputString = string.toCharArray();
        char[] reverseString = new char[inputString.length];

        for (int i=0; i<inputString.length; i++){
            reverseString[reverseString.length-i-1]= inputString[i];
        }

        String reverseString1 = new String(reverseString);

        System.out.println(reverseString1);


        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(string);

        stringBuffer.reverse();

        String s = stringBuffer.toString();

        System.out.println(s);




    }



}
