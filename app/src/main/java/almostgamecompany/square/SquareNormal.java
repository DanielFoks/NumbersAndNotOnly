package almostgamecompany.square;


import java.util.Date;

import almostgamecompany.main.StaticField;
import almostgamecompany.numbersandnotonly.R;
import almostgamecompany.other.Points;
import almostgamecompany.other.Position;
import almostgamecompany.other.Sound;

public class SquareNormal extends Square {
    public SquareNormal(Position pos, int time) {
        super(pos, time);
    }

    public SquareNormal(Position pos, int time, int minPoint, int maxPoint) {
        super(pos, time, minPoint, maxPoint);
    }

    public String getString() {
        return String.valueOf(getPoint());
    }

    public void press() {
        Date currTime = new Date();
        long delay = StaticField.speed - (currTime.getTime() - date.getTime());
        StaticField.field.timerMainEditTime(10, delay);
        Sound.playSound(R.raw.normal);
        Points.addPoints(getPoint());
    }

    public void remove() {
        if (getPoint() > 0) {
            Points.addPoints(-getPoint());
            Points.setX(1);
        }
    }

    @Override
    public void icon() {
        icon = R.drawable.squarenormal;
    }
}
