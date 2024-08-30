
***
#### A type cast takes a value of one type and produces a value of another type with an "equivalent" value.    
* If n and m are integers to be divided, and the fractional portion of the result must be preserved, at least one of the two must be type cast to a floating-point type before the division operation is performed.   
`double ans = n / (double) m;`

* Note that the desired type is placed inside parentheses immediately in front of the variable to be cast.
* Note also that the type and value of the variable to be cast does not change.

When type casting from a floating-point to an integer type, the number is truncated, not rounded.       
* `(int)2.9` // evaluates to 2, not 3

When the value of an integer type is assigned to a variable of a floating-point type, Java performs an automatic type cast called a **type coercion**
* `double d = 5;` // evaluates to 5.0

In contrast, it is illegal to place a double value into an int variable without an explicit type cast.      
* `int i = 5.5;` // Illegal       
`int i = (int) 5.5;` // Correct      
