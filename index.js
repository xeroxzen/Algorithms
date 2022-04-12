//write a function
// function solution(A);
// that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

function solution(A) {
  let result = 1;
  let array = A.sort(function (a, b) {
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

let result1 = solution([-1, -3]);
let result2 = solution([1, 3, 6, 4, 1, 2]);
let result3 = solution([-1, 2, 3]);
let result4 = solution([1, 3, 6, 4, 1]);

console.log(result1);
console.log(result2);
console.log(result3);
console.log(result4);
