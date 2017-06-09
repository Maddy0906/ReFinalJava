import java.util.List;

/**
 * Created by madoka on 2017/06/07.
 */
public class Food {
    /*
    *Constructor method for food
    * @param foodType is the category of food
    * @param foodDesc is the description of the food
     */

    private String foodType;
    private String foodDesc;

    public Food(String foodType, String foodDesc){
        this.foodType = foodType;
        this.foodDesc = foodDesc;
    }

    /*
    *returns the category of the food
    */

    public String getFoodType(){
        //implementation not shown
        return foodType;
    }

    /*
    *returns the description of the food
     */

    public String getFoodDesc(){
        //implementation not shown
        return foodDesc;
    }
    //instance variables and other methods not shown
}



