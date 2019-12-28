/**
 * @author flysun55
 * @date 2019/12/28
 */
public class Area {

    private int x;
    private int y;

    public Area(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public static boolean containWiths(int width, Area area) {
        boolean contains = true;
        if (width > area.getX()) {
            contains = false;
        }
        return contains;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }


}
