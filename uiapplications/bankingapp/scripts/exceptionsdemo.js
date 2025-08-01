const{faker} = require('@faker-js/faker');

//enum
const AccountType = Object.freeze({
    SAVINGS: "Savings", 
    CURRENT: "Current",
    FIXED: "Fixed"
});

function Account(id,runningTotal,roi,actType){

    let uuidPattern = /^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$/i;
   try{
    if (!uuidPattern.test(id)) {
        throw new Error("Invalid UUID format");
    }else{
        this.id = id;
    }
     }catch (error) {
        console.error(error.message);
     }

    
    this.runningTotal = runningTotal;
    this.roi = roi;
    this.actType = actType;
}
//random account type
const accountValue = Object.values(AccountType);
const randomAccountType = accountValue[Math.floor(Math.random() * accountValue.length)];

let account=new Account(
    faker.number.int({ min: 1000, max: 10000 }),
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
