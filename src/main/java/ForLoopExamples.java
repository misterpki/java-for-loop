import java.util.List;

/**
 * Java for loop examples
 *
 * @author Mister PKI
 */
public final class ForLoopExamples {

  public static void forLoop(final String[] items) {
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i]);
    }
  }

  public static void forLoopBreak(final String[] items, final String match) {
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i]);
      if (items[i].equals(match)) {
        break;
      }
    }
  }

  public static void forLoopContinue(final String[] items, final String match) {
    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(match)) {
        continue;
      }
      System.out.println(items[i]);
    }
  }

  public static void forLoop(final List<String> items) {
    for (int i = 0; i < items.size(); i++) {
      System.out.println(items.get(i));
    }
  }

  public static void forEach(final String[] items) {
    for (String item: items) {
      System.out.println(item);
    }
  }

  public static void forEach(final List<String> items) {
    for (String item: items) {
      System.out.println(item);
    }
  }

  public static void streamForEach(final List<String> items) {
    items.forEach(System.out::println);
  }
}
