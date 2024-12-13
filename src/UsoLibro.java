
public class UsoLibro
{
    public static void main(String[] args)
    {
        Persona autor = new Persona("Y. Daniel", "Liang");
        Fecha fechaEdicion = new Fecha("viernes 16 de noviembre de 2001");

        Libro libro = new Libro("Introduction to Java Programming", autor, "0-13-031997-X", 784, 3,
                "Prentice-Hall", "New Jersey", "USA", fechaEdicion)
        {
            @Override
            public void leerInformacion() {
                System.out.println("Leyendo información del libro...");
            }
        };


        libro.mostrarInformacion();
    }
}