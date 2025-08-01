
const {faker} = require('@faker-js/faker');
//constructor function
function Customer(id,name,dob,active) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    //private variable
    var isActive = active;
    this.getId = function() {
        return this.id;
    };

    this.getName = function() {
        return this.name;
    };

    this.getDob = function() {
        return this.dob;
    };
    //privileged method to access private variable
    this.isActive = function() {
        return isActive;
    }
}

//method
Customer.prototype.updateName = function(newName) {
    this.name = newName;
};


//create the object
var customer1 = new Customer(faker.number.int({ min: 1, max: 1000 }),
                             faker.person.fullName(),
                             faker.date.past(30, new Date(2000, 0, 1)).toISOString().split("T")[0],
                             faker.datatype.boolean());
//access the properties and methods
console.log(customer1.getId());   // Output: 1
console.log(customer1.getName());   // Output: John Doe
console.log(customer1.getDob());   // Output: 1990-01-01
console.log("Is Active: " + customer1.isActive()); // Output: Is Active: undefined (private variable is not accessible)

//call the method
console.log("Calling Update Method.....");   // Output: John Doe
customer1.updateName(faker.person.fullName());
console.log(customer1.getName());   // Output: Jane Smith (or another random name)