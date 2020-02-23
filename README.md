# goalie
CPSC 210 Software Construction Personal Project

P1:
have at least 1 package (probably named "ui")
have at least one class, with a main method, and two other methods,
 called by that main method. It is okay for these methods to be declared static
have print statements in each of the methods so that when you run the program,
 messages are printed out, displaying the execution.

 P2:
 Get basic interaction loop going, use at least one class, and must have multiple methods that are called.

 Make at least 1 package: ui
 Make at least one class named appropriately for your application
 Make a main method that gets things going
 Construct an object (Note: this should probably happen within your main method)
 Declare a field and use it (not necessarily at the same time!)
 Pass a parameter
 Use a local variable
 Return a value and use it
 Use a condition, and a loop
 Make a call graph from your main method
 Draw the flowchart for a method with a condition or a loop
 Get user input, and reflect it back to the user
 Use the debugger

 P3:
 Abstraction and Testing

 your code running, explaining what user input it takes, and what it does with it
 your data abstraction code and be ready to justify the method specifications
    DATA ABSTRACTION: Determine the public interface for that Class (the public methods), and the private implementation
     (the private fields and helper methods).  These must be properly specified with REQUIRES/MODIFIES/EFFECTS clauses
     in place.  Move everything out of your main method and all the static methods it uses into a class.
     Change any static calls to object calls. (there is an example of that transformation at the bottom of that page)
 your tests for your data abstraction
    TEST THE DATA ABSTRACTION: Write a separate class that tests every method your data abstraction or data abstractions.

P5:
Abstracts and Extends

NTRODUCE A NEW CLASS: Introduce a second class into your design (if you only had one before) that is a variation on
 an existing class.  For instance, with the ToDo list, if you originally had only one kind of ToDo Item, now you might
 add an UrgentItem.  You may also rename your original "Item" to be "RegularItem", to better define it.  You would need
 to give the UrgentItem some data or behaviour that isn't present in a RegularItem.

INTRODUCE AN ABSTRACT CLASS:  You must introduce at least one abstract class. The abstract class should have at least
 one abstract method.  The abstract class should hold the behaviour and data that your two other classes have in common.
  For the ToDo list example, you might now introduce an "Item" abstract class that holds the data and common behaviour
  for RegularItems and UrgentItems.

INTRODUCE AN EXTENDS RELATIONSHIP: Both of your base implementation classes should extend the new Abstract class.
They should override at least one method in the abstract class, and provide the implementation for the abstract method.
 For instance, the abstract method in the Item class for the ToDo List application might be "complete".
 Both RegularItem and UrgentItem would need to implement the "complete" method. Note: It's possible that the Abstract
  class needs to implement the interface that was once implemented by your original class (from the previous phase),
   so rather than your classes declaring which interface(s) they implement the abstract class can declare the
    implements relationship.   That way both your base classes are implementing the interface(s).

INTEGRATE THE NEW BEHAVIOUR: You should integrate the behaviour provided by your new class into the system's
interaction loop.  In the ToDoList application, the user would now be prompted as to whether they wanted to make an
urgent item or a regular item. The loop would then instantiate the right type depending what the user selects.
 If you have declared the variable to have an apparent type that is the Abstract Class (or even a higher level
 interface) your code can then call all the methods it needs to on that object regardless of which actual type it is.

Getting .7: If you do a minimal job of the above, and have poor naming and structure, then you will obtain a .7

Getting 1: If you add more subclassing, overriding or overloading, or have particularly clean code with good naming,
 or nice  abstraction (meaning low duplication between your classes) then you'll get a 1.

 6. Robustness

 For this project deliverable you need to make your code more robust!

 For basic credit of .7:

 Create your own exception class (named appropriately)
 Throw your exception when it should be thrown
 Catch the exception and appropriately handle it at the right point in the call chain
 Have a finally clause
 Write tests to check that the exception is thrown in the right situations
 For full credit of 1:

 Use an exception hierarchy appropriately, meaning you have different catches for levels of exceptions, or
 Create multiple kinds of Exceptions, or
 Catch and recover from the exceptions thrown if files are not found (those ones we told you to just stick in the
 signatures in earlier deliverables)

specification has removed any constraints on when the operation can be called (the REQUIRES clause is empty) and the
 EFFECTS clause states explicitly when the operation could respond to an exceptional condition by
  throwing a IllegalValueException.

  Bloch suggests that checked exceptions should be used for recoverable conditions, meaning that if a caller can
   potentially fix the problem and run the operation successfully later, then forcing the caller to potentially handle
   the exceptional condition makes sense. Bloch suggests that unchecked exceptions should be used for
   programming problems, including checks on the validity of input parameters.

   11. Interactivity and Visuals

This is it! The last deliverable!!!

In this deliverable you need to add a GUI. This deliverable will be a lot of work, mainly because of how
 incredibly annoying GUI development can be. Start right away!

The TAs are prepared to help out if you're using Swing for your GUI development. Anything outside of that,
and you're somewhat on your own.  You're free to try, but you need to at least get that basic level working to pass
 this deliverable, so don't attempt the exotic until you've attained something basic you can revert to
 and demo if you get stuck!

Advice: As soon as you get something minimal working, commit that code! Then if you break it later,
you can always revert.  Actually, commit every single time you walk away from your chair, with a meaningful message
 indicating the state of the code. It's fine to commit buggy code, intermediate code, etc, as long as you're clear in
 your commit message what you're committing.  We will *not* be giving extensions for "my computer broke, and I forgot
  to commit anything" so commit at least daily.

For 2:

Add a basic gui with a text entry box and an "enter" button to replace that user input loop (the prompt for the user
must also be displayed so they know what to enter), and a message window that shows what would have been displayed
 back to the user in the original version.  Be prepared to explain how your application works from that
 button press down.

For 4:

Make it look pretty! Incorporate UI elements such as buttons, and text boxes, a map, creative use of sounds,
 or visualisations, as appropriate for your application.  Make creative use of visualisation where you can.