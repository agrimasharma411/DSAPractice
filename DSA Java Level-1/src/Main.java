
//import java.util.Arrays;


// ---------------DSA-LEVEL = 1 (Total 6 Qu)----------------------//



//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-1   FIND  MAX / MIN IN ARRAY  |
//   |                                         |
//   |-----------------------------------------|


// class Main {
//     public static void main(String[] args) {
//         int[] A = {1, 2, 3, 44, 5, 6};
//         int maxValue = findMax(A); // call method
//         System.out.println(maxValue); // still print here to see output
//     }

//     public static int findMax(int[] A) {
//         int max = -1;
//         for(int i = 0; i < A.length; i++) {
//             if(A[i] > max){
//                 max = A[i];
//             }
//         }
//         return max; // returning max instead of printing
//     }
// }

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-2 COUNT EVEN / ODD IN ARRAY.  |
//   |                                         |
//   |-----------------------------------------|

// class Main {
//     public static void main(String[] args) {
//         int[] A = {22,33,44,55,66,77,88};
//         int count[] = (oddEvenCount(A));
//         //System.out.print(Arrays.toString(count));
//         System.out.println("Even Count = " + count[0]);
//         System.out.println("Odd Count = " + count[1]);
//     }
//     public static int[] oddEvenCount(int[] Arr){
//         int n = Arr.length;
//         int even_count = 0;
//         int odd_count = 0;
//         for(int i = 0; i<n; i++){
//             if (Arr[i] % 2 == 0 ){
//                 even_count ++;
//             }
//             else{
//                 odd_count ++;
//             }
//         }
//         return new int[]{even_count , odd_count};

//     }
// }

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-3 SUM OF ARRAY                |
//   |                                         |
//   |-----------------------------------------|

// class main {
//     public static void main (String[] args ) {
//         int [] A = {2,4,6,7,8,9 };
//         int ans = sumArray(A);
//         System.out.print(ans);

//     }
//     public static int sumArray (int[] Arr) {
//         int n = Arr.length;
//         int sum = 0;
//         for(int i = 0; i< n ; i++){
//           sum = sum + Arr[i];
//         }
//         return sum;
//     }
// }

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-4 LINEAR SEARCH               |
//   |                                         |
//   |-----------------------------------------|

// class Main {
//     public static void main (String[] args) {
//         int[] Arr = {22,33,55,66,88,44,60,53,67} ;
//         int target = 88 ;
//         int ans = linearSearch(Arr,target);
//         System.out.print(ans);

//     }
//     public static int linearSearch(int[] Arr, int target){
//         int n = Arr.length;
//         for(int i = 0; i < n ; i ++){
//             if(Arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-5 FREQUENCY OF ELEMENTS       |
//   |                                         |
//   |-----------------------------------------|

// class Main {
//     public static void main (String [] args) {
//         int[] Arr = { 65,65,66,35,89,65,47,66,35,47 };
//         int [] ans = freqOfEle(Arr);
//         System.out.print(Arrays.toString(ans));
//     }
//     public static int[] freqOfEle( int[] Arr ) {
//         int n = Arr.length;
//         int [] result = new int [n];
//         for(int i = 0; i < n ; i++) {
//               int freq = 0;
//             for(int j = 0 ; j< n; j++){
//                 if(Arr[i]==Arr[j]){
//                 freq++;
//                 }
//             }
//              result[i] = freq;
//         }
//         return result;
//     }
// }


//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-6    REVERSE AN ARRAY         |
//   |                                         |
//   |-----------------------------------------|


// class Main {
//     public static void main(String[] args) {
//         int[] A = {1, 2, 3, 4, 5, 6};
//         int n = A.length;
//         for (int i = 0; i < n / 2; i++) {
//             int temp = A[i];
//             A[i] = A[n - 1 - i];
//             A[n - 1 - i] = temp;
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(A[i]+" ");
//         }
//     }
// }




























