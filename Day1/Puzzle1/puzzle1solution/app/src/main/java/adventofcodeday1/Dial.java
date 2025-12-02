package adventofcodeday1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Dial{

    private Queue<String[]> history = new LinkedList<String[]>();

    public Dial(){

    }

    public int moveLeft(int startNumber, int moveNumber){

        int leftTurnSubtract = startNumber - moveNumber;

        if(leftTurnSubtract < 0){

            int leftTurnNumber = 0;
            leftTurnNumber = 99 - leftTurnSubtract;
            System.out.println("Left turn before 0: " + leftTurnNumber);
            return leftTurnNumber;

        } else {
            System.out.println("Left turn does not go past 0: " + leftTurnSubtract);
            return leftTurnSubtract;
        }
    }

    public int moveRight(int startNumber, int moveNumber){

        return (startNumber + moveNumber) % 99;

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