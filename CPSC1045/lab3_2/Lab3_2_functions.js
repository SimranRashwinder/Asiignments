function getSeconds(){
   let a= Number(prompt('Enter a number(0-23) for the hour of the current time')); //Write code here to ask your user to enter a number(0-23) for the hour of the current time, convert to number
    
   let b= Number(prompt('Enter a number (0-59) for the minute of the current time'))//Write code here to ask your user to enter a number(0-59) for the minute of the current time, convert to number
    
   let c= Number(prompt('Enter a number (0-59) for the second of the current time')) //Write code here to ask your user to enter a number(0-59) for the second of the current time, convert to number
   
   let total= ((a*3600) + (b*60) + c);
      //Write code here to calculate the total seconds
    
   alert('The current time '+ a +':'+b+':'+c+'is '+ total +' seconds after 12:00AM.')   //Write code here to use alert to show the result
    
}

function getHMS(){
   let a =Number(prompt('Enter a number(0-86399) for the seconds')); //Write code here to ask users' input of the seconds, covert to number
    

    let b= Math.floor(a/3600);
    let c= Math.floor((a%3600)/60); 
    let d= ((a%3600)%60); //Write code here to calculate the number of hour, minute, and secods
   


   alert(a + 'seconds after 12:00AM is '+b+':'+c+':'+d+ '.');//Write code here to use alert to show the result
  
}

function calculateFreeFallTime(height, initialVelocity, gravity){
    let a=Math.pow(initialVelocity,2)+2*gravity*height;
   ;//Write code here to calculate the fall time of the object

   time=(Math.pow(a,0.5)-initialVelocity)/gravity ;//Write code here to return the result

}

function compareFreeFallTime(){

    let a=prompt('Enter the name of the first planet.');//Write code here to ask users' input of planet name of the first planet

    let h1 =Number(prompt('Enter the height of the free fall in meters on the planet '+ a)); //Write code here to ask users' input of height of the free fall on the first planet, covert to number

    let v1= Number(prompt('Enter the initial downward velocity in meters/sec on the planet '+ a)) //write code here to ask users' input of initial downward velocity, covert to number

    let g1= Number(prompt('Enter the gravity in meters/sec^2 on planet '+ a)); //Write code here to ask users' input of gravity of the first planet, covert to number

    let b=prompt('Enter the name of the second planet.');//Write code here to ask users' input of planet name of the second planet
 
    let h2 = Number(prompt('Enter the height of the free fall in meters on the planet '+ b));//Write code here to ask users' input of height of the free fall on the second planet, covert to number

    let v2= Number(prompt('Enter the initial downward velocity inb meters/sec on the planet '+ b));//Write code here to ask users' input of initial downward velocity, covert to number

    let g2= Number(prompt('Enter the gravity in meters/sec^2 on planet '+ b));//Write code here to ask users' input of gravity of the second planet, covert to number

    let t1 =Number((Math.pow(Math.pow(v1,2) +2*g1*h1,0.5)-v1)/g1);
    let num1 = t1.toPrecision(2);/* Write code here to call the calculateFreeFallTime(height, intialVelocity, gravity) function to 
    calculate the fall time of an object on the first planet */
    

    let t2 = Number((Math.pow(Math.pow(v2,2) +2*g2*h2,0.5)-v2)/g2);
    let num2 = t2.toPrecision(2);
   /* Write code here to call the calculateFreeFallTime(height, intialVelocity, gravity) function to 
    calculate the fall time of an object on the second planet */

   alert('The free fall of an object on planet '+ a +' without air from the height of '+ h1+' with initial downward velocity of 0 is approximately '+num1+' second, while the free fall of an object on planet '+ b+' without air from the height of '+ h2 +' with initial download velocity of 0 is approximately '+num2 +' Seconds.')  //Write code here to use alert to show the results 


   
}

