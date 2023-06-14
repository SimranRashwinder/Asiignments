let c=document.getElementById('myCanvas');
let b1=document.getElementById('button1');
let b2=document.getElementById('button2');
let b3=document.getElementById('button3');
let b4=document.getElementById('button4');
let b5=document.getElementById('button5');
let x=300;
let y=200;
let ctx=c.getContext('2d');
ctx.save();
ctx.restore();
b1.addEventListener("click",smileyFace);
function smileyFace(){
    ctx.beginPath();
    ctx.arc(x,y,40,0,2*Math.PI);
    ctx.stroke()
    ctx.fillStyle='yellow';
    ctx.fill();

    ctx.moveTo(x-20,y-19); 
    ctx.beginPath();
    ctx.arc(x-16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fillStyle='black';
    ctx.fill();

    ctx.moveTo(x+20,y-19);
    ctx.beginPath();
    ctx.arc(x+16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fill();

    ctx.moveTo(x,y);
    ctx.beginPath();
    ctx.arc(x,y,25,20*Math.PI/180,160*Math.PI/180);
    ctx.stroke();
    
}

b2.addEventListener("click",neutralFace);
function neutralFace(){
    ctx.beginPath();
    ctx.arc(x,y,40,0,2*Math.PI);
    ctx.stroke()
    ctx.fillStyle='yellow';
    ctx.fill();

    ctx.moveTo(x-20,y-19); 
    ctx.beginPath();
    ctx.arc(x-16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fillStyle='black';
    ctx.fill();

    ctx.moveTo(x+20,y-19);
    ctx.beginPath();
    ctx.arc(x+16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fill();

    ctx.beginPath();
    ctx.moveTo(x-12,y+15);
    ctx.lineTo(x+12,y+15);
    ctx.stroke();
}

b3.addEventListener("click",frowningFace);
function frowningFace(){
    ctx.beginPath();
    ctx.arc(x,y,40,0,2*Math.PI);
    ctx.stroke()
    ctx.fillStyle='yellow';
    ctx.fill();

    ctx.beginPath();
    ctx.arc(x-16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fillStyle='black';
    ctx.fill();

    ctx.beginPath();
    ctx.arc(x+16,y-14,4,0,2*Math.PI);
    ctx.stroke();
    ctx.fill();

    ctx.beginPath();
    ctx.arc(x,y+30,25,200*Math.PI/180,340*Math.PI/180);
    ctx.stroke();
}

b4.addEventListener("click",seilUp);
function seilUp(){
    if (y>=40&&y<=40){
              ctx.clearRect(0,0,600,400);
              y-=10;
              smileyFace();}
    else{
        
    }

}
    




b5.addEventListener("click",moveDown);
function moveDown(){
    ctx.clearRect(0,0,600,400);
    y+=10;
    smileyFace();
}