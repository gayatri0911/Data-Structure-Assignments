//  In JavaScript ES6 an arrow function expression is a syntactically compact alternative to a regular function expression.
// Create a function that takes a string representing a function and converts between an arrow function and a regular function
// - If the input is a regular function, return an equivalent arrow function.
// - If the input is an arrow function, return an equivalent regular function.

function convert(func) {
    let arr = func.split("\n");
    let toCheck = arr[0].split(" ");
    if(toCheck[0]===`let`){
        convertToRegular(toCheck,arr);
    } else {
        convertToArrow(toCheck,arr);
    }
}

function convertToRegular(arrowFunc,arr) {
   
    arrowFunc.splice(0,1,'function');
    arrowFunc.splice(2,1);
    arrowFunc.splice(3,1);
        
    arr.splice(0,1,`${arrowFunc.join(' ')}`);
   
    console.log(arr.join(''));

}

function convertToArrow(regularFunc,arr) {
    regularFunc.splice(0,1,'let');
    regularFunc.splice(2,0,"=");
    regularFunc.splice(4,0,"=>");

    arr.splice(0,1,`${regularFunc.join(' ')}`);
   
    console.log(arr.join(''));

}

convert(`let sum = (a,b) => {
    return a+b;
}
`);

convert(`function sum (a,b) {
    return a+b;
}`)