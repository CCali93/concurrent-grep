import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.regex.Pattern;

/**
 * Implementation of the concurrent grep using Callables, Futures, and Executors
 * Created by curtis on 10/27/15.
 */
public class CGrep {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("ERROR! Must provide a regex pattern and at least 1 file");
        } else {
            Pattern regex = Pattern.compile(args[0]);
            ExecutorService grepPool = Executors.newFixedThreadPool(3);
            ExecutorCompletionService<Found> completionPool = new ExecutorCompletionService<Found>(grepPool);

            for (int i = 1; i < args.length; i++) { // Loop through files
                File file = new File(args[i]);
                try{
                    Callable<Found> extractor =  new TextExtractor(regex, file);
                    completionPool.submit(extractor);
                } catch (FileNotFoundException fnfe){
                    fnfe.printStackTrace();
                    System.err.println("File not found: " + file);
                }
            }

            for(int i = 0; i < args.length - 1; i++) {
                try {
                    Found found = completionPool.take().get();

                    for(String matchingLine : found.getMatchingLines()) {
                        System.out.println(matchingLine);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            grepPool.shutdown();
        }
    }
}
