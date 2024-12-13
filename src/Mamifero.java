public class Mamifero extends Animal
{
    private String hairtype;
    public Mamifero (String hairtype, String name, String specie, int age)
    {
        //llama al constructor de la clase principal o al "super"
        super(name, specie, age);
        //nuevo constucto que SOLO pertenece a "Mamifero"
        this.hairtype = hairtype;
    }
}
