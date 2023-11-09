import java.util.ArrayList;
import java.util.List;

public class ListBeispiel {

  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();

    list.add("Hallo");
    list.add(42);
    list.add(3.14);
    list.add("Welt");
    list.add(42); // Duplikat wird hinzugefügt

    System.out.println("Inhalt der Liste:");
    for (Object obj : list) {
      System.out.println(obj);
    }
  }
}