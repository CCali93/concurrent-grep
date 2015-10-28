import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by curtis on 10/27/15.
 */
public class Found {
    private ArrayList<String> matchingLines;

    public Found() {
        matchingLines = new ArrayList<String>();
    }

    public void addLine(String line) {
        matchingLines.add(line);
    }

    public Iterator<String> getIterator() {
        return matchingLines.iterator();
    }
}
