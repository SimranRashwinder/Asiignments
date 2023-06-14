let b1=document.getElementById('button1');
let bu1=document.getElementById('box1');
let bu2=document.getElementById('box2');
b1.addEventListener("click",getUpperCase);
function getUpperCase(){
 bu2.value=bu1.value.toUpperCase();
}

let b2=document.getElementById('button2');
let bl1=document.getElementById('box1');
let bl2=document.getElementById('box2');
b2.addEventListener("click",getLowerCase);
function getLowerCase(){
 bl2.value=bl1.value.toLowerCase();
}

let b3=document.getElementById('button3');
let bc1=document.getElementById('box1');
let bc2=document.getElementById('box2');
b3.addEventListener("click",getLastCharacter);
function getLastCharacter(){
 bc2.value=bc1.value.slice(-1,);
}

let b4=document.getElementById('button4');
let bs1=document.getElementById('box1');
let bs2=document.getElementById('box2');
b4.addEventListener("click",removeSpaces);
function removeSpaces(){
 bs2.value=bs1.value.replaceAll(" ","");
}
 // Register events by adding event listeners and make functions to handle the events here