// A boomerang is a V-shaped sequence that is either upright or upside down. Specifically, 
//a boomerang can be defined as: sub-array of length 3, with the first and last digits being the same and the middle digit being different. 
//[3, 7, 3], [1, -1, 1], [5, 6, 5] 
// Create a function that returns the total number of boomerangs in an array.
// input: [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2]
// output: 3 boomerangs in this sequence:  [3, 7, 3], [1, 5, 1], [2, -2, 2]

function isBoomerang(arr) {
    let count=0, i;
    for(i=0; i<arr.length; i++) {
        if(arr[i]===arr[i+2] && arr[i]!==arr[i+1]){
            console.log(`[${arr[i]},${arr[i+1]},${arr[i+2]}]`)
            count++;
        }
    }
    return count;
}

console.log(`${isBoomerang([3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2])} boomerangs available in the given sequence.`);