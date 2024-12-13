public class Silla
{
    private int patas;
    private Color Color;

    public Silla(Color Color, int patas)
    {
        this.patas=patas;
        this.Color= Color;
    }
    public  String toString()
    {
        String salida = "tiene " + patas + " patas y color " + Color;
        return salida;
    }
}