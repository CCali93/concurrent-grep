import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by curtis on 10/27/15.
 */
public class TextExtractor implements Callable<Found> {
    private Pattern regex;
    private FileInputStream input;

    /**
     *
     * @param regex - the regular expression to search for
     * @param inputFile - Text file to scan
     * @throws FileNotFoundException
     */
    public TextExtractor(Pattern regex, File inputFile) throws FileNotFoundException {
        this.regex = regex;
        this.input = new FileInputStream(inputFile);
    }


    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public Found call() throws Exception {
        Found result = new Found();

        String currentLine;
        int lineCount = 1; // Current line number

        BufferedReader reader = new BufferedReader(new InputStreamReader(this.input));

        while ((currentLine = reader.readLine()) != null) {
            Matcher match = this.regex.matcher(currentLine);

            if (match.find()) {
                result.addLine(lineCount + " " + currentLine);
            }

            lineCount++;
        }

        reader.close();

        return result;
    }
}
