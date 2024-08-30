
***
According to boolean logic, every statement is binary: either *true* or *false*.

**The !, && and || operators perform Conditional-NOT, Conditional-AND and Conditional-OR operations on two boolean expressions.**   
1.  ! Conditional-NOT
2. && Conditional-AND
3. || Conditional-OR

**NOT**     
The ! operator negates the value of its operand.

| NOT | Statement | Result |
|---|--------|-------|
| ! | `true`  | `false` |
| ! | `false` | `true` |

**AND**     
The && operator returns true if both operands are true; otherwise, it returns false.

| Statement 1 | AND | Statement 2 | Result |
|-------------|----|-------------|--------|
| `true `       | && | `true`        | `true`   |
| `true `       | && | `false `      |` false ` |
| `false `      | && | `true `       | `false`  |
| `false  `     | && | `false `      | `false`  |


**OR**      
The || operator returns true if either operand is true; otherwise, it returns false.

| Statement 1 | OR            | Statement 2 | Result |
|-------------|---------------|-------------|--------|
| `true`        | &#124;&#124; | `true`        | `true`   |
| `true`        | &#124;&#124;  | `false `      | `true `  |
| `false`       | &#124;&#124;  | `true   `     | `true  ` |
| `false`       | &#124;&#124;  | `false   `    | `false ` |

The code exemplifies the usage of logical operators. 