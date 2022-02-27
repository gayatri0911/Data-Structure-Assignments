//Create a function which counts how many lone 1s appear in a given number. Lone means the number doesn't appear twice or more in a row.
//example: countLoneOnes(101) ➞ 2, countLoneOnes(1191) ➞ 1

function countLoneOne(num) {
    let strNum = num.toString();
    let count=0;

   for(let i=0; i<(strNum.length); i++){
    if(strNum.charAt(i)==='1' && strNum.charAt(i+1) !== '1' && strNum.charAt(i-1) !== '1') {
        count++;
     }
   }
   return count;
}

console.log(`${countLoneOne(101)} Lone one's found`);
