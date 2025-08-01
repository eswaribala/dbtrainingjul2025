function greet(){
    var name="Parameswari";
    //private function
    function displayName(){
        return "Hello " + name;
    }
   return displayName;
}

var greetUser = greet();
console.log(greetUser); // This will log "Hello Parameswari" to the console
console.log(greetUser()); // This will call the displayName function and log "Hello Parameswari"


var number = 10;
function sum(){
    function increment(){
        number++;
        return number;
    }
    return increment;
}

var test=sum();
console.log(test()); // This will log 11
console.log(test()); // This will log 11
console.log(test()); // This will log 11