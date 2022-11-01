import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AREA area= new AREA();
        Scanner scanner=new Scanner(System.in);
        area.a= scanner.nextInt();
        area.b= scanner.nextInt();
        area.c= scanner.nextInt();
        System.out.print("по формуле Герона площадь равна = ");
        area.areaa();
    }
}