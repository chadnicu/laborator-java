public class FIFO extends Proces {
    public static int cuantumTimp;

    public FIFO(int cuantumTimp) {
        this.cuantumTimp = cuantumTimp;
    }

    public void executare(Proces[] procese) {
        boolean proceseNeexecutate = true;
        while (proceseNeexecutate) {
            proceseNeexecutate = false;
            for (int i = 0; i < procese.length; i++) {
                Proces proces = procese[i];
                if (proces.timpRamas > 0) {
                    proceseNeexecutate = true;
                    proces.executare(cuantumTimp);
                }
            }
        }
    }
}
