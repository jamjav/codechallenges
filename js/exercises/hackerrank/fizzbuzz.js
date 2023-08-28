
function fizzbuzz(num) {
    for (let i = 1; i <= num; i++) {
        console.log(printFizzbuzz(i));
    }
}



function printFizzbuzz(num) {
    if (num % 3 === 0 && num % 5 === 0) {
        return "FizzBuzz";
    } else if (num % 3 === 0) {
        return "Fizz";
    } else if (num % 5 === 0) {
        return "Buzz";
    } else {
        return num;
    }
}

// console.log(printFizzbuzz(3));
fizzbuzz(5);
// console.log(printFizzbuzz(15));
// console.log(printFizzbuzz(7));







