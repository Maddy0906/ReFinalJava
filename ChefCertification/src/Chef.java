import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by madoka on 2017/06/08.
 */
public class Chef{
    private String name; //name of the chef
    private int yearsExperience;
    private List<Meal> meals; //list of all meals prepared by chef. if the chef prepared the 20 times,
    //prepared the meal 20 times, the Meal will exist 20 times in this list
    private Meal mealCombo;

    /**
     * Constructor method for chef
     * @param name is the name of chef
     * @param yearsExperience is the number of years of experience for chef
     * @param meals   is a list of all meals prepared by the chef
     */
    public Chef(String name, int yearsExperience, List<Meal> meals) {
        this.name = name;
        this.yearsExperience = yearsExperience;
        this.meals = meals;
    }


    public String foodCertification(String foodType, String foodDesc) {
        //foodDesk
        int count = 0;

        for (int i= 0; i < meals.size(); i++){
            //get meal list item one by one
            Meal meal = meals.get(i);
            // check which food include meal
            boolean b = meal.hasFood(foodDesc);
            if (b){
                count ++;
            }
        }

        //check count and judge
        if (count < 50 ){
            String Cert = "C";
            System.out.println(Cert);
        }else if (count >= 50 && count < 100){
            String Cert = "B";
            System.out.println(Cert);
        }else if (count >= 100){
            String Cert = "A";
            System.out.println(Cert);
        }

        return foodType+" "+foodDesc;
    }

    //Part B
    public boolean mealMasterChef(Meal mealCombo) {

        foodCertification() {

            //add foodCertification result to List
            Set<String> check = new HashSet<String>();
            for (String str : aaa) {
                if (check.contains("A")) {
                    //
                    return true;
                    break;
                }
            }
        }
        return false;
    }


}
