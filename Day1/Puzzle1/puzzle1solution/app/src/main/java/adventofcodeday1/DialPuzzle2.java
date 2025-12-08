package adventofcodeday1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.math.*;

public class DialPuzzle2{

    DialPuzzle1 puzzle1Dial = new DialPuzzle1();
    private Queue<String[]> history = new LinkedList<String[]>();

    public DialPuzzle2(){

    }

    public int[] moveLeft(int startNumber, int moveNumber){
        // <-- 98, 99, 0 --> true to number line direction
        // Start 0, L1, final 99
        int endNumber;
        int passZero = 0;

        int[] result = new int[2];

        endNumber = puzzle1Dial.moveLeft(startNumber, moveNumber);

        result[1] = endNumber;

        int needToMoveToZero = startNumber;

        if(startNumber == moveNumber){
            passZero = 1;
        }

        if (startNumber == 0){

            if(moveNumber <= 99){
                passZero = 0;
            } else{
                passZero = moveNumber/100;
            }

            

        } else if(moveNumber > needToMoveToZero){

            passZero = ((moveNumber - needToMoveToZero) / 100) + 1;

        }

        result[0] = passZero;

        return result;

    }

    public int[] moveRight(int startNumber, int moveNumber){
        // <-- 0, 1, 2 --> true to number line direction
        // Start 0, R14, end 14
        int[] result = new int[2];

        int passZero = 0;

        int endNumber = puzzle1Dial.moveRight(startNumber, moveNumber);

        result[1] = endNumber;

        if (startNumber == 0){

            passZero = moveNumber / 100;

            result[0] = passZero;
        } else if(startNumber + moveNumber >= 100){

            int roundToZero = 100 - startNumber;

            passZero = ((moveNumber - roundToZero) / 100) + 1;

            result[0] = passZero;

        }

        return result;
    }

    private void modifyHistory (String newHistory, int result){

        if(this.history.size() == 5){
            this.history.remove();
        }

        String[] historyToAdd = {newHistory, Integer.toString(result)};

        this.history.add(historyToAdd);

    }

    public void printHistory(LinkedList<String> history){

        Iterator<String> historyIterator = history.iterator();

        while(historyIterator.hasNext()){

            System.out.println(historyIterator.next());

        }
    }

}