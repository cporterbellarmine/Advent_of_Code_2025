package adventofcodeday2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import adventofcodeday2.NumberMirrorCalculator;

public class NumberMirrorCalculatorTest {

    @Test void testRangeSeparation(){
        NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator("123123-123456");

        String[] actualRangeSeperation = numberMirrorCalculator.separateRange();

        String[] expectedRangeSeparation = {"123123", "123456"};

        assertArrayEquals(expectedRangeSeparation, actualRangeSeperation);
    }

    @Test void testFirstPartParse(){
        NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator("123123-123456");

        String actualFirstParse = numberMirrorCalculator.parseFirstHalfOfId("123456");

        String expectedFirstParse = "123";


        assertEquals(expectedFirstParse, actualFirstParse);
    }

    @Test void testSecondPartParse(){
        NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator("123123-123456");

        String actualSecondParse = numberMirrorCalculator.parseSecondHalfOfId("123456");

        String expectedSecondParse = "456";


        assertEquals(expectedSecondParse, actualSecondParse);
    }

    @Test void testIsMirroredIdTrue(){
        NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator("123123-123456");

        boolean actualIsMirrored = numberMirrorCalculator.isMirroredId("123123");

        boolean expectedIsMirrored = true;


        assertEquals(expectedIsMirrored, actualIsMirrored);
    }

    @Test void testIsMirroredIdFalse(){
        NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator("123123-123456");

        boolean actualIsMirrored = numberMirrorCalculator.isMirroredId("123456");

        boolean expectedIsMirrored = false;


        assertEquals(expectedIsMirrored, actualIsMirrored);
    }

}
