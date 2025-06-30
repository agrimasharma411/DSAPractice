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