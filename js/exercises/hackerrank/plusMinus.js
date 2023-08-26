'use strict';
/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * plusMinus 20 Mins
 * plusMinusOpt 12 Mins
 */
const { performance } = require('perf_hooks');

function plusMinus(arr) {
    const t0 = performance.now()
    console.log('Running plusMinus');

    const divisor = arr.length;

    let char;
    let positiveCount = 0;
    let negativeCount = 0;
    let ZeroCount = 0;

    for (let i = 0; i < divisor; i++) {
        const t0 = performance.now()

        char = arr[i];

        if (char == 0) {
            ZeroCount++
        } else if (char > 0) {
            positiveCount++
        } else {
            negativeCount++
        }
    }
    console.log((positiveCount / divisor).toFixed(6));
    console.log((negativeCount / divisor).toFixed(6));
    console.log((ZeroCount / divisor).toFixed(6));

    const t1 = performance.now()
    console.log('execution time:' + (t1 - t0) + ' ms')


}

function plusMinusOpt(arr) {

    const t0 = performance.now()
    console.log('Running plusMinusOpt');


    const divisor = arr.length;
    const ZeroCount = arr.filter((x) => x == 0).length;
    const positiveCount = arr.filter((x) => x > 0).length;
    const negativeCount = arr.filter((x) => x < 0).length;

    console.log((positiveCount / divisor).toFixed(6));
    console.log((negativeCount / divisor).toFixed(6));
    console.log((ZeroCount / divisor).toFixed(6));

    const t1 = performance.now()
    console.log('execution time:' + (t1 - t0) + ' ms')
}

const test1 = [-4, 3, -9, 0, 4, 1];
const test2 = [-4, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1, 3, -9, 0, 4, 1];

console.log('\nTest 1......\n');
plusMinus(test1)
plusMinusOpt(test1)

console.log('\nTest 2......\n');
plusMinus(test2)
plusMinusOpt(test2)




