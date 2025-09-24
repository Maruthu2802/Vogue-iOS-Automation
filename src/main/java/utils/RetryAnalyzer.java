package utils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import static com.automate.pages.screenActions.ScreenActions.takeScreenshot;

public class RetryAnalyzer implements IRetryAnalyzer {
    private static final int maxRetryCount = 2; // max retries per test
    private final Map<String, Integer> retryCounts = new ConcurrentHashMap<>(); // track per test method

    @Override
    public boolean retry(ITestResult result) {
        String key = result.getMethod().getQualifiedName(); // unique identifier per test method
        int count = retryCounts.getOrDefault(key, 0);

        if (count < maxRetryCount) {
            count++;
            retryCounts.put(key, count);
            System.out.println("Retrying test " + result.getName() + " - Attempt " + count);
            takeScreenshot(result.getName());
            return true;
        }
        return false;
    }

}
