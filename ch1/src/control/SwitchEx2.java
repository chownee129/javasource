package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {

        System.out.println("가위 1 바위 2  보 3 : ");
        
        Scanner sc = new Scanner(System.in)
        int user = Integer.parseInt(sc.nextLine())       
        
        int com = ((int) Math.random() * 3 ) + 1

        switch (user - com) {
            case v:
                
                break;
        
            default:
                break;
        }


    }
}
