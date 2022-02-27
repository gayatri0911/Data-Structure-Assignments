// Given an array, write a function to calculate it's depth. Assume that a normal array has a depth of 1.
 
// example:
//                 depth([1, 2, 3, 4]) ➞ 1
//                 depth([1, [2, 3, 4]]) ➞ 2
//                 depth([1, [2, [3, 4]]]) ➞ 3
//                 depth([1, [2, [3, [4]]]]) ➞ 4

function cal_depth(arr) {
    
    let depth = Array.isArray(arr) ? 1 : 0;
      
    while (Array.isArray(arr)) {
      for (let item of arr) {
        if (Array.isArray(item)) {
            console.log(item);
            arr = [...item];
          depth++;
          break;
        } else {
            arr = item;
        }
      }
     }
    return depth;
}
console.log(`${cal_depth([[1,2,[3,4]]])}`);
console.log(`${cal_depth([1, [2, [3, [4]]]]) }`);