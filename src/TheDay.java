import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class TheDay {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu año, mes y dia de nacimiento en valores numericos:");
       int ye = sc.nextInt();
       int mo = sc.nextInt();
       int day = sc.nextInt();

        DayOfWeek dayweek = LocalDate.of(ye, mo, day).getDayOfWeek();
        System.out.println(dayweek);

        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(2005, 9, 30);
        long p2 = ChronoUnit.DAYS.between(birth,today);

        System.out.println("llevo " + p2 + " dias en este planeta");
    }
}
