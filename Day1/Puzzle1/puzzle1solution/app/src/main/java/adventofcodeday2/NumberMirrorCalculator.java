package adventofcodeday2;

public class numberMirrorCalculator {

    String range;

    private numberMirrorCalculator(){

    }

    public numberMirrorCalculator(String range){

        this.range = range;

    }

    private int[] separateRange(){

        String[] numberRange = range.split("-");

        int[] intNumberRange = new int[2];

        for(int i = 0; i < numberRange.length; i++){
            intNumberRange[i] = Integer.parseInt(numberRange[i]);
        }

        return intNumberRange;
    }

    private int parseHalf(int id){

        String idString = Integer.toString(id);

        int idLength = idString.length();

        int halfId = Integer.parseInt(idString.substring(0, idLength/2));

        return halfId;
    }

    public static void main(String[] args){

        numberMirrorCalculator mirrorCalculator = new numberMirrorCalculator("123123-123124");

        for(int range: mirrorCalculator.separateRange()){
            System.out.println(range);
        }

        
    }

}
