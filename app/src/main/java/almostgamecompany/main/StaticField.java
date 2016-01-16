package almostgamecompany.main;




import almostgamecompany.field.Field;
import almostgamecompany.form.Menu;
import almostgamecompany.numbersandnotonly.R;

public class StaticField {
    public static boolean pause = false;
    public static boolean combo = false;
    public static boolean start = true;
    public static int speed = 1500;
    public static final int StartSpeed = 1500;
    public static int record = 0;
    public static int sizeField = 5;
    public static Field field = new Field(sizeField);
    public static Menu menu;
    public static boolean enableSound = true;
    public static int soundImg = R.drawable.sound;

    public static int getSpeedInfo() {
        return 100 - (speed * 100) / StartSpeed;
    }
}
