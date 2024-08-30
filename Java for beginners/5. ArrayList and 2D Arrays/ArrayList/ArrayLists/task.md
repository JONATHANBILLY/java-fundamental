
***

You may have found the usage of Arrays rather constrained: they have fixed
length, and you may not read or write their contents without using loops
or an index.

There's a similar structure that is part of a framework (but comes installed
by default in the JRE) that allows for more flexibility: it has dynamic size,
meaning that it can store more elements inside than its initial capacity; 
it comes with methods designed to cover common actions that are 
applied to lists, like adding, setting, getting and deleting elements directly;
but it has some drawbacks: it's slower than arrays and it can only store objects.

Although Java has access to the framework, for efficiency purposes
it is not imported automatically, so you must include the line:

`import java.util.ArrayList;`

so the compiler can copy the contents of that structure to be able to use it.

To create an ArrayList you just have to type:

`ArrayList<dataType> arraylistName`

And to initialize it, of course, you use the keyword `new`:

`new ArrayList<dataType>(numberOfElements);`

The parameter `numberOfElements` is optional, and the size of the ArrayList will
be initially zero if no integer is provided as argument.

To add an element to an ArrayList, you can use the `.add()` method,
where, if used with one argument, it will be appended to the end of
the ArrayList, or if used with two arguments, it will take the
first one as the index where the element is supposed to be added.
You can see the example here.