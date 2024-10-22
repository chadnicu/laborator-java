import java.util.Scanner;

public class Proces {
    int timpExecutie, timpRamas;
    protected String nume;

    public Proces() {
    }

    public void citire() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numele procesului: ");
        this.nume = scanner.nextLine();
        System.out.print("Introduceți timpul de execuție: ");
        this.timpExecutie = scanner.nextInt();
        this.timpRamas = this.timpExecutie;
    }

    public void afisare() {
        System.out.println("Proces " + nume + " - Timp Execuție: " + timpExecutie + ", Timp Rămas: " + timpRamas);
    }

    public void executare(int cuantum) {
        if (timpRamas > 0) {
            int timpExecutat = Math.min(timpRamas, cuantum);
            timpRamas -= timpExecutat;
            System.out.println("Executare proces " + nume + " timp " + timpExecutat + " unități.");

            if (timpRamas > 0) {
                System.out.println("Timp rămas pentru proces " + nume + ": " + timpRamas);
            } else {
                System.out.println("Procesul " + nume + " a fost complet executat.");
            }
        }
    }
}
