let b1 = document.getElementById("box1");
let bn1 = document.getElementById("button1");
let b2 = document.getElementById("box2");
let bn2 = document.getElementById("button2");
let b3 = document.getElementById("box3");
bn1.addEventListener("click", checkNum);
function checkNum() {
    if (isNaN(b1.value)) { alert("Your input is not valid."); }
    else {
        if (b1.value <= 0) { alert("Your input is not valid."); }
        else { b3.value = Number(b1.value) + Number(b3.value) }
    }
}
bn2.addEventListener("click", playGame);
function playGame() {
    if (Number(b2.value)<= 0) { alert("Your input is not valid"); }
        if(isNaN(b2.value)){ alert("Your input is not valid"); }
    else {
        if (Number(b2.value) > Number(b3.value) ){ alert("The number cannot be greater than the credits!"); }
        else{
            if(Math.random()<0.4){b3.value=Number(b3.value)+Number(b2.value);
            document.getElementById("p1").innerHTML="You win!";}
            else{b3.value=Number(b3.value)-Number(b2.value);
            document.getElementById("p1").innerHTML="You lose!";}

        }
    }
}