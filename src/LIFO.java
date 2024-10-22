public class LIFO extends Proces {
    public static int cuantumTimp;

    public LIFO(int cuantumTimp) {
        this.cuantumTimp = cuantumTimp;
    }

    public void executare(Proces[] procese) {
        boolean proceseNeexecutate = true;
        while (proceseNeexecutate) {
            proceseNeexecutate = false;
            for (int i = procese.length - 1; i >= 0; i--) {
                Proces proces = procese[i];
                if (proces.timpRamas > 0) {
                    proceseNeexecutate = true;
                    proces.executare(cuantumTimp);
                }
            }
        }
    }
}
