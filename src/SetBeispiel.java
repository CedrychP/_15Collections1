import java.util.HashSet;
import java.util.Set;

public class SetBeispiel {

  public static void main(String[] args) {
    Set<Object> set = new HashSet<>();

    set.add("Hallo");
    set.add(42);
    set.add(3.14);
    set.add("Welt");
    set.add(42); // Duplikat wird nicht hinzugefügt

    System.out.println("Inhalt des Sets:");
    for (Object obj : set) {
      System.out.println(obj);
    }
  }
}