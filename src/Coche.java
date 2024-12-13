public class Coche
{
    private String color;
    private String modelo;
    private int velocidad;





    public Coche (String color, String modelo)
    {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
    }


    public int acelerar()
    {
        this.velocidad +=10;
        return this.velocidad;
    }






    public int frenar()
    {
        this.velocidad-=10;
        if(this.velocidad<0)
        {
            this.velocidad=0;
        }
        return this.velocidad;
    }






    public void parar()
    {
        this.velocidad = 0;
    }

    public int getvelocidad()
    {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;
    }
}


