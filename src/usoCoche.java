public class usoCoche
{
    public static void main(String[] args) {
        Coche antonio = new Coche("gris", "gt40");
        Coche felipeI = new Coche("rosa", "supra");
        Coche JuanAlberto = new Coche("negro", "seat 600");
        Coche felipeII = new Coche("verde", "opel corsa");


        antonio.acelerar();


        System.out.println("antonio va a: " + antonio.getvelocidad());



        antonio.frenar();

        System.out.println("velocidad de antonio " + antonio.getvelocidad());
    }
}
