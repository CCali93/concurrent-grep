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
        }

        System.out.println("Hello World");
    }
}
