let bx1= document.getElementById('box1');
let bx2= document.getElementById('box2');
let bt1=document.getElementById('bt1');
let bt2=document.getElementById('bt2');
let bt3=document.getElementById('bt3');
let bt4=document.getElementById('bt4');
let p1= document.getElementById('p1');
let p2= document.getElementById('p2');
let p3= document.getElementById('p3');
let myArray= new Array();

 bt1.addEventListener("click",pushArray)
 function pushArray(){
     myArray.push(bx1.value);
     p1.innerHTML= myArray;
 }
 bt2.addEventListener("click",removeElement)
 function removeElement(){
     myArray.pop(bx1.value);
     p1.innerHTML= myArray;
 }
 bt3.addEventListener("click",showElement)
 function showElement(){
    if(bx2.value<=myArray.length&& bx2.value>=0&&bx2.value!==NaN)
     {p2.innerHTML= myArray[bx2.value-1]}
    else{
    p2.innerHTML='Please enter a valid number'
    }
 }
 let reversedArray= new Array();
 bt4.addEventListener("click",reverseArray)
 function reverseArray(){
     for(let i=myArray.length-1; i>=0; i--){
        reversedArray.push(myArray[i]);
       p3.innerHTML='['+reversedArray.toString()+']';
     }
 }
     

 




 