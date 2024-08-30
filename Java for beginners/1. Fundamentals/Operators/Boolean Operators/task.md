
***
According to boolean logic, every statement is binary: either *true* or *false*.

Compound statements are also binary in nature. The operator used to join two statements determines the boolean value of the statement as a whole.

The following tables summarizes the boolean operators:

**NOT**

The veracity of the statement is reversed.

| NOT | Statement | Result |
|---|--------|-------|
| ! | `true`  | `false` |
| ! | `false` | `true` |

**AND**

If two statements are joined using *and*, the compound statement is true only if both parts are true.

| Statement 1 | AND | Statement 2 | Result |
|-------------|----|-------------|--------|
| `true `       | && | `true`        | `true`   |
| `true `       | && | `false `      |` false ` |
| `false `      | && | `true `       | `false`  |
| `false  `     | && | `false `      | `false`  |


**OR**

If two statements are joined using *or*, the compound statement is true if any part is true.

| Statement 1 | OR            | Statement 2 | Result |
|-------------|---------------|-------------|--------|
| `true`        | &#124;&#124; | `true`        | `true`   |
| `true`        | &#124;&#124;  | `false `      | `true `  |
| `false`       | &#124;&#124;  | `true   `     | `true  ` |
| `false`       | &#124;&#124;  | `false   `    | `false ` |

The code exemplifies the usage of boolean operators. 