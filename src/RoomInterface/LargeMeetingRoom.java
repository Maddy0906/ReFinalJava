package RoomInterface;

import java.util.List;

/**
 * Created by madoka on 2017/06/07.
 */
public class LargeMeetingRoom implements Room {
    private List<Room> rooms; //list of rooms combined to create this large meeting

    /**
     * returns the total number of floor-based electrical oulets
     * in the large meeting room
     */

    public int getNumOutlets(){
        //implementation not shown
    }

    /**
     * returns the square footage of the large meeting
     * room which is the total square footage from all
     * the rooms that comprise this large meeting room
     */
    public int sqFootage(){
        //implementation not shown
    }

    //Instance variables, constructors and some methods not shown
}
