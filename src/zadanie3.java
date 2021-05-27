import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę, wszystko się zsumuje, jak wpiszesz 0 przestanę ");
        int y;
        y=0;
        while ((x = input.nextInt()) != 0){
            y=y+x;
            System.out.println("Podaj liczbę ");
        }
        System.out.println("Suma wszystkich podanych liczb to: " + y);
    }
    }
