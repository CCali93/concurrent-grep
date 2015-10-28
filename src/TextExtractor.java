import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/**
 * Created by curtis on 10/27/15.
 */
public class TextExtractor implements Callable<Found> {
    private Pattern regex;
    private Scanner input;

    public TextExtractor(Pattern regex) {
        this.regex = regex;
        input = new Scanner(System.in);
    }

    public TextExtractor(Pattern regex, File inputFile) throws FileNotFoundException {
        this.regex = regex;
        input = new Scanner(inputFile);
    }

    @Override
    public Found call() throws Exception {
        return null;
    }
}
