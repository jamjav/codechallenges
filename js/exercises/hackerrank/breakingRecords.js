/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */
function breakingRecords(scores) {

    let [minCount, minScore, maxCount, maxScore, i] = [0, Number.MAX_VALUE, 0, 0, 0];

    const len = scores.length;

    while (i < len) {
        let currentScore = scores[i];
        if (i == 0) {
            maxScore = currentScore;
            minScore = currentScore;
        }

        if (currentScore < minScore) {
            if (i > 0) minCount++;
            minScore = currentScore
        }

        if (currentScore > maxScore) {
            if (i > 0) maxCount++;
            maxScore = currentScore
        }
        console.log('game: ', i, ' Score: ', currentScore, ' Minimun: ',
            minScore, ' Maximun: ', maxScore, ' Min: ', minCount
            , ' Max: ', maxCount)
        i++
    }
    console.log(minCount, maxCount)
    return [maxCount, minCount].join(' ')

}

//result = breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1])

result = breakingRecords([0, 9, 3, 10, 2, 20])

console.log(result)