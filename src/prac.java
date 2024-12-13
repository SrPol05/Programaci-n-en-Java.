/*Crea una clase Persona con los atributos nombre y edad. Agrega un método presentarse() que muestre un mensaje como
    "Hola, me llamo [nombre] y tengo [edad] años". Luego, crea varias instancias de Persona y llama al método
presentarse() en cada una.*/

public class prac
{
    private String nomb;
    private int edad;

    public prac(String nomb, int edad)
        {
            this.nomb = nomb;
            this.edad = edad;
        }

        public void present()
        {
            System.out.println("mi nombre es "+nomb+" tengo "+ edad + " años");
        }

}
