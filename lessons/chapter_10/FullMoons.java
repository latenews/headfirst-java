import java.util.*;
import static java.lang.System.out;

class FullMoons {
  public static void main (String [] args) {
    Calendar c = Calendar.getInstance();
    c.set(2004, 1, 7, 15, 40);
    out.println(String.format("full moon on %tc", c));
  }
}
