package Project3;

import java.util.ArrayList;

public class Ladder {
    public int panes;
    public int[][] ladder;
    public int turn = 1;

 
    
    public void actualLadder(){
        ArrayList<Ladder> list = new ArrayList<Ladder>();
        list.add( new Ladder(1,0));
        list.add(new Ladder(0,1));
    }
    public void printLadder(){
       try{ System.out.println("||||||----Start");
            for (int i = 0; i < ladder.length; i++){
                System.out.println("| |"+"||" +"| |");
                System.out.println();
            }
            System.out.println("||||||----Finish");
    } catch (Exception e){
        System.out.println("LADDER DOES NOT EXIST...");
    }
}
    public void printLadderBlank() {
    }
    public int[][] createLadder() {
        return createLadder();
    }
}
