package common;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validate {

    public String checkInput(String s) {
        String str = "";
        while (str.isBlank() || str.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println(s + ": ");
            str = sc.nextLine();
        }
        return str;
    }
}
