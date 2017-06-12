import java.util.ArrayList;
import java.util.List;

/**
 * Created by madoka on 2017/06/09.
 */
public class RoomMain {
    public static void main (String args[]){

        //Part B
        StandardRoom room01 = new StandardRoom(100, 2, true);
        System.out.println("PartB :"+room01.electricityOk());
        StandardRoom room02 = new StandardRoom(100, 1, true);
        System.out.println("PartB :"+room02.electricityOk());

        StandardRoom room03 = new StandardRoom(1000000, 1, true);

        //PartC
        LargeMeetingRoom bigRoom01 = new LargeMeetingRoom(100, 10, true);

        List<Room> rooms = new ArrayList<Room>();
        bigRoom01.addRoom(room01);
        bigRoom01.addRoom(room02);
        bigRoom01.addRoom(room03);

        System.out.print("PartC :"+bigRoom01.checkAdequateElect());

    }
}
