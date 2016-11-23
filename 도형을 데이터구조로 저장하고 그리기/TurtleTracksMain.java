import ch.aplu.turtle.*;
public class TurtleTracksMain{
    static void DrawSquare(double[][] tracks){
        Turtle T = new Turtle();
        T.penUp();
        T.moveTo(tracks[0][0],tracks[0][1]);
        T.penDown();
        for(int i=1;i<tracks.length;i++) {
            T.moveTo(tracks[i][0],tracks[i][1]);
           
    }
    public static void main(String[] args){
        double tracks[][]={{100,100},{200,100},{200,200},{100,200},{100,100}};
        DrawSquare(tracks);
    }
}