/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * miniMaxSum 13:33
 */
function miniMaxSum(arr) {
    arr.sort();
    const sum = arr.reduce((a, b) => a + b, 0)
    const len = arr.length
    const minSum = sum - arr[len - 1];
    const maxSum = sum - arr[0];

    console.log(minSum, maxSum);



}

const test1 = [1, 2, 3, 4, 5]
const test2 = [7, 69, 2, 221, 8974]
miniMaxSum(test2)