let c = document.getElementById('myCanvas');
let b1 = document.getElementById('button1');
let b2 = document.getElementById('button2');
let bx1 = document.getElementById('box1');

let ctx = c.getContext('2d');
ctx.save();
b1.addEventListener("click", paintDot);
function paintDot() {
    ctx.clearRect(0, 0, 800, 400);
    

    if (bx1.value >= 1 && bx1.value <= 100) {
        for (let i = 1; i <= Number(bx1.value); i++) {
            let x = 800*Math.random();
            let y = 400*Math.random();
            let r = 45 * Math.random() + 5;
            ctx.beginPath();
            ctx.save();
            ctx.arc(x, y, r, 0, 2 * Math.PI);
            ctx.fillStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
            ctx.fill();
        }
    }
    else {
        alert('Input is not valid.')
    }
}

b2.addEventListener("click", paintStar);
function paintStar() {
    ctx.restore();
    ctx.clearRect(0,0,800,400);

    if (bx1.value >= 1 && bx1.value <= 100) {
        for (let i = 1; i <= Number(bx1.value); i++) {
            let x = 800*Math.random();
            let y = 400*Math.random();
            let r = 45 * Math.random() + 5;
            ctx.restore();
            ctx.save();
            ctx.beginPath();
            ctx.translate(x,y);
            ctx.moveTo(0,0);
            ctx.lineTo(r,-4*r);
            ctx.lineTo(2*r,0);
            ctx.save();
            ctx.restore();
            ctx.translate(2*r,0);
            ctx.rotate(90*Math.PI/180);
            ctx.lineTo(r,-4*r);
            ctx.lineTo(2*r,0);
            ctx.save();
            ctx.restore();
            ctx.translate(2*r,0);
            ctx.rotate(90*Math.PI/180);
            ctx.lineTo(r,-4*r);
            ctx.lineTo(2*r,0);
            ctx.save();
            ctx.restore();
            ctx.translate(2*r,0);
            ctx.rotate(90*Math.PI/180);
            ctx.lineTo(r,-4*r);
            ctx.lineTo(2*r,0);
            ctx.closePath();
            ctx.fillStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
            ctx.fill();
    }
}

    else{ alert('Your input is not valid.')
}
}



