class MealPlan {
    private String planId;
    private String meals;
    private int calories;

    public MealPlan(String planId, String meals, int calories) {
        this.planId = planId;
        this.meals = meals;
        this.calories = calories;
    }

    public void displayPlan() {
        System.out.println("Meal Plan ID: " + planId);
        System.out.println("Meals: " + meals);
        System.out.println("Total Calories: " + calories);
    }
}

