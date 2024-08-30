
***
#### Incrementing and decrementing
Incrementing and decrementing are such common operations that Java provides special operators for them.

**The ++ operator adds one to the current value of an int or char.    
-- subtracts one.**

So both below expressions are same:   
number = number + 1    OR   number++

##### Note: Neither operator works on doubles, booleans or Strings.
#### Shorthand Notation
There is a shorthand notation that combines the assignment operator (=) and an
arithmetic operator so that a given variable can have its value changed by adding,
subtracting, multiplying, or dividing by a specified value. 

**The general form is:**        
`Variable Op = Expression`      
which is equivalent to:     
`Variable = Variable Op (Expression)`       
The `Expression` can be another variable, a constant, or a more complicated arithmetic expression. The `Op` can be any of +, −, *, /, or %.

Below are examples:

| EXAMPLE:             | EQUIVALENT TO:             |
|----------------------|----------------------------|
| `a = a + 1;`         | `a++; `                    |
| `b = b - 1;`         | `b--; `                    |
| `c = c + 2;`         | `c += 2; `                 |
| `total -= discount;` | `total = total - discount;` |
| `x = x * y; `        | `x *= y;  `                |
| `d *= num1 + num2;`  | `d = d * (num1 + num2);`   |
| `change %= 100;`     | `change = change % 100;`   |

