
***

When you have multiple variables of the same category, it may
be unwieldy to save and address each one individually.
Instead, it is convenient to create a list that contains values
of the same type with a certain order. This list is called
an *array* in Java.

To declare an array specify the type of variable it will
store, a couple of brackets `[]` and the name of such array:

`<variable_type>[] <array_name>`

There are two ways of initialize a declared array.

One way is to instantiate the array:

`new <variable_type>[<amount_of_elements_in_the_array>]`

and adding manually each element by addressing the position
inside the array by index. Just as with Strings, the first element of a list is labeled with index zero.

`<array_name>[<index>] = <value>`

The other way to initialize an array is simply to set it
equal to the list of elements inside braces {}, separated by commas.

`<array_name> = {<list_of_values>}`

To access elements in an array, invoke them using their index.

Examples are always useful to consolidate this knowledge.
Look at the code and run it.