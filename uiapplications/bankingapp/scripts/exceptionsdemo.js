const{faker} = require('@faker-js/faker');

//enum
const AccountType = Object.freeze({
    SAVINGS: "Savings", 
    CURRENT: "Current",
    FIXED: "Fixed"
});

function Account(id,runningTotal,roi,actType){

    this.id = id;
    this.runningTotal = runningTotal;
    this.roi = roi;
    this.actType = actType;
}
//random account type
const accountValue = Object.values(AccountType);
const randomAccountType = accountValue[Math.floor(Math.random() * accountValue.length)];

let account=new Account(
    faker.string.uuid(),
    faker.number.int({ min: 1000, max: 10000 }),
    faker.number.float({ min: 0.01, max: 0.1,
    precision: 0.01,
    }),
    randomAccountType
);
console.log("Account ID: " + account.id);
console.log("Running Total: " + account.runningTotal);  
console.log("Rate of Interest: " + account.roi);
console.log("Account Type: " + account.actType); // Output: Account Type: Savings
