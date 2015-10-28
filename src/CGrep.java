import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/**n
 * Created by curtis on 10/27/15.
 */
public class CGrep {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        //TODO: list of workers initialization

        if(args.length == 0) {
            System.out.println("ERROR! Must provide a regex pattern");
        } else {
            Pattern regex = Pattern.compile(args[0]);
            ExecutorService grepPool = Executors.newFixedThreadPool(3);
            ExecutorCompletionService<Found> completionPool =
                new ExecutorCompletionService<Found>(grepPool);

            if (args.length >= 2) {
                //Files are the input, loop through files
                for (int i = 1; i < args.length; i++) {

                }
            } else {
                //Take input from stdin
            }
        }

        System.out.println("Hello World");
    }
}
