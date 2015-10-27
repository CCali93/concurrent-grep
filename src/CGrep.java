import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
            String regex = args[0];
            ExecutorService grepPool = Executors.newCachedThreadPool();

            if (args.length >= 2) {
                //Files are the input, loop through files
            } else {
                //Take input from stdin
            }
        }

        System.out.println("Hello World");
    }
}
