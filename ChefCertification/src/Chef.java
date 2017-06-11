import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by madoka on 2017/06/08.
 */
public class Chef {
    private String name; //name of the chef
    private int yearsExperience;
    private List<Meal> meals; //list of all meals prepared by chef. if the chef prepared the 20 times,
    //prepared the meal 20 times, the Meal will exist 20 times in this list
    private Meal mealCombo;

    /**
     * Constructor method for chef
     *
     * @param name            is the name of chef
     * @param yearsExperience is the number of years of experience for chef
     * @param meals           is a list of all meals prepared by the chef
     */
    public Chef(String name, int yearsExperience, List<Meal> meals) {
        this.name = name;
        this.yearsExperience = yearsExperience;
        this.meals = meals;
    }


    public String foodCertification(String foodType, String foodDesc) {
        //foodDesk
        int count = 0;

        for (int i = 0; i < meals.size(); i++) {
            //get meal Arraylist item one by one
            Meal meal = meals.get(i);
            // check which food include meal
            boolean b = meal.hasFood(foodDesc);
            if (b) {
                count++;
            }
        }

        String Cert = "";

        //check count and judge
        if (count < 50) {
             Cert = "C";
        } else if (count >= 50 && count < 100) {
             Cert = "B";
        } else if (count >= 100) {
             Cert = "A";
        }

        return Cert;
    }

    //Part B
    public boolean mealMasterChef(Meal mealCombo) {

        Food[] foods = mealCombo.getFoods();
        ArrayList<String> results = new ArrayList<>();

        //roop for what food include in each MealDesc
        for (int j = 0; j < foods.length; j++) {

            Food food = foods[j];

            //add to  certification
            String c = foodCertification(food.getFoodType(), food.getFoodDesc());

            //add foodCertification result to List
            results.add(c);

        }

        //Check AA or not
        for (int i = 0; i < results.size(); i++) {
            //get each item from Arraylist
            String result = results.get(i);

            if (!result.equals("A")){
                return false;
            }

        }
        return true;

    }

}
