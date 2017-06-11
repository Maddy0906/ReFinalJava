/**
 * Created by madoka on 2017/06/07.
 */
public class Quarterback extends Athlete {
    private int jerseyNumber;
    private double completionPercent;

        /*
        This constructor method acce@ts 4 parameters
        * @param name is the athlete's name
        * @param sport is the sport of the athlete
        * @param jerseyNum is the jersey number of the player
        * @param completion is the completion percentage pf the player
         */
        //Define the constructor method here

    public Quarterback(String name, String sport, int jerseyNumber,double completionPercent) {
        super(name,sport);
        this.jerseyNumber = jerseyNumber;
        this.completionPercent = completionPercent;
    }


    public int determinePoints(String scoreType, int scoreParm){
        // implementation
        return scoreParm;
    }

}
