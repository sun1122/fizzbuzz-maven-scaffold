/**
 * @author flysun55
 * @date 2019/12/28
 */
public class RoverController {
    private Rover rover;
    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String excute(String mission) {
        //String mission ="10,10,5,5,E,M,L,M";
        String[] commands = mission.split(",");
        int x = Integer.parseInt(commands[0]);
        int y = Integer.parseInt(commands[1]);
        int x1 = Integer.parseInt(commands[2]);
        int y1 = Integer.parseInt(commands[3]);
        String direction = commands[4];
        Area area = new Area(x,y);
        rover.land(area,x1,y1,direction);
        for (int i = 5; i < commands.length ; i++) {
            if(commands[i].equals("M")){
                rover.move();
            }
            if(commands[i].equals("L")){
                rover.turnLeft();
            }
        }



        return rover.getPosition();
    }
}
