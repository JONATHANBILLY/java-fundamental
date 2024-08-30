
***

The other useful thing you can do with objects is making them execute certain instructions. This is called an instance method.

A method is essentially a piece of code that is only executed when the name of the method is called (or *invoked*).

Apart from executing a block of code, methods have the property of returning (or giving you) values.
And just as any other variable in Java, you must specify which type of thing it is.

The syntax is

`public <return_type> <name_of_method> (arguments)
{ code to execute when it is called }`

The arguments are certain values that may be required to carry out the code's logic.
Arguments are not necessary; but beware, even if you don't ask for arguments, you must put parentheses ()
because they're part of every method's syntax.

In case you do not want to get a value from the method, the return type should be set as void.
Like in the code here.