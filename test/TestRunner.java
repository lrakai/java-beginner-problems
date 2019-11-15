import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.IOException;

public class TestRunner {
    public static void main(String[] args) throws IOException {
        Class testClass = null;
        switch (args[0]) {
            case "1":
                testClass = ChallengeOneTest.class;
                break;
        
            default:
                throw new IOException("Invalid argument. Enter challenge number as the argument.");
        }
        Result result = JUnitCore.runClasses(testClass);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

        if(result.wasSuccessful())
            System.exit(0);
        else 
            System.exit(1);
    }
}