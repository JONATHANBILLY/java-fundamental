
***

This course explains wrapper classes because every ArrayList stores
objects exclusively, not primitive data types.

Now you are able to make use of ArrayLists by remembering
that whenever you want to store a list of numbers, you
use `ArrayList<Integer>` and **not** `ArrayList<int>` to
declare it.

Alright. Now, the usefulness of ArrayLists lie in their
flexibility and methods, some of which are summarized in
the following table

| Method              | Description                                                                          |
|---------------------|--------------------------------------------------------------------------------------|
| get(index)          | Returns the value at that index.                                                     |
| indexOf(element)    | Returns the first index where element is present, or -1 if the element is not found. |
| set(index, element) | Sets the value of the element at that index.                                         |
| remove(element)     | Removes the first occurrence of the element.                                         |
| remove(index)       | Removes the element at that index.                                                   |
| clear()             | Removes all elements in the ArrayList.                                               |
| size()              | Returns the amount of elements in the ArrayList.                                     |

Here is an example of the usage of some methods 
exposed.
