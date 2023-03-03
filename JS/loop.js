const input = 'turpentine and turtles';
const vowels = ['a','e','i','o','u'];
let resultArray = []
for (let i = 0; i < input.length; i++){
  for (let e = 0; e < vowels.length; e++){
    if (input[i] === vowels[e]){
      resultArray.push(input[i]);
      if (input[i] === 'u' || input[i] === 'e'){
        resultArray.push(input[i])
      }
      break
    }
  }
}
console.log(resultArray.join('').toUpperCase());