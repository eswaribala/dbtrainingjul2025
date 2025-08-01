//global scope
const{faker} = require('@faker-js/faker');

function assignResponsibility() {
    //local scope
    var name=faker.name.fullName();
    var email=faker.internet.email();
    var password=faker.internet.password(); 
    console.log(`Name: ${name}`);
    console.log(`Email: ${email}`);
    console.log(`Password: ${password}`);
    // Simulate assigning a responsibility
    console.log(`Assigning responsibility to ${name} with email ${email}`);
    // Here you would typically send this data to a server or process it further
}

function showData(){
    console.log(faker.person.fullName());
    console.log(faker.internet.email());
}
showData();
console.log(faker.number.int({ min: 1, max: 1000 }) + ' is the random number generated');
//local scope
//console.log(`Password: ${password}`);
//block scope
{
    var ipAddress = faker.internet.ip();
    console.log(`IP Address: ${ipAddress}`);
    let blockScopedVariable = faker.lorem.sentence();
    console.log(`Block Scoped Variable: ${blockScopedVariable}`);
 
}
 //console.log(`Block Scoped Variable: ${blockScopedVariable}`);
     console.log(`IP Address: ${ipAddress}`);

outerFunction(); //function hoisting
//lexical scope
function outerFunction() {
    var outerVariable = 'I am from the outer function';
    
    function innerFunction() {
        console.log(outerVariable); // Accessing outerVariable from the inner function
    }
    
    
    innerFunction(); // Call the inner function
}
//outerFunction(); // Call the outer function to see the output     
//console.log(`Outer Variable: ${outerVariable}`); // This will throw an error because outerVariable is not accessible here

//getOTP(); //function expression
//function expression
const getOTP= function() {
    console.log("OTP"+ faker.number.int({ min: 100000, max: 999999 }));
}
 // Call the function expression to get the OTP
getOTP(); // Call the function expression to get the OTP