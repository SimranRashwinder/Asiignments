let b1=document.getElementById('button1');
let b11=document.getElementById('box1');
let b12=document.getElementById('box2');
let b13=document.getElementById('box3');
b1.addEventListener("click",getSum);
function getSum(){
 b13.value=Number(b11.value)+ Number(b12.value);
}

let b2=document.getElementById('button2');
let b21=document.getElementById('box1');
let b22=document.getElementById('box2');
let b23=document.getElementById('box3');
b2.addEventListener("click",getDiff);
function getDiff(){
 b23.value=Number(b21.value) - Number(b22.value);
}

let b3=document.getElementById('button3');
let b31=document.getElementById('box1');
let b32=document.getElementById('box2');
let b33=document.getElementById('box3');
b3.addEventListener("click",getProduct);
function getProduct(){
 b33.value=Number(b31.value)*Number(b32.value);
}

let b4=document.getElementById('button4');
let b41=document.getElementById('box1');
let b42=document.getElementById('box2');
let b43=document.getElementById('box3');
b4.addEventListener("click",divNum);
function divNum(){
 b43.value=Number(b41.value)/Number(b42.value);
}

let b5=document.getElementById('button5');
let b51=document.getElementById('box1');
let b52=document.getElementById('box2');
let b53=document.getElementById('box3');
b5.addEventListener("click",getPow);
function getPow(){
 b53.value=Number(b11.value)**Number(b52.value);
}// Register events by adding event listeners and make functions to handle the events here