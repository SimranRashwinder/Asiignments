let c = document.getElementById('myCanvas');
let bt1 = document.getElementById('button1');//button to start the level1
let bt2 = document.getElementById('button2');//buttob to start the level2
let ctx = c.getContext('2d');
let b1 = document.getElementById('box1');//box in which scores are displayed
let myArray = new Array();//for scores
let timerID = null;
let r = 16;//radius of balls
let dotX = [];
let dotY = [];
let dotmY = [];
let dotColor = [];
bt1.addEventListener("click", runAnimation);//For animation---moving the balls in the canvas.
bt1.addEventListener('click', setTime);//it will set the time in background for 30 seconds for level1
bt2.addEventListener('click', runAnimation);//For animation---moving the balls in the canvas.
bt2.addEventListener('click', setLevel)//this will start the timer in the background for 15 seconds for level2
c.addEventListener('click', clickDot);//this is for click on the canvas that is for clicking on balls
function runAnimation() {
    clearInterval(timerID);
    timerID = null;

    for (i = 0; i <= 40; i++) {
        dotX[i] = Math.random() * 650;
        dotY[i] = 0;
        dotmY[i] = 10 * Math.random() + 10;
        dotColor[i] = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')'

    }
    if (timerID == null) {
        timerID = setInterval(moveDots, 100);
    }

}//for moving the balls
function moveDots() {
    ctx.clearRect(0, 0, 650, 600);
    for (let i = 0; i <= 40; i++) {
        ctx.beginPath();
        ctx.arc(dotX[i], dotY[i], 16, 0, 2 * Math.PI);
        dotY[i] += dotmY[i];
        ctx.fillStyle = dotColor[i];
        ctx.fill();
        if (dotY[i] >= 300) {
            dotY[i] = 0;
        }
    }
}//moving the balls

function clickDot(e) {
    let clickX = e.offsetX;
    let clickY = e.offsetY;
    for (i = 0; i < dotX.length; i++) {
        let c = ((clickX - dotX[i]) ** 2) + ((clickY - dotY[i]) ** 2);
        let r = 16;
        if (Math.sqrt(c) <= r) {
            myArray.push(1);
            b1.value = myArray.length;
            dotX.splice(i, 1);
            dotY.splice(i, 1);
            dotmY.splice(i, 1);
            dotColor.splice(i, 1);
        }
    }
}//this was for click on the canvas and array is used to update the points earned.

function setTime() {
    setTimeout(myFunction, 30000);
}
function setLevel() {
    setTimeout(myFunction, 15000);
}
function myFunction() {
    if (b1.value >= 30) {
        clearInterval(timerID);
        ctx.clearRect(0, 0, 650, 500);
        ctx.font = "70px arial";
        ctx.strokeText("Congrats! You Win!", 10, 250);
        ctx.strokeStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
        ctx.fillText("Congrats! You Win!", 10, 250);
        ctx.fillStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
    }
    else {
        alert('Your time is out and your score is ' + b1.value + '. Better luck next time.');
        clearInterval(timerID);
        ctx.clearRect(0, 0, 650, 500);
        ctx.font = "100px arial";
        ctx.strokeText("Game Over!", 40, 250);
        ctx.strokeStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
        ctx.fillText("Game Over!", 40, 250);
        ctx.fillStyle = 'rgb(' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
    }

}//setTime is for timer and I used if else statement to show the win or lose.
/*I used the knowledge from lectures and previous labs and I also used some code from w3c schools site.*/
