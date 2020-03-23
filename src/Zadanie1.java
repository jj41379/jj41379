import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Zadanie1 {

    public static void main(String[] args) {
        Set<String> zbiorDniHashSet = new HashSet<>();//Nie ma porzadku
        zbiorDniHashSet.add("poniedzialek");
        zbiorDniHashSet.add("wtorek");
        zbiorDniHashSet.add("sroda");
        zbiorDniHashSet.add("czwartek");
        zbiorDniHashSet.add("piatek");
        zbiorDniHashSet.add("sobota");
        zbiorDniHashSet.add("niedziela");

        System.out.println(zbiorDniHashSet);

        Set<String> zbiorDniTreeSet = new TreeSet<>();// Porzadek alfabetyczny
        zbiorDniTreeSet.add("poniedzialek");
        zbiorDniTreeSet.add("wtorek");
        zbiorDniTreeSet.add("sroda");
        zbiorDniTreeSet.add("czwartek");
        zbiorDniTreeSet.add("piatek");
        zbiorDniTreeSet.add("sobota");
        zbiorDniTreeSet.add("niedziela");

        System.out.println(zbiorDniTreeSet);
        //Zmiany byly potrzebne tylko w jendym miejscu (miejsce tworzenia obiektu)
    }
    //Z nazw implementacji zbiorow wnioskuje ze do przechowywania danych wykorzystuja one strukture drzewiasta(zbior TreeSet) oraz mape hashujaca (HashSet)
}
