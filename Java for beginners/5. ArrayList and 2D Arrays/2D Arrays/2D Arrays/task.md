
***

What happens if you make an array of arrays? Well, a 2D array is what
you get.

It is called 2D in short of '2-dimensional', and the reason 
it bears that name is because you may treat the first level of
the array as a coordinate (y) and each inner array as the values present
in a second coordinate (x).

The syntax to declare a 2D array is

`<dataType>[][] <2DArrayName>`

and, as expected, to initialize it the syntax is

`<2DArrayName> = new <dataType>[<rows>][<columns>]`

and then input the elements by referring to their indexes
and sub-indexes if needed. 

Here's are two examples of creating, filling and printing
2D arrays.

##### Note: we are going to use regular arrays here, not ArrayLists.