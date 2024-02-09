package kz.mun.se.effective_java;

public class Test {
    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFacts = new NutritionFactsBuilder
                .Builder(240, 8)
                .fat(23)
                .carbohydrate(43)
                .build();
    }
}
