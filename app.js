//write a function
// function solution(A);
// that, given an array a of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
// Given A = [1,2,3], the function should return 4.
// Given A = [-1, -3], the function should return 1.

function solution(array) {
  let result = 1;
  array.sort(function (a, b) {
    return a - b;
  });
  for (let i = 0; i < array.length; i++) {
    if (array[i] > result) {
      return result;
    } else {
      result++;
    }
  }
  return result;
}

// function solution(A) {
//   // write your code in JavaScript (Node.js 4.0.0)
//   var result = 1;
//   var array = A.sort(function (a, b) {
//     return a - b;
//   });
//   for (var i = 0; i < array.length; i++) {
//     if (array[i] > result) {
//       return result;
//     } else {
//       result++;
//     }
//   }
//   return result;
// }

let result = solution([-1, -3]);
console.log(result);
