import java.util.Arrays;

/**
 * Main class to exercise {@link ForLoopExamples}
 *
 * @author Mister PKI
 */
public class Main {

  final static String[] testValues = new String[]{"1", "2", "3", "4", "5"};

  public static void main(String[] args) {
    System.out.println("Executing for loop with array");
    ForLoopExamples.forLoop(testValues);

    System.out.println("Executing for loop with list");
    ForLoopExamples.forLoop(Arrays.asList(testValues));

    System.out.println("Executing for each with array");
    ForLoopExamples.forEach(testValues);

    System.out.println("Executing for each with list");
    ForLoopExamples.forEach(Arrays.asList(testValues));

    System.out.println("Executing for loop break");
    ForLoopExamples.forLoopBreak(testValues, "3");

    System.out.println("Executing for loop continue");
    ForLoopExamples.forLoopContinue(testValues, "3");

    System.out.println("Executing stream for each");
    ForLoopExamples.streamForEach(Arrays.asList(testValues));
  }
}
