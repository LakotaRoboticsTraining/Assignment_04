import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Challenge 1: shooter ready / spinning up")
    void challenge1_printsShooterStatus() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("shooter ready") || out.contains("spinning up"),
            "challenge1 failed - print \"Shooter ready\" or \"Spinning up\" based on rpm.");
    }

    @Test
    @DisplayName("Challenge 2: alliance color")
    void challenge2_printsAlliance() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("red") || out.contains("blue") || out.contains("unknown"),
            "challenge2 failed - print Red, Blue, or Unknown for the alliance.");
    }

    @Test
    @DisplayName("Challenge 3: fire or wait")
    void challenge3_printsFireOrWait() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("fire") || out.contains("wait"),
            "challenge3 failed - print Fire or Wait based on hasNote && atSpeed.");
    }

    @Test
    @DisplayName("Challenge 4: speed limit")
    void challenge4_printsSpeedLimitDecision() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("too fast") || out.contains("speed ok"),
            "challenge4 failed - print \"Too fast\" or \"Speed OK\" based on driveSpeed.");
    }

    @Test
    @DisplayName("Challenge 5: ternary Fast/Slow")
    void challenge5_printsTernarySpeedStatus() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("fast") || out.contains("slow"),
            "challenge5 failed - use a ternary and print Fast or Slow.");
    }

    @Test
    @DisplayName("Challenge 6: switch mode")
    void challenge6_printsModeFromSwitch() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("auton") || out.contains("teleop") || out.contains("disabled"),
            "challenge6 failed - switch should print Auton, Teleop, or Disabled.");
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
