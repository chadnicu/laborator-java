import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Alege modul\n1 - FIFO\n2 - LIFO\n: ");
        int mod = scanner.nextInt();
        System.out.print("\nCuantumul de timp: ");
        int cuantum = scanner.nextInt();
        System.out.print("\nNumarul de procese: ");
        int n = scanner.nextInt();

        Proces[] procese = new Proces[n];
        for (int i = 0; i < procese.length; i++) {
            procese[i] = new Proces();
            procese[i].citire();
        }

        System.out.print("\nProcesul cel mai lung: ");
        Proces.longest(procese).afisare();

        System.out.print("\nProcesul cel mai scurt: ");
        Proces.shortest(procese).afisare();

        System.out.print("\nToate procesele: ");
        for (Proces proces : procese) {
            proces.afisare();
        }

        System.out.println("\n\nExecutarea " + (mod == 1 ? "LIFO" : "FIFO") + ":\n");

        if (mod == 1) {
            FIFO fifo = new FIFO(cuantum);
            fifo.executare(procese);
        }

        if (mod == 2) {
            LIFO lifo = new LIFO(cuantum);
            lifo.executare(procese);
        }

        System.out.println("\nFunctii inventate, creative si in care vad sens:");
        Proces.Inventeaza();
        Proces.FiiCreativ();
        Proces.VadSens();
    }
}