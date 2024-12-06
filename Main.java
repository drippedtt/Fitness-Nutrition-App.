public class Main {
    public static void main(String[] args) {
        User user = new User("U001", "John Doe", 30, 75.0, 1.8, "Lose Weight");

        user.inputHealthData("Build Muscle", 78.0, 1.8);

        FitnessPlan fitnessPlan = new FitnessPlan("FP001", "Running, Weightlifting", 30, 5000);
        user.viewFitnessPlan(fitnessPlan);

        MealPlan mealPlan = new MealPlan("MP001", "Breakfast: Oats, Lunch: Chicken Salad", 2000);
        user.viewMealPlan(mealPlan);

        DeviceSync deviceSync = new DeviceSync("D001", "Fitbit");
        deviceSync.syncData(user);
    }
}

