/**
 * Created by madoka on 2017/06/08.
 */
public class Meal {

    private String mealDesc;
    private Food[] foods;

    /*
    *Constructor method for a meal
    * @param mealDesc is the text description of the meal
    * @param food is an array of food that make up the meal
     */
    public Meal(String mealDesc, Food[] foods) {
        this.mealDesc = mealDesc;
        this.foods = foods;
    }

        /*
        returns the description of the meal
         */

    public String getMealDesc() {
        return mealDesc;
    }

        /*
        returns an array of food prepared for the meal
        @return
         */

    public Food[] getFoods() {
        return foods;
    }

    /**
     * This Meal include foodDesc?
     *
     * @param foodDesc
     * @return
     */
    public boolean hasFood(String foodDesc) {
        for (int i = 0; i < foods.length; i++) {
            Food food = foods[i];
            if (food.getFoodDesc().equals(foodDesc)) {
                return true;
            }
        }
        return false;
    }




}