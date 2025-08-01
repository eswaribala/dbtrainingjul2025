
const {faker} = require('@faker-js/faker');
//constructor function
function Customer(id,name,dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;

    this.getId = function() {
        return this.id;
    };

    this.getName = function() {
        return this.name;
    };

    this.getDob = function() {
        return this.dob;
    };
}

//method
Customer.prototype.updateName = function(newName) {
    this.name = newName;
};


//create the object
var customer1 = new Customer(faker.number.int({ min: 1, max: 1000 }),
                             faker.person.fullName(),
                             faker.date.past(30, new Date(2000, 0, 1)).toISOString().split("T")[0]);
//access the properties and methods
console.log(customer1.getId());   // Output: 1
console.log(customer1.getName());   // Output: John Doe
console.log(customer1.getDob());   // Output: 1990-01-01

//call the method
console.log("Calling Update Method.....");   // Output: John Doe
customer1.updateName(faker.person.fullName());
console.log(customer1.getName());   // Output: Jane Smith (or another random name)