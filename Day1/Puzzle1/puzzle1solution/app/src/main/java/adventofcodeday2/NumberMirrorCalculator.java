package adventofcodeday2;

public class NumberMirrorCalculator {

    String range;

    private NumberMirrorCalculator(){

    }

    public NumberMirrorCalculator(String range){

        this.range = range;

    }

    public String[] separateRange(){

        return range.split("-");

    }

    public String parseSecondHalfOfId(String idString){

        int idLength = idString.length();

        return idString.substring(idLength/2);
    }


    public String parseFirstHalfOfId(String idString){

        int idLength = idString.length();

        return idString.substring(0, idLength/2);
    }

    public boolean isMirroredId(String idString){

        String firstHalf = parseFirstHalfOfId(idString);
        String secondHalf = parseSecondHalfOfId(idString);

        return firstHalf.equals(secondHalf);
    }

    public static void main(String[] args){

        NumberMirrorCalculator mirrorCalculator = new NumberMirrorCalculator("123123-123124");

        
    }

}
