# Arrays and Lists

## To Do

You need to write the fairly simple analysis routines. 

And a couple of Load routines for Doubles and Strings, producing both arrays
and ArrayLists.

And you need to write the tests for the load routines.
The basic idea there is to build a test array, write it to a temporary file,
close the temp file.
Then, read in the temp test file and match it to the original test array.
(That's one way to test loading routines. You need to write a 
storeStringArrayToFile(filename) routine to enable all this.)

This is version 1 of this lab. Nov 2022.

### Test Data

the test data files have comments in them. a comment in this case is
a line that STARTS (^ in regex) with "//" and continues to the end of the line.