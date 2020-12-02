import bullscows.Main;
import org.hyperskill.hstest.dynamic.input.DynamicTestingMethod;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BullsCowsTest extends StageTest<String> {
    @DynamicTestingMethod
    CheckResult test() {
        TestedProgram main = new TestedProgram(Main.class);

        boolean turn = false, answer = false;
        int turnsNumber = 0;

        String output = main.start(); // got a game log
        String[] reply = output.split("\n");

        if (reply.length == 0) {
            return CheckResult.wrong("Your output should not be empty!");
        }

        // started verifying process
        String item = reply[0];
        if (!item.contains("****") || item.contains("*****")) {
            return CheckResult.wrong("The first line has an incorrect format.");
        }

        for (int n = 1; n < reply.length - 1; n++) {
            if (reply[n].toLowerCase().startsWith("turn")) {
                if (turn || answer) {
                    return CheckResult.wrong("The order of the steps in the game is broken 1.");
                }
                turn = true;

            } else if (findFourDigitsWithRegExp(reply[n])) {
                if (!turn || answer) {
                    return CheckResult.wrong("The order of the steps in the game is broken 2.");
                }
                answer = true;
            } else if (findPairsOfBullsAndCows(reply[n])) {
                if (!turn || !answer) {
                    return CheckResult.wrong("The order of the steps in the game is broken 3.");
                }
                turn = false;
                answer = false;
                turnsNumber++;
            }
        }
        if (turnsNumber == 0) {
            return CheckResult.wrong("The game log should contain at least two turns.");
        }
        if (!findFourDigitsWithRegExp(reply[reply.length - 1])) {
            return CheckResult.wrong("The last string is incorrect.");
        }

        return CheckResult.correct();
    }

    boolean findFourDigitsWithRegExp(String userString) {
        Pattern fourDigitsPattern = Pattern.compile("\\b\\d{4}\\b");
        Matcher fourDigitsMatcher = fourDigitsPattern.matcher(userString);
        return fourDigitsMatcher.find();

    }

    boolean findPairsOfBullsAndCows(String userString) {
        Pattern pairPattern = Pattern.compile("(\\b\\d (cow|bull))|None\\b");
        Matcher pairMatcher = pairPattern.matcher(userString);
        return pairMatcher.find();
    }
}