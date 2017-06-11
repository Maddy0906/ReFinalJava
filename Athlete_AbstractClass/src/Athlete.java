/**
 * Created by madoka on 2017/06/07.
 */
public abstract class Athlete {
    private String name;
    private String sport;
    private int score;

    public Athlete(String name, String sport){
        this.name = name;
        this.sport = sport;
    }

    /**
     * return the name of athlete
     */

    public String getName(){
        return name;
    }

    public String getSport() {
        return sport;
    }


/**   This method is an abstract method to return the number of points.
 *    sometimes called runs, strokes, goals etc.
 *    depending on the sport.)
 *   Points are determained by using score type of the sport and sometimes the second score parameter (if necessary for the sport)
 *    @param scoreType is the description of the type of score in the sport.
 *    @param scoreParm is a second parameter that is needed to determine the number of points in some sports.
 */

    public abstract int determinePoints(String scoreType, int scoreParm);

    public void updateScore(int points){
        //partA
        int score = 0;

        score += points;

        if(score < 0){
            score = 0;
            score = points;
        }

        return;

    }
    //


}



