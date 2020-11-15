package com.wernette;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;

/**
 *
 * @author Jory A. Wernette
 */
public class Main {
    
    // STEP 5A: Do a Google search for how to generate a String of random letters.
        // Write that code in a separate method here. Cite your source in a comment.
    public static String givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
 
    String generatedString = random.ints(leftLimit, rightLimit + 1)
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString()
        // Be sure the String is returned in all capital letters.
      .toUpperCase(); //I added this line
    System.out.println(generatedString);
    return generatedString;
    // End the method here
}

    
    public static Widget main(String[] args) {
        // STEP 1: instantitate an ArrayList of Widgets here
        ArrayList<Widget> widgetArrayList = new ArrayList<Widget>();
        
        // STEP 3: Create a Supplier Functional Interface. It will take no arguments (empty parenthesis) and return a Widget.
            Supplier<Widget> widgetIntValue = () -> random.ints(-10, 90);
            // STEP 4: Assign a random int value from -10 to 90 to a variable.
            System.out.println(widgetIntValue.get());
            // STEP 5B: Call the random string method here and assign the returned value to a variable. 
            var randString = givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect();
            // STEP 6: Instantiate a new Widget object and return it.
            Widget widget = null;
        // End the Supplier here
        
        // STEP 8: Create a Predicate Functional Interface to test if a Widget's value is zero or greater here.
            // This will take a single Widget as input, use the .getValue() method, and return a boolean.
            // This code should be written on a single line.
            
        // STEP 10: Create a UnaryOperator Functional Interface to convert the Widget name to all lowercase letters here.
            // This will take a single Widget as input, use both the .getName() and .setName() methods, and return the updated Widget.
            // This code should be written on a single line.
        
        // STEP 13: Create a Consumer Functional Interface to print each Widget as a string on a new line.
            // This will take a single widget as input, use the .getValue() and .getName() methods, and print each Widget.
            // This code should be written on a single line.
            
        // STEP 2: Create a loop that runs 20 times
        for (int i = 0; i < 20; i++) {
            // STEP 7: Use the Supplier .get() method to instantitate a Widget object
            System.out.println(Supplier.get());
            // STEP 9: Write an if statement that uses the Predicate .test() method as the condition.
                // STEP 11: If true, use the UnaryOperator .apply() method. Take the resulting Widget and add it to the ArrayList.
            // End the if statement here
        // End the loop here
        }
        // STEP 12: Use a .forEach() method to iterate through each widget in the ArrayList.
            // STEP 14: Use the Consumer .accept() method.
        
        return widget;
    }
    
}