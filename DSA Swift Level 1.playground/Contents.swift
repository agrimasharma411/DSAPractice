// Online Swift compiler to run Swift program online
// Print "Try programiz.pro" message

// ---------------DSA-LEVEL = 1 (Total 6 Qu)----------------------//
//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-1   FIND  MAX / MIN IN ARRAY  |
//   |                                         |
//   |-----------------------------------------|

 var arr = [4,6,9,5,3,2]
 var max = -1
 for item in arr {
     if (item > max ){
         max = item
     }
 }
 print (max)

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-2 COUNT EVEN / ODD IN ARRAY.  |
//   |                                         |
//   |-----------------------------------------|
   
 var arr = [ 3,22,5,34,77,81,59,26]
 var even_count = 0
 var odd_count = 0
 for item in arr {
     if(item % 2 == 0){
     print ((item,"even"),terminator:"")
       even_count += 1
     }
     else {
     print((item,"=odd"),terminator:"")
         odd_count += 1
     }
 }
 print("\n")
 print ("Even count = \(even_count)")
 print ("Odd count = \(odd_count)")

//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-3 SUM OF ARRAY                |
//   |                                         |
//   |-----------------------------------------|

// var arr = [1,2,3,4,5,6,7]
 var sum = 0
 for item in arr {
 sum = sum + item
 }
 print (sum)


//   |-----------------------------------------|
//.  |                                         |
//   |  QUESTION-4 LINEAR SEARCH               |
//   |                                         |
//   |-----------------------------------------|

// var arr = [31,98,41,74,51,47,61,71]
 var target = 47
 for (index,item) in arr.enumerated() {
     if(item == target){
         print("\(index)")
     }
 }

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










