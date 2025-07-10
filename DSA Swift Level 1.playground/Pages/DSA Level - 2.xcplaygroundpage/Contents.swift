// Online Swift compiler to run Swift program online
// Print "Try programiz.pro" message

// ---------------DSA-LEVEL = 1 (Total 6 Qu)----------------------//
//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-1   FIND  MAX / MIN IN ARRAY  |
//   |                                         |
//   |-----------------------------------------|

// var arr = [4,6,9,5,3,2]
// var max = -1
// for item in arr {
//     if (item > max ){
//         max = item
//     }
// }
// print (max)

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-2 COUNT EVEN / ODD IN ARRAY.  |
//   |                                         |
//   |-----------------------------------------|
   
// var arr = [ 3,22,5,34,77,81,59,26]
// var even_count = 0
// var odd_count = 0
// for item in arr {
//     if(item % 2 == 0){
//     print ((item,"even"),terminator:"")
//       even_count += 1
//     }
//     else {
//     print((item,"=odd"),terminator:"")
//         odd_count += 1
//     }
// }
// print("\n")
// print ("Even count = \(even_count)")
// print ("Odd count = \(odd_count)")

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-3 SUM OF ARRAY                |
//   |                                         |
//   |-----------------------------------------|

// var arr = [1,2,3,4,5,6,7]
// var sum = 0
// for item in arr {
// sum = sum + item
// }
// print (sum)
//

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-4 LINEAR SEARCH               |
//   |                                         |
//   |-----------------------------------------|

// var arr = [31,98,41,74,51,47,61,71]
// var target = 47
// for (index,item) in arr.enumerated() {
//     if(item == target){
//         print("\(index)")
//     }
// }

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-5 FREQUENCY OF ELEMENTS       |
//   |                                         |
//   |-----------------------------------------|

// var arr = [47,89,23,89,51,87,51,87,78]
// var ans: [Int] = []
// for item1 in arr {
//   var freq = 0
// for item2 in arr {
//     if(item1 == item2 ) {
//         freq += 1
//     }
// }
// ans.append(freq)
// }
// print(ans)

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-6    REVERSE AN ARRAY         |
//   |                                         |
//   |-----------------------------------------|

// var arr = [10, 20, 30, 40, 50]
// var s = 0
// var e = arr.count - 1
// while s < e {
//     let temp = arr[s]
//     arr[s] = arr[e]
//     arr[e] = temp
    
//     s += 1
//     e -= 1
// }
// print(arr)



//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-7    Remove duplicates        |
//   |                                         |
//   |-----------------------------------------|
//
// var arr = [10,20,30,40,50,50,90,90]
// var ans: [Int] = []
// for item  in arr {
//   if (!ans.contains(item)) {
//     ans.append(item)
//  }
// }
// print (ans)
//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-8    Reverse an array         |
//   |                                         |
//   |-----------------------------------------|
//

//var arr = [10, 20, 30, 40, 50]
//
//var left = 0
//var right = arr.count - 1
//
//while left < right {
//    let temp = arr[left]
//    arr[left] = arr[right]
//    arr[right] = temp
//    
//    left += 1
//    right -= 1
//}
//
//print("Reversed array: \(arr)")
//

//   |----------------------------------------------------|
//   |                                                    |
//   |  QUESTION-9 Array is Palindromic or not            |
//   |                                                    |
//   |----------------------------------------------------|

// let arr = [1,2,3,4,4,2,1]
// var s = 0
// var e = arr.count - 1
// var isPalindromic = true
// while (s < e){
// if( arr[s] != arr[e]) {
// isPalindromic = false
// break
// }
// s += 1
// e -= 1
// }
// if isPalindromic {
//     print("yes palindromic")
// }
// else{
//  print ("not palindromic")
// }

//   |----------------------------------------------------|
//   |                                                    |
//   |  QUESTION-9        Bubble Sort                     |
//   |                                                    |
//   |----------------------------------------------------|

//var arr = [22,16,9,4,0,56]
//var n = arr.count
//var ans:[Int] = []
//for i in 0..<n-1 {
//    for j in 0..<n-1-i {
//        if (arr[j]<=arr[j+1]){
//            let temp = arr[j]
//            arr[j] = arr[j+1]
//            arr[j+1] = temp
//        }
//    }
//}
//print(arr)

//   |----------------------------------------------------|
//   |                                                    |
//   |  QUESTION-9        Reverse a potion of Array       |
//   |                                                    |
//   |----------------------------------------------------|

// var Ar = [1,2,3,4,5,6,7,8,9,10]
// var s = 3
// var e = 6
// while (s<e){
//     let temp = Ar [s]
//     Ar [s] = Ar [e]
//     Ar [e] = temp
//     s += 1
//     e -= 1
// }
// print (Ar)
//






