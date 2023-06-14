
let b1= document.getElementById('div1');
b1.addEventListener("mouseover",backgroundColorGreen1);
function backgroundColorGreen1(){b1.style.backgroundColor="green";}
b1.addEventListener("click",function(){b1.style.backgroundColor="blue";});
b1.addEventListener("mouseout",function(){b1.style.backgroundColor="white";});

let b2= document.getElementById('div2');
b2.addEventListener("mouseover",backgroundColorGreen2);
function backgroundColorGreen2(){b2.style.backgroundColor="green";}
b2.addEventListener("click",function(){b2.style.backgroundColor="blue";});
b2.addEventListener("mouseout",function(){b2.style.backgroundColor="white";});

let b3= document.getElementById('div3');
b3.addEventListener("mouseover",backgroundColorGreen3);
function backgroundColorGreen3(){b3.style.backgroundColor="green";}
b3.addEventListener("click",function(){b3.style.backgroundColor="blue";});
b3.addEventListener("mouseout",function(){b3.style.backgroundColor="white";});

let b4= document.getElementById('div4');
b4.addEventListener("mouseover",backgroundColorGreen4);
function backgroundColorGreen4(){b4.style.backgroundColor="green";}
b4.addEventListener("click",function(){b4.style.backgroundColor="blue";});
b4.addEventListener("mouseout",function(){b4.style.backgroundColor="white";});
//Solve the problem step by step. 