public class Product {
    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    /** End of instances
     *  2 instance of private variables
     *  1 constructor
     *  2 'getters'
     */

    public static void main(String[] args) {
        Product[] test = new Product[]{
                new Product("Apple", 75),
                new Product("Banana", 50),
                new Product("Avocado", 175)
        };
        findAveragePrice(test);
    }

    /**
     *  method instance that println the average price
     *  avg = total / #items
     */
    public static void findAveragePrice(Product[] arr){
        double total = 0; // incase the average is not a whole number
        for(Product individual: arr) {
            total += individual.getPriceInCents();
        }
        double avg = total / arr.length;
        System.out.println("The average cost of the products is: " + avg);
    }
}
/* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
