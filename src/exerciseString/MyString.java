package exerciseString;

import java.lang.reflect.Array;

public class MyString {
    public void string(String str) {
        String st = new String();
    }

    public static int sumAcii(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += string.charAt(i);
        }
        System.out.println(sum);
        return sum;
    }

    public static int sumNumberOfString(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum + c - '0';
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int valueAscii(String string) {
        int ascii = string.charAt(0);
        for (int i = 0; i < string.length() - 1; i++) {
            ascii = string.charAt(i);
        }
        System.out.println(ascii);
        return ascii;
    }
    public static void asendingValue() {}
}
