/**
 * Created by madoka on 2017/06/07.
 */
public class Golfer extends Athlete{
    private int stroke;

    public Golfer(String name, String sport, int stroke){
        super(name,sport);
        this.stroke = stroke;
    }

    /**
     * returns the number of strokes by using the score type and adding or
     * deducting strokes from par(second parameter) according to the following:
     * if the xcore type is:
     * eagle: subtract 2 from the par parameter
     * birdie : subtract1 from the par parameter
     * par: add zero to the par parameter
     * bogey: add 1 to the par parameter
     * double bogey: add 2 to the par parameter
     * triple bogey: add 3 to the par parameter
     * @param scoreType is the description of the type of score in the sport.
     * @param par is the number of storokes for par on the specified hole
     */
    public int determinePoints(String scoreType, int par){
        //to be implemented in part c

        switch (scoreType){
            case "eagle":
                stroke = par -2;
                break;
            case "birdie":
                stroke = par - 1;
                break;
            case "par":
                stroke = par + 0;
                break;
            case "bogey":
                stroke = par + 1;
                break;
            case "double bogey":
                stroke = par + 2;
                break;
            case "triple bogey":
                stroke = par + 3;
                break;
        }

        return stroke;
    }

    //instance variables, constructors, and other methods not shown

}
