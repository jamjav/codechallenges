
function divisibleSumPairs(n, k, ar) {



    let count = 0;

    ar.sort();

    for (let i = 0; i < n; i++) {
        //loop through array
        for (let j = i + 1; j < n; j++) {
            //if the sum of the two elements is divisible by k
            if ((ar[i] + ar[j]) % k === 0) {
                //increment count
                count++;
            }
        }
    }
    console.log(count);
}

divisibleSumPairs(6, 3, [1, 3, 2, 6, 1, 2])