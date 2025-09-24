package utils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    static int counter = 0;

    @Test
    public void testThatFailsThenPasses() {
        counter++;
        System.out.println("Execution attempt: " + counter);
        if (counter < 2) {
            Assert.fail("Failing attempt " + counter);
        }
    }
}
