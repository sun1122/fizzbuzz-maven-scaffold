/**
 * @author flysun55
 * @date 2019/12/28
 */
public class Area {

    private int width;
    private int hight;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Area(int width, int hight) {

        this.width = width;
        this.hight = hight;
    }

    public static boolean containWiths(int width, Area area) {
        boolean contains = true;
        if (width > area.getWidth()) {
            contains = false;
        }
        return contains;
    }




}
