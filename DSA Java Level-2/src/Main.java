// class Main {
//     public static void main (String[] args){
//         int [] Arr = {2,4,6,8,3,22,34};
//         int ans = kthMaxArray(Arr);
//         System.out.print(ans);

//     }
//     public static int kthMaxArray( int[] Arr) {
//         int n = Arr.length;
//         int max = Integer.MIN_VALUE;
//          int secondMax = Integer.MIN_VALUE;
//         for(int i = 0; i<n; i++){
//             if(Arr[i] > max){
//                 secondMax = max;
//                 max = Arr[i];
//             }
//                 else if(Arr[i] > secondMax && Arr[i] < max) {
//                 secondMax = Arr[i];
//                 }
//         }
//         return secondMax;
//     }
// }
//   |-----------------------------------------|
//.  |                                         |
//   |QUESTION-7  Remove duplicates            |
//   |                                         |
//   |-----------------------------------------|
// import java.util.*;
// class Main {
//     public static void main (String [] args) {
//         int[] Arr= { 1,2,3,4,5,5,6 };
//         ArrayList<Integer> ans = removeDuplicate(Arr);
//         System.out.print(ans);

//     }
//     public static ArrayList<Integer> removeDuplicate (int [] Arr) {
//     int n = Arr.length;
//   ArrayList<Integer> result = new ArrayList<>();
//   for(int i = 0; i<n; i++){
//      if (!result.contains(Arr[i])) {
//       result.add(Arr[i]);
//       }


//   }
//   return result;


//     }
// }


 //  |-----------------------------------------|
//.  |                                         |
//   |QUESTION-8  Bubble Sort                  |
//   |                                         |
//   |-----------------------------------------|
// import java.util.Arrays;
// class Main {
// public static void main(String[] args ){
//     int[] ans = {5,2,9,6,8,10,1};
//     sort(ans);
//     System.out.println(Arrays.toString(ans));
// }
// public static void sort( int[] Arr ) {
// int n = Arr.length;
// int [] result = new int[n];
// for(int i = 0; i < n-1; i++){
//     for(int j = 0; j<n-1-i; j++){
//         if (Arr[j]>Arr[j+1]){
//         int temp = Arr[j];
//         Arr[j] = Arr[j+1];
//         Arr[j+1] = temp;
//         }
//     }
// }
// }


//   |-----------------------------------------|
//.  |                                         |
//   |QUESTION-9  Reverse a portion of Ar      |
//   |                                         |
//   |-----------------------------------------|

//import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {
//       int[] A = { 1,2,3,4,5,6,7,8,9};
//       int s = 3;
//       int e = 7;
//       reverse (A,s,e);
//       System.out.println(Arrays.toString(A));
//     }

//     public static void reverse(int[]A, int s, int e){
//         int n = A.length;
//      while (s<e){
//             int temp = A[s];
//             A[s] = A[e];
//             A[e] =temp;
//             s++;
//             e--;
//         }
//     }
// }
//   |--------------------------------------------------|
//.  |                                                  |
//   |QUESTION-10  Find 1st & Last occurance of ele      |
//   |                                                  |
//   |--------------------------------------------------|
// class Main {
//     public static void main (String [] args) {
//      int[]   A = { 3,6,4,4,4,6,7,2};
//          int x = 4;
//       occurance(A,x); // just call the method , no need to print like in return function
//     }
// public static void occurance(int[]A, int x) {
//     int n = A.length;
//     for(int i = 0; i<n; i++){
//         if(A[i]==x) {
//         System.out.println("fst occ: " + i);
//         break;
//         }
//     }
//     for(int i = n-1; i>=0; i--){
//         if(A[i]==x){
//         System.out.print("last occ: " + i);
//         break;
//         }
//     }


