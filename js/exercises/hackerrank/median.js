
function findMedian(arr) {
    arr.sort((a, b) => a - b);
    return arr[Math.floor(arr.length / 2)]; 
}

console.log(findMedian([0, 1, 2, 4, 6, 5, 3])); //3