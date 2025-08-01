function greet(){
    var name="Parameswari";
    function displayName(){
        return "Hello " + name;
    }
   return displayName;
}

var greetUser = greet();
console.log(greetUser); // This will log "Hello Parameswari" to the console
console.log(greetUser()); // This will call the displayName function and log "Hello Parameswari"