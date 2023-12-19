# Two Pointers Technique

https://www.geeksforgeeks.org/two-pointers-technique/

Two pointers is really an easy and effective technique that is typically used for searching pairs in a sorted array.
Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

The algorithm basically uses the fact that the input array is sorted. We start the sum of extreme values (smallest and largest) and conditionally move both pointers. We move left pointer ‘i’ when the sum of A[i] and A[j] is less than X. We do not miss any pair because the sum is already smaller than X. Same logic applies for right pointer j.