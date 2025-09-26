package array;

import basic.string;

public class stringarr {
    public static void main(String[] args) {

        String arr[] = { "kim", "seo", "jin" };
        System.out.println(arr[0].charAt(2));

        // string => char 로 쪼개기 두가지방법

        String s = "abcde";

        for (int i = 0; i < s.length(); i++) {

            System.out.println(s.charAt(i));

        }

        char[] charr2 = s.toCharArray();

        // char 배열 => sting 으로 합치기
        char[] c = { 'a', 'b', 'c', 'd', 'e' };
        String arr2 = new String(c);
        System.out.println(arr2);

    }

}
