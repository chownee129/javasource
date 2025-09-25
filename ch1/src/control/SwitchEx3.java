package control;

public class SwitchEx3 {
    public static void main(String[] args) {
        String str1 = "안녕하세요";

        String str2 = "안녕하세요";

        System.out.println(str1 == str2 ? "같다" : "다르다");

        String str3 = new String("안녕하세요");

        System.out.println(str1 == str3 ? "같다" : "다르다");

        System.out.println(str1.equals(str3) ? "같다" : "다르다");

        String str4 = "abc", str5 = "ABC";

        System.out.println(str4.equals(str5) ? " abc == ABC" : " !=");
        System.out.println(str4.equalsIgnoreCase(str5) ? " == " : "!=");

    }

}
