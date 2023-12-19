# Sliding Window

https://www.geeksforgeeks.org/window-sliding-technique/

## How to use Sliding Window Technique?

The general use of the Sliding window technique can be demonstrated as follows:

- Find the size of the window required 
- Compute the result for 1st window, i.e. from the start of the data structure 
- Then use a loop to slide the window by 1, and keep computing the result window by window.

## How to Know, Where we use the Sliding Window?

To know, Where we use the Sliding Window then we remember the following terms which is mentioned below:

    Array, String, Sub Array, Sub String, Largest Sum, Maximum Sum, Minimum Sum

So, These terms help you to know where you have to use the sliding window.

## Examples to illustrate the use of the Sliding window technique

### Example: Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

    Input  : arr[] = {100, 200, 300, 400}, k = 2
    Output : 700

    Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
    Output : 39
    We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

    Input  : arr[] = {2, 3}, k = 3
    Output : Invalid
    There is no subarray of size 3 as size of whole array is 2.
