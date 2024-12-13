public class Nave
{
 private String name;
 private final int maxSpeed;

    public Nave (String name, int maxSpeed)
    {
        this.name=name;
        this.maxSpeed=maxSpeed;
    }

    public  String toString()
    {
            String salida = "Nombre: " + name + " velocidad crucero " + maxSpeed;
        return salida;
    }
}
