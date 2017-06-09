import java.util.ArrayList;
import java.util.List;

public class ChefMain {

    public static void main(String[] args) {
        // Declare food
        Food chicken = new Food("meat", "chicken");
        Food carrot = new Food("vegetable", "carrot");
        Food beans = new Food("vegetable", "green beans");
        Food steak = new Food("meat", "steak");
        Food lamb = new Food("meat", "lamb");

        // Declare meal
        Meal chefsSpecial = new Meal("Chef's special", new Food[]{chicken, beans});
        Meal lambAndCarrot = new Meal("Lamb and carrot", new Food[]{lamb, carrot});
        Meal steakAndBeans = new Meal("Steak and green beans", new Food[]{steak, beans});
        Meal lambDelite = new Meal("Lamb Delite", new Food[]{lamb, beans});

        // Create meal list
        List<Meal> meals = new ArrayList<>();
        for (int i = 0; i < 70; i++) {
            meals.add(chefsSpecial);
        }
        for (int i = 0; i < 150; i++) {
            meals.add(lambAndCarrot);
        }
        for (int i = 0; i < 40; i++) {
            meals.add(steakAndBeans);
        }

        // Create chef
        Chef sarah = new Chef("Sarah", 10, meals);


        // Check
        // Part A
        String chickenResult = sarah.foodCertification("meat", "chicken");
        System.out.println(chickenResult); // B
        String carrotResult = sarah.foodCertification("vegetable", "carrot");
        System.out.println(carrotResult); // A
        String beanResult = sarah.foodCertification("vegetable", "green beans");
        System.out.println(beanResult); // A
        String steakResult = sarah.foodCertification("meat", "steak");
        System.out.println(steakResult); // C

        // Part B
        boolean chefsSpecialResult = sarah.mealMasterChef(chefsSpecial);
        System.out.println("Part B: " + chefsSpecialResult); // false
        boolean lambDeliteResult = sarah.mealMasterChef(lambDelite);
        System.out.println("Part B: " + lambDeliteResult); // true
    }
}
