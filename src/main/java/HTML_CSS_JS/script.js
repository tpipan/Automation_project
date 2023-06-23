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
    var address = document.getElementById("textarea");
    var addressError = document.getElementById("addressError");

    if (address.value === '') {
        addressError.innerHTML = "Address is Required";
    } else if (address.value.length > 30 || address.value.length < 10) {
        addressError.innerHTML = "Address must be between 10 and 30 characters";
        password.style.color="red";
    } else {
        addressError.innerHTML = "";
        address.style.color="black";
        return true;
    }

    return false;
}

function readEmail() {
    var email = document.getElementById("email");
    var emailError = document.getElementById("emailError");

    var mailFormat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    if(mailFormat.test(email.value)) {
        emailError.innerHTML = "";
        email.style.color="black";
        return true;
    } else if (email.value === '') {
        emailError.innerHTML = "Email is Required";
    } else {
        emailError.innerHTML = "Email format is invalid";
        email.style.color="red";
    }

    return false;
}

function validateForm() {
    readInputText();
    readPassword();
    readPasswordAgain();
    readAddress();
    readEmail();

    return readInputText() && readPassword() && readPasswordAgain() && readAddress() && readEmail();
}