class FitnessPlan {
    private String planId;
    private String activities;
    private int duration;
    private int caloriesBurned;

    public FitnessPlan(String planId, String activities, int duration, int caloriesBurned) {
        this.planId = planId;
        this.activities = activities;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public void displayPlan() {
        System.out.println("Fitness Plan ID: " + planId);
        System.out.println("Activities: " + activities);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Calories Burned: " + caloriesBurned);
    }
}

