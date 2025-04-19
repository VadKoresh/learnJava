import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        while (true) {
            System.out.println("введи число:");
            int a = new Scanner(System.in).nextInt();
            int squaer =squaerNamber(a);
            if (a!=1316){
            System.out.println(a+ " в квадрате= "+squaer+ ", можно пробовать ещё:");
            }else {
                break;
            }
        }
    }
    public static int squaerNamber (int b){
        int squad = b * b;
        return squad;
    }
}