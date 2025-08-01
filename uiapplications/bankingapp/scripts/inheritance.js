const { faker } = require('@faker-js/faker');


//inheritance
function Account(id,runningTotal,dateOfOpening) {
    this.id = id;
    this.runningTotal = runningTotal;
    this.dateOfOpening = dateOfOpening;
}


function SavingsAccount(id, runningTotal, dateOfOpening, interestRate) {
    //super constructor call
    Account.call(this, id, runningTotal, dateOfOpening);
    this.interestRate = interestRate;
}

function CurrentAccount(id, runningTotal, dateOfOpening, overdraftLimit) {
    //super constructor call
    Account.call(this, id, runningTotal, dateOfOpening);
    this.overdraftLimit = overdraftLimit;
}
//inheritance
SavingsAccount.prototype = Object.create(Account.prototype);
SavingsAccount.prototype.constructor = SavingsAccount;

CurrentAccount.prototype = Object.create(Account.prototype);
CurrentAccount.prototype.constructor = CurrentAccount;

//create instances
let savingsAccount = new SavingsAccount(
    faker.string.uuid(),
    faker.number.int({ min: 1000, max: 10000 }),
    faker.date.past(),
    faker.number.float({ min: 0.01, max: 0.1, precision: 0.01 })
);
console.log("Savings Account ID: " + savingsAccount.id);
console.log("Savings Account Running Total: " + savingsAccount.runningTotal);   
console.log("Savings Account Date of Opening: " + savingsAccount.dateOfOpening);
console.log("Savings Account Interest Rate: " + savingsAccount.interestRate);

let currentAccount = new CurrentAccount(
    faker.string.uuid(),
    faker.number.int({ min: 1000, max: 10000 }),
    faker.date.past(),
    faker.number.int({ min: 100, max: 5000 })
);
console.log("Current Account ID: " + currentAccount.id);  

console.log("Current Account Running Total: " + currentAccount.runningTotal);
console.log("Current Account Date of Opening: " + currentAccount.dateOfOpening);
console.log("Current Account Overdraft Limit: " + currentAccount.overdraftLimit);
