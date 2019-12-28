/**
 * @author flysun55
 * @date 2019/12/28
 */
public class Rover {

    public static final String EAST="E";
    public static final String WEST="W";
    public static final String SOUTH="S";
    public static final String NORTH="N";

    private Area area;
    private int x;
    private int y;
    private String direction;

    public String getPosition() {

        return "" + x + y +direction ;
    }

    public void land(Area area, int x, int y, String direction) {
        //this.area = area;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {
       if(direction.equals(EAST)){//move e
           x+=1;
       } else if (direction.equals(WEST)){// move w
           x-=1;
       } else if (direction.equals(SOUTH)){// move s
           y-=1;
       } else if (direction.equals(NORTH)){// move n
           y+=1;
        }
    }

    public void turnLeft() {
        if(direction.equals(EAST)){
           direction = Rover.NORTH;
        } else if (direction.equals(NORTH)){
            direction = Rover.WEST;
        } else if (direction.equals(WEST)){
            direction = Rover.SOUTH;
        } else if (direction.equals(SOUTH)){
            direction = Rover.EAST;
        }
    }

    public void turnRight() {
        if(direction.equals(EAST)){
            direction = Rover.SOUTH;
        } else if (direction.equals(SOUTH)){
            direction = Rover.WEST;
        } else if (direction.equals(WEST)){
            direction = Rover.NORTH;
        } else if (direction.equals(NORTH)){
            direction = Rover.EAST;
        }
    }
}
