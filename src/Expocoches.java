public class Expocoches {
    private int entradasPorVender;

    public Expocoches(int n) {

        entradasPorVender = n;
    }

    public int getEntradasPorVender() {

        return entradasPorVender;
    }



    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esta zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo quedan" + this.entradasPorVender + " entradas para esa zona. ");

        } else {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}
