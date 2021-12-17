package Project3;

public class Tester {
    public static void main(String[] args) {
        Player play = new Player(10);
        Ladder ladder = new Ladder(5);
        int[][] laddercreate = ladder.createLadder();
        ladder.printLadderBlank();
        System.out.println("Lives Left: " + play.getLives());

    }

    public void Player(){
        int lives;
            Lives lives = new Lives(5);
    }
}
