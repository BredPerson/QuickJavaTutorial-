import java.math.*;
import java.lang.Math;
// A method is a collection of code outside of the main method that preform a certain task
// A method can be called with specific parameters
// A method looks like this: 
// <AccessModifier> <ReturnType> <methodName>(<dataType> <inputName>) {
//     // <code>
// }
// you can call a method like this:
// methodName(<input>);

// the AccessModifier is either public (if you want other files to access it), or private

// The ReturnType is the either the datatype you want your function to return
// (for example an int or a string or a double) or "void", which means the function doesn't return
// anything 

// the datatype and inputName are what your function is going to use to do whatever it's purpose is
// for example if you input an int x and the function's purpose is to return your input + 5, 
// and you call: int y = methodName(3); y will be equal to 8

// Methods are used in order to stop writing the same line of code over and over again,
// for example you can make a method to add two numbers together
// at a high level of programming this saves a ton of time, formatting, and grunt work

public class Methods {
    
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = pythag(x, y);
    }

    // create a method pythag that given the length of two sides of a right triangle (x and y) you return 
    // the third the third side's length
    // Hint: you can get the power of a number like this:
    // Math.pow(<base>, <exponent>);
    // and you can get the sqrt x`with: 
    // Math.sqrt(<value>);



} 