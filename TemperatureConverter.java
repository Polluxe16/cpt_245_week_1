ublic class TemperatureConverter {
    

    private static void convertToCelsius(double degreesInFahrenheit) {

        // #### Assignment Starts Here ####

        /**
         * 
         * Please write an "algorithm" below taking the "input parameter" degreesInFarenheit
         * and converting it to the variable "degreesInCelsius" which will be printed below
         *  
        */

        double degreesInCelsius = 5.0/9.0 * (degreesInFahrenheit - 32);
        // Made sure to make 5/9 decimals, outputted -0.0 when ints
        // This formlua outputted the correct answer, assuming the answer I got from Google was the right one
        



        // #### Assignment Ends Here ####


        System.out.println(degreesInFahrenheit + " to Celsius is: " + degreesInCelsius);

    }

    public static void main(String[] args) { // Replaced System with String to fix the error

        double degreesInFahrenheit = 25;
        

        convertToCelsius(degreesInFahrenheit);


    }
}
