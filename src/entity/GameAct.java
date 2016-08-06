package entity;

import java.awt.Point;

public class GameAct {
    private Point[] actPoint;
    
    public GameAct(){
        //TODO ≈‰÷√Œƒº˛
        actPoint = new Point[] {
                new Point(3,0),
                new Point(4,0),
                new Point(5,0),
                new Point(5,1),
        };
    }

    public Point[] getActPoint() {
        return actPoint;
    }

    public void setActPoint(Point[] actPoint) {
        this.actPoint = actPoint;
    }
    
    
}
