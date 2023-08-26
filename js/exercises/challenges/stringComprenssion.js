function stringCompression(S) {

    let arr = [];
    let compressedString = "";
    let i = 0;

    while (i < S.length) {
        let char = S[i];
        i++;

        let count = "0";
        while (i < S.length && !isNaN(S[i])) {
            count += S[i];
            i++;
        }
        count = parseInt(count);
        let exist = arr.findIndex(x => x.char == char);
        if (exist >= 0) {
            arr[exist].count += count
        } else {
            arr.push({ char, count })
        };
    }

    let response = '';
    for (let i = 0; i < arr.length; i++) {
        response += arr[i].char
        if (arr[i].count > 0 ) response += arr[i].count
    }
    
    return response;
}

// Example usage
const S = "a12cb56c1a1cxyz";
const result = stringCompression(S);
console.log(result);