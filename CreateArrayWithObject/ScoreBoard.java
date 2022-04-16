import java.util.Arrays;

public class ScoreBoard {
    private int numEntries = 0; // number of actual entries
    private GameEntry[] board;
    
    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    // Attempt to add a new score to the collection (if it is high enough)
    public void add(GameEntry e){
        int newScore = e.getScore();
        //is the new entry e really a high score?
        if(numEntries<board.length || newScore>board[numEntries-1].getScore()){
            if(numEntries<board.length)
                numEntries++;
            // shift any lower scores rightward to make room for the new entry
            int j=numEntries-1;
            while(j>0 && board[j-1].getScore()<newScore){
                board[j]=board[j-1];
                j--;
            }
            board[j]=e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if(i<0 ||i>=numEntries) 
            throw new IndexOutOfBoundsException("Invalid index"+i);
        GameEntry temp=board[i];
        for(int j=i; j<numEntries-1;j++)
            board[j]=board[j+1];
        board[numEntries-1]=null;
        numEntries--;

        return temp;
    }

    public String showAll(){
        return Arrays.toString(board);
    }
    


    
}
