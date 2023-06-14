let c = document.getElementById('myCanvas');
bx1 = document.getElementById('box1');
b1 = document.getElementById('button1');
let ctx = c.getContext('2d');
let timerID = null;
let dotX = [];
let dotY = [];
let dotmX = [];
let dotmY = [];
let dotColor = [];
b1.addEventListener("click", runAnimation);
function runAnimation() {
    clearInterval(timerID);
    timerID = null;

    for (i = 0; i <= bx1.value; i++) {
        dotX[i] = 400;
        dotY[i] = 250;
        dotmX[i] = 20 * (Math.random() - 0.5);
        dotmY[i] = 20 * (Math.random() - 0.5);
        dotColor[i] = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')'

    }
    if (timerID == null) {
        timerID = setInterval(moveDots, 100);
    }

}
function moveDots() {
    ctx.clearRect(0, 0, 800, 500);
    for (let i = 0; i < bx1.value; i++) {
        ctx.beginPath();
        ctx.arc(dotX[i], dotY[i], 5, 0, 2 * Math.PI);
        dotX[i] += dotmX[i];
        dotY[i] += dotmY[i];
        ctx.fillStyle = dotColor[i];
        ctx.fill();
    }
}