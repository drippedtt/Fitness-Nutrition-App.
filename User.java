public class User {
    private String userId;
    private String name;
    private int age;
    private double weight;
    private double height;
    private String goals;

    // Constructor
    public User(String userId, String name, int age, double weight, double height, String goals) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goals = goals;
    }

    // Getters (to allow data access in other classes)
    public String getName() {
        return name;
    }

    // Methods
    public void inputHealthData(String goals, double weight, double height) {
        this.goals = goals;
        this.weight = weight;
        this.height = height;
        System.out.println("Health data updated.");
    }

    public void viewFitnessPlan(FitnessPlan plan) {
        plan.displayPlan();
    }

    public void viewMealPlan(MealPlan plan) {
        plan.displayPlan();
    }
}

