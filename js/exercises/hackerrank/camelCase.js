function processData(input) {

    const lines = input.split('\n');
    lines.forEach(line => {
        const [action, type, string] = line.split(';')


        if (action === 'S') {

            if (type === 'M') {
                console.log(splitMethod(string))
            } else if (type === 'C') {
                console.log(splitClass(string))
            } else if (type === 'V') {
                console.log(splitVariable(string))
            }

        } else if (action === 'C') {

            if (type === 'M') {
                console.log(combineMethod(string))
            } else if (type === 'C') {
                console.log(combineClass(string))
            } else if (type === 'V') {
                console.log(combineVariable(string))
            }

        }

    });


}

function splitVariable(string) {

    const words = string.split(/(?=[A-Z])/);
    words.forEach((word, index) => {
        words[index] = word.toLowerCase()
    });
    return words.join(' ');
}

function combineVariable(string) {

    const words = string.split(' ');

    words.forEach((word, index) => {
        words[index] = word.charAt(0).toUpperCase() + word.slice(1)
    });



    return words.join('');

}


function splitString(string) {
    const words = string.split(/(?=[A-Z])/);
    //    console.log('words', words)
    return words
}

function combineString(words) {


    const wordArr = words.split(' ')

    wordArr.forEach((word, index) => {
        if (index > 0) {
            wordArr[index] = word.charAt(0).toUpperCase() + word.slice(1)
        }
    });


    return wordArr.join('');
}

function splitMethod(word) {

    const words = splitVariable(word)
    const wordsArr = words.split('(');
    return wordsArr[0];

}

function combineMethod(word) {


    const words = combineString(word)
    return words + '()';

}

function splitClass(word) {

    const words = splitVariable(word)
    return words;

}

function combineClass(word) {


    let words = combineString(word)
    words = words.charAt(0).toUpperCase() + words.slice(1);
    return words;
}

let S = 'S;V;iPad\nC;M;mouse pad\nC;C;code swarm\nS;C;OrangeHighlighter'
processData(S)




