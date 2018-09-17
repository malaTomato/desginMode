package model.buildmode;

import java.util.Map;

/**
 * @author xiongwu
 **/
public class MealBuilder {

    public Meal vegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal chickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.addItem(new ChickenBurger());
        return meal;
    }


    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.chickenMeal();

        System.out.println("合计："+meal.getCost()+"元");
        meal.showItems();

    }
}
