package com.prepare.algo;
/****

given an array 1) divide: the array to half go on doing it
               2) conqure: sort the left over two elements
               3) combine: all the above divided arrays.
Ex: A ={3; 41; 52; 26; 38; 57; 9; 49};
       3,41,52,26       38,57,9,49
       3,41   52,26     38,57   9,49
       3,41   26,52     38,57   9,49
       3,26,41,52       9,38,49,57
      3,9,26,38,41,49,52,57

(A[],p,q,r)
n = q-p+1;
m = r-q;
L[n] = {1....n}
R[m] = {1....m}

for i=1 to n
  L[i]=a[i]
for j=1 to m
  R[j] = a[q+j]

i=1;
j=1
for k=p to r
  if(i > n)
    A[k] =R[j]
    j++
  else if(j> m)
    A[k] = L[i]
    i++
  else if(L[i]> R[j])
    A[k] = R[j]
    j++
  else
    A[k] = L[i]
    i++




****/


public class DivideConqureMergeSort{





}
