
***
Java distinguishes the integer value 1 from the floating-point value 1.0, even though they seem to be the same number.  
int x=1;    
double x=1.0;

You are not allowed to make assignments between types.    
**int x=1.0;  ✗**   
Because the variable on the left is an int and the value on the right is a double.

**double x=1; ✓ Why?!**   
Technically not legal, but Java allows it by converting the int to a double automatically.

However, this feature can cause problems.
For example:    
double y = 1 / 2;

**In fact, it gets 0.0. The reason is that the expression on the right is the ratio of two integers, 
so Java does integer division, which yields the integer value 0. 
Converted to floating-point, the result is 0.0.**

**To solve this problem, write this way:  
double  y = 1.0 / 2.0;**  
Now, it gets 0.5 
