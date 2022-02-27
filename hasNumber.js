// Create a function that takes an array of strings and returns an array with only the strings that have numbers in them. 
// If there are no strings containing numbers, return an empty array.
function hasNumber(arr) {
    let containNum=[];
  
    for(let i=0; i<arr.length; i++)
    {
        let str =arr[i];
       
        for(let j=0; j<str.length; j++){
            if(!isNaN(str.charAt(j))){
                containNum.push(str);
             }
        }       
    }
   
    return containNum;
}

console.log(`${hasNumber(["abc","abc1","abc2"])}`);
