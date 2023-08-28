

function matchingStrings(strings, queries) {

    let result = new Array(queries.length).fill(0);

    let count = 0;

    for (let i = 0; i < queries.length; i++) {
        const count = strings.filter(string => string === queries[i]).length;
        result[i] += count;

    }
    return result;

}

matchingStrings(['aba', 'baba', 'aba', 'xzxb'], ['aba', 'xzxb', 'ab']);