let c = document.getElementById('myCanvas');
let bt1 = document.getElementById('button1');
let Dots=[];
c.addEventListener("click",drawDot)
function drawDot(){
    ctx.beginPath();
    ctx.arc(e.offsetX,e.offset,r,0,2*Math.PI);
    ctx.fill();
    r=Math.random();



}