import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
        System.out.println("Unesite vrednost promenljive: ");
        int promenljiva = scn.nextInt();
        if(promenljiva%2==0){
            System.out.println("Promenljiva je parna");
        } else {
            System.out.println("Promenljiva nije parna");
        }
    }
}
