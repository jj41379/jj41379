import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Zadanie1 {

    public static void main(String[] args) {
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");

        System.out.println(zbiorDni);
    }
}
