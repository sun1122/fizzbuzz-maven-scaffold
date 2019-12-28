import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author flysun55
 * @date 2019/12/28
 */
public class MarsRoverTest {

    @Test
    public void should_land_the_rover_on_area() {
        // given
        Area area = new Area(10, 10);//
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        //when
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("55E");


    }

    @Test
    public void should_move_forward_when_direction_to_east() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5,Rover.EAST );
        //when
        rover.move();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("65E");

    }

    @Test
    public void should_move_forward_when_direction_to_west() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5,Rover.WEST);
        //when
        rover.move();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("45E");

    }

    @Test
    public void should_move_forward_when_direction_to_north() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5,Rover.NORTH );
        //when
        rover.move();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("56N");

    }
    @Test
    public void should_move_forward_when_direction_to_sorth() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, Rover.SOUTH);
        //when
        rover.move();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("54S");

    }

    @Test
    public void should_turn_left() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, Rover.EAST);
        //when
        rover.turnLeft();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("55N");

    }

    @Test
    public void should_turn_right() {
        // given
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, Rover.EAST);
        //when
        rover.turnRight();
        String position = rover.getPosition();
        //then
        assertThat(position).isEqualTo("55S");

    }


    @Test
    public void should_excute_batch_commands() {

        Rover rover = new Rover();
        RoverController roverController = new RoverController(rover);
        String mission ="10,10,5,5,E,M,L,M";
        String position = roverController.excute(mission);
        //then
        assertThat(position).isEqualTo("66N");

    }
}
