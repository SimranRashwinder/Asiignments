let c = document.getElementById('myCanvas');
let b1 = document.getElementById('button1');
let ctx = c.getContext('2d');
b1.addEventListener("click", startGame);
let timerID = null;
let x = 300;
let y = 300;
let a = 0;
let b = 0;
let r=20;

function startGame() {
    clearInterval(timerID);
    timerID = null;

    if (timerID == null) {

        timerID = setInterval(moveDot, 100);
        a = 30 * Math.random() - 5;
        b = 30 * Math.random() - 5;

    }
}
function moveDot() {

    if (x >= 600 || y >= 600) {
        alert('Oops!The dot has escaped!')
        x = 300;
        y = 300;
        clearInterval(timerID);
        timerID = null;
    }
    else {
        ctx.clearRect(0, 0, 600, 600);
        ctx.save();
        ctx.restore();
        ctx.beginPath();
        ctx.arc(x, y, r, 0, 2 * Math.PI);
        ctx.fillStyle = "green";
        ctx.fill();
        x += a;
        y += b;
        ctx.restore();
        ctx.save();

    }
}
c.addEventListener("click", clickDot)
function clickDot(e) {
    let clickX = e.offsetX;
    let clickY = e.offsetY;
    let c = (clickX - x) ** 2 + (clickY - y) ** 2;
    let r =20;
    if (Math.sqrt(c) <= r) {
        alert('BIngo! The dot is caught and will disappear')
        clearInterval(timerID);
        timerID = null;
        ctx.clearRect(0, 0, 600, 600);
        ctx.restore();
        ctx.save();
    }

}

