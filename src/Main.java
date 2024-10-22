import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Alege modul\n1 - FIFO\n2 - LIFO\n: ");
        int mod = scanner.nextInt();
        System.out.print("Cuantumul de timp: ");
        int cuantum = scanner.nextInt();
        System.out.print("Numarul de procese: ");
        int n = scanner.nextInt();

        Proces[] procese = new Proces[n];
        for (int i = 0; i < procese.length; i++) {
            procese[i] = new Proces();
            procese[i].citire();
        }

        for (Proces proces : procese) {
            proces.afisare();
        }

        if (mod == 1) {
            FIFO fifo = new FIFO(cuantum);
            fifo.executare(procese);
        }

        if (mod == 2) {
            LIFO lifo = new LIFO(cuantum);
            lifo.executare(procese);
        }
    }
}