public class IfElse {
    // an if statement is a way to do an action only if a statement is true
    // if statement looks like this: 
    // if (<condition>) {
    //    <action>;
    // }
    // different conditions include
    // > : greater than
    // >= : greater than or equal to
    // < : less than
    // <= : less than or equal to
    // == : equal to
    // != : not equal to

    // you can also use && (and) as well as || (or) in between functions to add complexity to your conditions
    // for example: 
    // if (<condition> && <condition>) {
    //      <code>
    // }
    // would run the code if both conditions are true
    
    // you can add an else or else if statement to an if statement
    // an else if statement will create a new condition and play the code inside if that condition is true,
    // but will only run if the original if condition is false;
    // and else statement will just play the code in it's block if the original if statement is false
    // an if else if else statement looks like this: 
    // if(<condition>) {
    //      <action>;
    // }
    // else if (<condition) {
    //      <action>;
    // }
    // else {
    //      <action>;
    // }
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 3;
        // write code to:
        // print x + y if x + y is equal to 6
        // print x * y if x * y is equal to 17
        // print x % y if x * y doesn't equal 17
        
        // then, using if statements, print "cube" if x, y, and z make up the dimensions of a cube
        // if they don't, print, "not cube"
    }
} 
// your code should print out: 
// 6
// 9