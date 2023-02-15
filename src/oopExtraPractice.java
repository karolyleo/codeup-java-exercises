public class oopExtraPractice {
    /**     -- OOP SHORT ASSIGNMENT #1 --
     * Create a class called Dish. This class will represent various restaurant dishes.
     * Include an integer property called “costInCents”
     * Include a string property called “nameOfDish”
     * Include a boolean property called “wouldRecommend”
     * Include a method called “printSummary” with a void return type
     *     this method will use a single printf method to print out the values of each of the instance properties in the following format:
     *       Cost: COST_IN_CENTS_HERE
     *       Name: NAME_OF_DISH_HERE
     *       Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
     * Create another class called DishTest
     * Add a main method and inside the method...
     *     1) instantiate a Dish object and assign to a variable called dish1
     *     2) assign creative values for each of the properties
     *     3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
     */
    static class Dish {
        private int costInCents;
        private String nameOfDish;
        private boolean wouldRecommend;
        public void printSummary() {
            System.out.printf("Cost: %d%nName: %s%nRecommended: %b%n", costInCents, nameOfDish, wouldRecommend);
        }
        /** -- SHORT ASSIGNMENT #3 --
         * Refactor your Dish and DishTest classes...
         *   1) Change all properties in the Dish class to private visibility (printSummary should remain public)
         *   2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
         *   3) Refactor code as needed in DishTest to access and modify dish object property values
         *   4) Add a constructor method to Dish that will assign all properties
         *   5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
         */
        public void setCostInCents (int cost){
            costInCents = cost;
        }
        public int getDishCost(){
            return this.costInCents;
        }
        public void setNameOfDish(String name){
            nameOfDish = name;
        }
        public String getDishName(){
            return this.nameOfDish;
        }
        public void setWouldRecommend(boolean response){
            wouldRecommend = response;
        }
        public boolean getWouldRecommend() {
            return wouldRecommend;
        }
        public Dish(int cost, String name, boolean response){
            this.setCostInCents(cost);
            this.setNameOfDish(name);
            this.setWouldRecommend(response);
        }
    } //end of class

    /**  -- OOP SHORT ASSIGNMENT #2 --
     * Create a class of static members (variables and methods) called DishTools
     *   - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
     *   - shoutDishName() - that takes in a Dish object and prints out the name in all caps
     *   - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
     *   - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
     * Try out the DishTools methods with Dish objects in the DishTest main method
     * BONUS - add some static methods to the Dish class that compares two dishes in some way
     */
    static class DishTools {
        private final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;
        public void shoutDishName(Dish randomDish){
            System.out.println(randomDish.getDishName());
        }
        public void analyzeDishCost(Dish name){
            if (name.getDishCost() > AVERAGE_COST_OF_DISH_IN_CENTS){
                System.out.println("More expensive than average");
            } else {
                System.out.println("Less expensive than average");
            }
        }
        public void flipRecommendation(Dish name){
            if(name.getWouldRecommend()){
                name.setWouldRecommend(false);
            } else {
                name.setWouldRecommend(true);
            }
        }
    }

    //For testing
    static class DishTest {
        public static void main(String[] args) {
            DishTools tools = new DishTools();
            Dish pasta = new Dish(1200, "Pasta and Meatballs", true);
            pasta.printSummary();
//            tools.shoutDishName(pasta);
//            tools.analyzeDishCost(pasta);
//            pasta.printSummary();
//            tools.flipRecommendation(pasta);
//            pasta.printSummary();
        }
    }
}
