let c = document.getElementById('myCanvas');
let ctx = c.getContext('2d');
ctx.save();
ctx.beginPath();
ctx.translate(60,60);
ctx.moveTo(0,0);
ctx.lineTo(10,-40);
ctx.lineTo(20,0);
ctx.save();
ctx.restore();
ctx.translate(20,0);
ctx.rotate(90*Math.PI/180);
ctx.lineTo(10,-40);
ctx.lineTo(20,0);
ctx.save();
ctx.restore();
ctx.translate(20,0);
ctx.rotate(90*Math.PI/180);
ctx.lineTo(10,-40);
ctx.lineTo(20,0);
ctx.save();
ctx.restore();
ctx.translate(20,0);
ctx.rotate(90*Math.PI/180);
ctx.lineTo(10,-40);
ctx.lineTo(20,0);



ctx.stroke();


