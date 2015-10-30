import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Stores the search results
 * Created by curtis on 10/27/15.
 */
public class Found {
    private ArrayList<String> matchingLines;

    /**
     *
     */
    public Found() {
        matchingLines = new ArrayList<>();
    }

    /**
     *
     * @param line
     */
    public void addLine(String line) {
        matchingLines.add(line);
    }

    /**
     * Getter for matching lines
     *
     * @return the matching lines
     */
    public ArrayList<String> getMatchingLines() {
        return matchingLines;
    }


}
