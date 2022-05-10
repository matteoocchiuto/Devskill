let counter: number = 1;
let nI: number = 1;
function isBrutto(nI: number): boolean {
    while (nI !== 1) {
        if (nI % 2 === 0) {
            nI /= 2;
        } else if (nI % 3 === 0) {
            nI /= 3;
        } else if (nI % 5 === 0) {
            nI /= 5;
        } else {
            return false;
        };
    };
    return true;
};
while (counter != 1500) {
    nI++;
    if (isBrutto(nI) == true) {
        counter++;
    }
}
console.log(nI);