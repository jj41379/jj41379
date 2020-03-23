import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie2 {
    public static void main(String[] args) {
        Map<String, Teacher> nauczyciele = new HashMap<>();
        nauczyciele.put("programowanie", new Teacher("Andrzej", "Nowak", "anrzej@nowak.pl", "programowanie"));
        nauczyciele.put("wychowanie fizyczne", new Teacher("Stefan", "Ryba", "stefan@nauczyciel.pl", "wychowanie fizyczne"));
        nauczyciele.put("programowanie obiektowe", new Teacher("Wieslaw", "Kot", "wieslaw@kot.pl", "programowanie obiektowe"));
        nauczyciele.put("wstep do programowania", new Teacher("Gabriel", "Orzech", "gabriel@gabriel.pl", "wstęp do programowania"));

        System.out.println(nauczyciele.get("programowanie obiektowe"));

        List<Student> grupa30 = new ArrayList<>();
        List<Student> grupa31 = new ArrayList<>();
        List<Student> grupa32 = new ArrayList<>();

        grupa30.add(new Student("Andrzej", "Kowalski", "andrzej@kowalski.pl", "30"));
        grupa30.add(new Student("Bartosz", "Nowak", "bartosz@nowak.pl", "30"));
        grupa30.add(new Student("Mateusz", "Orzech", "mateusz@orzech.pl", "30"));

        grupa31.add(new Student("Hubert", "Grabowski", "hubert@grabowski.pl", "31"));
        grupa31.add(new Student("Jedrzej", "Ziemniak", "jedrzej@ziemniak.pl", "31"));
        grupa31.add(new Student("Jakub", "Rudzik", "jakub@rudzik.pl", "31"));

        grupa32.add(new Student("Ireneusz", "Kot", "ireneusz@kot.pl", "32"));
        grupa32.add(new Student("Tomasz", "Ser", "tomasz@ser.pl", "32"));
        grupa32.add(new Student("Maciej", "Nowacki", "maciej@nowacki.pl", "32"));

        Map<String, List<Student>> grupy = new HashMap<>();
        grupy.put("30", grupa30);
        grupy.put("31", grupa31);
        grupy.put("32", grupa32);

        System.out.println(grupy.get("32"));

    }
}
