import java.util.ArrayList;
import java.util.List;

/**
 * Created by madoka on 2017/06/07.
 */
public class LargeMeetingRoom extends StandardRoom implements Room  {

    private List<Room> rooms;

    public LargeMeetingRoom(int sqFootage, int numOutlets, boolean electricityOk) {
        super(sqFootage, numOutlets, electricityOk);
        this.rooms =  new ArrayList<Room>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public boolean checkAdequateElect(){

        boolean result = true;
        int footage = 0;

        //Use standardRoom electricity OK
        for (int i = 0; i < rooms.size(); i++){
            //get each room from Room List
            Room room = rooms.get(i);

            footage += room.SqFootage();

            result = result && room.electricityOk();

        }

        //check this room
        result = result && (footage < 10000);

        return result;
    }


}
