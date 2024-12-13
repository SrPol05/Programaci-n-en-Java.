public class Fecha
{
    private String fecha;

    public Fecha(String fecha)
    {
        this.fecha = fecha;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return fecha;
    }
}