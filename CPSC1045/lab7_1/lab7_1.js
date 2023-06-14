let c=document.getElementById('myCanvas');
let b1=document.getElementById('button1');
let b2=document.getElementById('button2');
let ctx=c.getContext('2d');
ctx.save();
ctx.beginPath();
ctx.arc(80,80,50,0,2*Math.PI);
ctx.stroke();
ctx.translate(80,80);
ctx.beginPath();
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,50);
ctx.stroke();

ctx.restore();
ctx.save();
ctx.translate(160,40);
ctx.beginPath();
ctx.moveTo(0,80);
ctx.lineTo(0,40);
ctx.lineTo(50,40);
ctx.lineTo(80,0);
ctx.lineTo(140,0);
ctx.lineTo(170,40);
ctx.lineTo(220,40);
ctx.lineTo(220,80);
ctx.lineTo(0,80);
ctx.moveTo(50,80);
ctx.arc(50,80,20,0,2*Math.PI);
ctx.translate(50,80);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(90*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
 
ctx.moveTo(85,85);
ctx.arc(85,85,20,0,2*Math.PI);
ctx.translate(85,85);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.rotate(45*Math.PI/180);
ctx.moveTo(0,0);
ctx.lineTo(0,20);
ctx.stroke();

ctx.restore();
ctx.save();
ctx.translate(80,200);
ctx.beginPath();
ctx.moveTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.rotate(60*Math.PI/180);
ctx.lineTo(40,0);
ctx.stroke();

ctx.restore();
ctx.save();
ctx.beginPath();
ctx.moveTo(170,200);
ctx.lineTo(175,170);
ctx.lineTo(180,200);
ctx.lineTo(210,205);
ctx.lineTo(180,210);
ctx.lineTo(175,240);
ctx.lineTo(170,210);
ctx.lineTo(140,205);
ctx.lineTo(170,200);
ctx.stroke();

ctx.restore();
ctx.save();
ctx.beginPath();
ctx.moveTo(270,190);
ctx.lineTo(280,160);
ctx.lineTo(290,190);
ctx.lineTo(320,190);
ctx.lineTo(300,210);
ctx.lineTo(310,240);
ctx.lineTo(280,220);
ctx.lineTo(250,240);
ctx.lineTo(260,210);
ctx.lineTo(240,190);
ctx.lineTo(270,190);
ctx.stroke();

ctx.restore();
ctx.save();
b1.addEventListener("click",drawRect);
function drawRect() {
    ctx.beginPath();
    ctx.moveTo(325,160);
    ctx.rect(325,160,80,80);
    ctx.strokeStyle="blue";
    ctx.stroke();
    ctx.fillStyle = "red";
    ctx.fill();
}

ctx.restore();
ctx.save();
b2.addEventListener("click",showText);
function showText() {
    ctx.font ="30px serif";
    ctx.strokeStyle='blue';
    ctx.fillStyle='yellow';
    ctx.strokeText("Shapes are drawn!",50,300);
    ctx.fillText("Shapes are drawn!",50,300);
    
   
}




