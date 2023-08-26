

const arr = [-4, 3, -9, 0, 4, 1];

//Filter Function
const zeroArr = arr.filter((x) => x == 0);
console.log('Original Array', arr);
console.log('New Array only Zeros', zeroArr);

//Reduce Function
const sum = arr.reduce((a, b) => a + b, 0)
console.log('Original sum Array', sum);


//Sort Function
console.log('Original Array Sorted', arr.sort())