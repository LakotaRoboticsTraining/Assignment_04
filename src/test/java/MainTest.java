import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void challenge1_printsShooterStatus() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("shooter ready") || out.contains("spinning up"),
            "Challenge 1: print Shooter ready or Spinning up based on rpm.");
    }

    @Test
    void challenge2_printsAlliance() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("red") || out.contains("blue") || out.contains("unknown"),
            "Challenge 2: print Red, Blue, or Unknown.");
    }

    @Test
    void challenge3_printsFireOrWait() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("fire") || out.contains("wait"),
            "Challenge 3: print Fire or Wait based on hasNote && atSpeed.");
    }

    @Test
    void challenge4_printsSpeedLimitDecision() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("too fast") || out.contains("speed ok"),
            "Challenge 4: print Too fast or Speed OK.");
    }

    @Test
    void challenge5_printsTernarySpeedStatus() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("fast") || out.contains("slow"),
            "Challenge 5: ternary should print Fast or Slow.");
    }

    @Test
    void challenge6_printsModeFromSwitch() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("auton") || out.contains("teleop") || out.contains("disabled"),
            "Challenge 6: switch should print Auton, Teleop, or Disabled.");
    }

    private static String runMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(outputStream));
            Main.main(new String[] {});
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }
    }
}
