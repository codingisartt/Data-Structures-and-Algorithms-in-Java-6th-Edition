import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameEntry game1=new GameEntry("Mike",100);
        GameEntry game2=new GameEntry("Michael",500);
        GameEntry game3=new GameEntry("Jane",1150);
        GameEntry game4=new GameEntry("Ahmet",2000);
        GameEntry game5=new GameEntry("Mehmet",750);

        ScoreBoard sb=new ScoreBoard(4);//[0 0 0 0]
        sb.add(game1);
        sb.add(game2);
        sb.add(game3);
        sb.add(game4);
        
        //ArrayList<GameEntry> game0=new ArrayList<>(); //similar logic
        //game0.add(game1);
        //System.out.println(game0.get(0));
        
        System.out.println(sb.showAll());
        sb.remove(0);
        System.out.println(sb.showAll());


    }
}
