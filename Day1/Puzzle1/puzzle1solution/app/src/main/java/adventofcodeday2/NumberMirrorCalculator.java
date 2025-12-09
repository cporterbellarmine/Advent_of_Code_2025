package adventofcodeday2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberMirrorCalculator {

    public NumberMirrorCalculator() {

    }

    public String[] separateRange(String range) {

        return range.split("-");

    }

    public boolean isValidIdToTest(String idString) {
        return idString.length() % 2 == 0;
    }

    public String parseFirstHalfOfId(String idString) {

        int idLength = idString.length();

        return idString.substring(0, idLength / 2);
    }

    public String parseSecondHalfOfId(String idString) {

        int idLength = idString.length();

        return idString.substring(idLength / 2);
    }

    public boolean isMirroredId(String idString) {

        String firstHalf = parseFirstHalfOfId(idString);
        String secondHalf = parseSecondHalfOfId(idString);

        return firstHalf.equals(secondHalf);
    }

    public static void main(String[] args) {

        try (Scanner fileScanner = new Scanner(new File("Day1/Puzzle1/puzzle1solution/app/src/main/java/adventofcodeday2/input.txt"))) {

            long rangeSum = 0;

            while (fileScanner.hasNextLine()) {

                String providedRanges = fileScanner.nextLine();

                String[] providedRangesArray = providedRanges.split(",");

                NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator();

                for (String range : providedRangesArray) {

                    String[] seperatedRange = numberMirrorCalculator.separateRange(range);

                    System.out.println(range);

                    long range1 = Long.valueOf(seperatedRange[0]);
                    long range2 = Long.valueOf(seperatedRange[1]);

                    for (long i = range1; i <= range2; i++) {
                        String idString = Long.toString(i);

                        if (numberMirrorCalculator.isValidIdToTest(idString)) {

                            if (numberMirrorCalculator.isMirroredId(idString)) {
                                System.out.println(idString + " is True");
                                rangeSum = rangeSum + i;
                            } else {
                                //System.out.println(idString + " is False");
                            }
                        }

                    }

                }

            }

            System.out.println(rangeSum);

        } catch (FileNotFoundException e) {

            System.out.println(e);

        }

        // int mirroredSumCount = 0;
        // String range = "11-22";

        // NumberMirrorCalculator numberMirrorCalculator = new NumberMirrorCalculator();

        // String[] seperatedRange = numberMirrorCalculator.separateRange(range);

        // int range1 = Integer.parseInt(seperatedRange[0]);
        // int range2 = Integer.parseInt(seperatedRange[1]);

        // for (int i = range1; i <= range2; i++) {
        //     String idString = Integer.toString(i);

        //     if (numberMirrorCalculator.isValidIdToTest(idString)) {

        //         if (numberMirrorCalculator.isMirroredId(idString)) {
        //             System.out.println(idString + " is True");
        //             mirroredSumCount = mirroredSumCount + i;
        //         } else {
        //             System.out.println(idString + " is False");
        //         }
        //     }

        // }

        // System.out.println(mirroredSumCount);

    }

}
