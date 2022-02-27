// Create a function that takes one, two or more numbers as arguments and adds them together to get a new number.
// The function then repeatedly multiplies the digits of the new number by each other, yielding a new number,
// until the product is only 1 digit long. Return the final product.

function sumDigits() {
  let sum = 0;
  for (let i = 0; i < arguments.length; i++) {
    sum += arguments[i];
  }
  return repMultiply(sum);
}

function repMultiply(num) {
    let prod = 1;
    
    while(Math.floor(num / 10) !== 0)
    {
        prod = 1;
        while(num !== 0) 
        {
            prod = prod * (num%10);     
            num = Math.floor(num / 10); 
        }
        num = prod;
    }
    return prod;
}

console.log(`${sumDigits(22,10,47)}`);
  