import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/**
 * Created by curtis on 10/27/15.
 */
public class TextExtractor implements Callable<Found> {
    private Pattern regex;
    private InputStream textInput;

    public TextExtractor() {

    }

    @Override
    public Found call() throws Exception {
        return null;
    }
}
