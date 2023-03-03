function hello(){
    console.log("hello world");
}

const addRow = () => {
    const table = document.getElementById('main-table');
    const td1 = document.createElement('td')
    const td2 = document.createElement('td')
    const td3 = document.createElement('td')
    const td4 = document.createElement('td')

    let itemInput = document.getElementById("item-to-add");
    td1.innerHTML = itemInput.value;
    table.appendChild(td1);

    let nameInput = document.getElementById("name-to-add");
    let newName = nameInput.value;
    let priceInput = document.getElementById("price-to-add");
    let newPrice = priceInput.value;
}

