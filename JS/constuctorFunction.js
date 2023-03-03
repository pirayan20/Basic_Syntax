function person(first, last, age, eyecolor){
    this.fisrtname = first
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
}

const pie = new person('pirayan','rananand',18,'black');
console.log(pie)

const mai=() => {
    console.log("ไม่อาว")
}

mai();