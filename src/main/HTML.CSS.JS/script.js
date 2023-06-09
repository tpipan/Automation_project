function clickMe() {
    var var1 = "abc";
    var var2 = 5;
    var var3 = false;
    //alert("hello !!!");
    readInputText();
}

function readInputText() {
    var username = document.getElementById("username");
    var usernameError = document.getElementById("usernameError");

    if (username.value.length > 10) {
        usernameError.innerHTML = "The max size of 10 has been exceeded";
        username.style.color="red";
    } else if (username.value === '') {
        usernameError.innerHTML = "Username is Required";
    } else {
        usernameError.innerHTML = "";
        username.style.color="black";
        return true;
    }

    return false;
}

function readPassword() {
console.log('here');
    var password = document.getElementById("password");
    var passwordError = document.getElementById("passwordError");

    if (password.value === '') {
        passwordError.innerHTML = "Password is Required";
    } else if (password.value.length > 11 || password.value.length < 5) {
        passwordError.innerHTML = "Password must be between 5 and 10 characters";
        password.style.color="red";
    } else {
        passwordError.innerHTML = "";
        password.style.color="black";
        return true;
    }

    return false;
}

function readPasswordAgain() {
console.log('here');
    var passRepeat = document.getElementById("passrepeat");
    var passwordMatch = document.getElementById("passwordMatch");

    if (passRepeat.value === '') {
        passwordMatch.innerHTML = "Password is Required";


    } else if (passRepeat.value != password.value) {
        passwordMatch.innerHTML = "Passwords do not match ";
        password.style.color="red";
    } else {
        passwordMatch.innerHTML = "";
        password.style.color="black";
        return true;
    }

    return false;
}



function readAddress() {

    var address = document.getElementById("txtarea1");
    var addressError = document.getElementById("addressError");

    if (txtarea1.value === '') {
        addressError.innerHTML = "Address is Required";
    } else if (txtarea1.value.length > 30 || txtarea1.value.length < 10) {
        addressError.innerHTML = "Address must be between 10 and 30 characters";
        password.style.color="red";
    } else {
        addressError.innerHTML = "";
        address.style.color="black";
        return true;
    }

    return false;
}






function validateForm() {
    readInputText();
    readPassword();
    readPasswordAgain();
    readAddress()


    return readInputText() && readPassword() && readPasswordAgain() && readAddress();
}