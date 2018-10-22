# tdt4100-exam
Example of an exam repo configured for using gitpod.io

## Part 1

### Introduction

This part of the problem deals with the **Dice** class, used to represent (the value of) one or more dice (plural of die), and a possible **score** for the dice. Such a class might be useful in many types of games. For example, in Yahtzee, a dice instance can be used to both represent an entire roll before it is given points, and the dice one ends up with after a round, with the points set.

An initial **Dice** class is provided in the farkle package.

### Task a) - Fields and constructors (6 points)
A  Dice instance should have information on the (value of) a certain number of dice and a score. The die values are set during initialization (in various ways), while the score can be set during initialization or later.
Write code for fields and constructors, as well as the method **randomDieValues** according to the JavaDoc in the **Dice** class. Use the **random** method in the **Math** class, which is described as follows:

**public static double random()**
Returns a **double** value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.

### Task b) - Dice as text (8 points)
Write the standard method used to create a textual representation of a **Dice** object in the format specified in the JavaDoc. Also write the **valueof** method, which is used to create a new **Dice** object with specific die values and possibly a score from a **String** in the same format.
 
The format is "[ t1 ,  t2 , ...  tn ] = points" , where  t1 -  tn is the die values and score the score. The score section, i.e. "  = point " shall not be included if the point is -1 (meaning it is not yet set).
For example, if a **Dice** object has die values 1, 1 and 3 and the points are not set (= -1), then the textual representation is "[1, 1, 3]" . If the dice are three 6s that has given 600 points, the text will be "[6, 6, 6] = 600".

### Task c) - Die values methods (5 points)
Write the methods **getDieCount**, **getDieValue** and **getValueCount** according to the JavaDoc.

### Task d) - Score values methods (3 points)
Write the methods **getScore** and **setScore** according to the JavaDoc.

### Task e) - Iterable (3 points)
The **Dice** class implements the **Iterable<Integer>** interface. Implement the necessary method(s). Also, write code that exemplify how the use of **Dice** can take advantage of the fact that it implements precisely this interface.
  
### Task f) - add and remove (8 points)
Write the methods **add** and **remove**, both of which take a **Dice** object as the only argument. Note that none of these change on either the **this** object or the argument, and the score is not used.
 
Here are some examples of the use of these methods. The text format in the JavaDoc API is used to represent **Dice** objects:
[1, 2] .add([1, 4]) returns [1, 2, 1, 4] // note that the order does not matter
[1, 1, 2].remove([1, 4]) gives [1, 2] // Note that the order does not matter
Note that remove does not have the same logic as **Collection**'s **removeAll** method.
