public class DiceGame {
    protected Player p1;
    protected Player p2;
    public DiceGame (String Name_, String Name__) {
        p1=new Player("Player_01");
        p2=new Player("Player_02");
    }
    public void play(){
        p1.play();
        p2.play();
    }
    public Player getP1() {
        return p1;
    }
    public Player getP2() {
        return p2;
    }
    public void Battle() {






    }


}