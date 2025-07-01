//class Main {
//    public static void main(String[] args) {
//        int[] Arr = {1, 2, 4, 5}; // Missing number = 3
//        int missing = findMissing(Arr);
//        System.out.println("Missing number: " + missing);
//    }
//
//    public static int findMissing(int[] Arr) {
//        int n = Arr.length + 1; // since one number is missing
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//
//        for (int i = 0; i < Arr.length; i++) {
//            actualSum += Arr[i];
//        }
//
//        return expectedSum - actualSum;
//    }
//}