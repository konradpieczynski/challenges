package codewars.Kyu8;

public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append(str).reverse().toString();
    }
}
