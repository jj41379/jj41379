import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Product> produkty = new ArrayList<>();
        Set<String> kategorie = new HashSet<>();
        Map<Integer, Product> idProdukty = new HashMap<>();
        Map<String, List<Product>> kategoriaProdukty = new HashMap<>();
        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();

            while(s!=null) {
                String [] tab = s.split(";");
                produkty.add(new Product(Integer.parseInt(tab[0]), tab[1], tab[2], Double.parseDouble(tab[3])));
                kategorie.add(tab[2]);

                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for(Product produkt : produkty) {
            idProdukty.put(produkt.getId(), produkt);
        }

        for(String kategoria: kategorie) {
            List<Product> produktyKategorie = new ArrayList<>();
            for(Product produkt : produkty){
                if(produkt.getCategory().equals(kategoria)){
                    produktyKategorie.add(produkt);
                }
            }
            kategoriaProdukty.put(kategoria, produktyKategorie);
        }
        System.out.println("\n" + "Nazwa produktu o numerze id 109: " + idProdukty.get(109).getName() + "\n");
        System.out.println("Produkty z kategorii oprogramowanie:");
        for(Product produkt : kategoriaProdukty.get("oprogramowanie")){
            System.out.println(produkt.getName());
        }
    }
}
