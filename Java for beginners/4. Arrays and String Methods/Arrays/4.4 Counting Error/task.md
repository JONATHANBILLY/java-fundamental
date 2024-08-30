
***

Consider the following method, count, which is
intended to traverse all the elements in the
two-dimensional (2D) String array things and
return the total number of elements that contain
at least one `"a"`.

For example, if things contains

`{{"salad", "soup"}, {"water", "coffee"}}`

then `count(things)` should return *2*.

The method does not always work as intended.

#### For which of the following two-dimensional array input values does count NOT work as intended?

##### Note: The method `word.indexOf(letter)` will return the first index where the letter is in the word, or -1 if the word doesn't contain the letter.

##### Note 2: Assume the parentheses `()` in the options are actually braces `{}`. It's like that for internal reasons.

<div class="hint">
  Notice how in the second loop it takes things[r].length - 1, and NOT things[0].length - 1. What is the consequence of that? What is the impact of the number of dimensions of the array (number of columns in this case)?
</div>
