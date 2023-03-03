const animals = ['Hen', 'elephant', 'llama', 'leopard',
 'ostrich', 'Whale', 'octopus', 'rabbit', 'lion', 'dog'];


// .forEach()
animals.forEach(animal => {
    //console.log(`I love ${animal}`);
})

// .map()
const secretMessage = animals.map(animal => {
    return animal[0];
})

console.log(secretMessage.join(''))

// .filter()
const startWithL = animals.filter(animal => {
    return animal[0] === "l"
})

console.log(startWithL);

// .findIndex() return the first index of the one that return true
const endWithT = animals.findIndex(animal => {
    return animal[animal.length-1] === 't'
})

console.log(endWithT);
// can use .find() in nested Object to return the Object inside it.


// .reduce() accumulator will be the return value, U can set the first accumulator.
// In this example 1st accumulator would be 100.
const numbers = [1, 2, 4, 10];
 
const summedNums = numbers.reduce((accumulator, currentValue) => {
  return accumulator + currentValue
}, 100)  

console.log(summedNums)

// .some() .every()
const allUnder5 = numbers.every(number => {
    return number < 5;
}) 

const someMoreThan9 = numbers.some(number => {
    return number > 9;
}) 


console.log(allUnder5)
console.log(someMoreThan9)