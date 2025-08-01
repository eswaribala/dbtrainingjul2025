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
