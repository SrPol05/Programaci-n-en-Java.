import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class usoprac

{
    public static void main(String []args)
    {

        prac[] Personas = new prac[10];
        Personas[0] = new prac("pepe", 34);
        Personas[1] = new prac("adolf", 23);
        Personas[2] = new prac("joseph", 23);
        Personas[3] = new prac("benito", 45);
        Personas[4] = new prac("francisco", 43);
        Personas[5] = new prac("pedro", 34);
        Personas[6] = new prac("kim", 24);
        Personas[7] = new prac("fernando", 33);


        System.out.println("se presentan todos");

        try
        {
            for (prac p : Personas)
            {
                p.present();
            }
        }
        catch (NullPointerException e)
            {
                System.out.println("no hay gente");
            }
    }
}
