package adventofcodeday1;

public class DialPuzzle1{

    public DialPuzzle1(){

    }

    public int moveLeft(int startNumber, int moveNumber){

        int leftTurnSubtract = startNumber - moveNumber;

        if(leftTurnSubtract < 0){

            int leftTurnNumber = Math.abs((leftTurnSubtract) % 100);

            if (leftTurnNumber == 0) {

                return leftTurnNumber;
                
            } else {

                int leftTurnFinal = 100 - leftTurnNumber;

                //System.out.println("Left turn goes before 0: " + leftTurnFinal);

                return leftTurnFinal;

            }

        } else {
            //System.out.println("Left turn does not go past 0: " + leftTurnSubtract);
            return leftTurnSubtract;
        }
    }

    public int moveRight(int startNumber, int moveNumber){

        //System.out.println((startNumber + moveNumber) % 99);

        return (startNumber + moveNumber) % 100;

    }

}