public class Main {
    public static void main(String[] args) {
        // Call the login method from the Login class
        Login.login();

        // Create a new instance of the Tab class
        Tab tab = new Tab();

        // Order a drink with alcohol and a mixer
        tab.orderDrink("cocktail", Alcohols.vodka, Mixers.orangeJuice);

        // Order a drink with only alcohol
        tab.orderDrink("shot", Alcohols.gin, null);

        // Calculate the total cost of the drinks
        double total = tab.calculateTotal();
        System.out.println("Total: $" + total);
    }
}
