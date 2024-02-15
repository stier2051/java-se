package kz.mun.se.effective_java.creat_remove_objects;

import kz.mun.se.effective_java.creat_remove_objects.Calzone;
import kz.mun.se.effective_java.creat_remove_objects.NutritionFactsBuilder;
import kz.mun.se.effective_java.creat_remove_objects.NyPizza;
import kz.mun.se.effective_java.creat_remove_objects.Pizza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFacts = new NutritionFactsBuilder
                .Builder(240, 8)
                .fat(23)
                .carbohydrate(43)
                .build();

        NyPizza pizza = new NyPizza
                .Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone
                .Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();
    }

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
