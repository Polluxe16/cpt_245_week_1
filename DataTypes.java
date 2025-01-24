public class DataTypes {
    

    private static void main(String name, int age, double cashOnHand, boolean isStudent) { // Swapped the main and displayValues methods

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Cash On Hand: " + cashOnHand); // Corrected the typo on cashOnHand
        System.out.println("Is Student: " + isStudent);
    }

    public static void displayValues(String[] args) {

        String name = "Brett";
        int age = 25;
        double cashOnHand = 10.25d; //Added a d to the end of the double value
        boolean isStudent = false;
        

        // displayValues(name, age, cashOnHand, isStudent);
    }
}
