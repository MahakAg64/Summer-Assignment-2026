package live;
import music.Playble;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playble p1 = new Veena();
        Playble p2 = new Saxophone();
        p1.play();
        p2.play();
    }
}
