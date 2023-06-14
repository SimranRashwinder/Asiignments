function calculateYears() {
    let a = prompt('Please enter a number');
    let futureyear = 2022+Number(a); // error in this line, Hint: assignment order
    let pastyear = 2022-a; // error in this line, Hint: assignment order
    alert(a +  ' years from now is year '  + futureyear +  ', and ' + a +  ' years ago was year '  + pastyear  +'.');
    // find and errors in this function to show the correct message like ' 3 years from now is year 2025, and 3 years ago was year 2019.'
    // Double check the result
}

function rollDice(){
    let a= Math.random()*6+1;
    let b= Math.floor(a);
    alert('The point you get this time is '+ b );
    //Write code here to get a random integer from 1 and 6
    //Use alert() to show the result as 'The point you get this time is INTEGER'

}

function getVolumeOfSphere() {
    let r = prompt('Please enter the radius of the sphere in meters.'); 
    let V = 4/3*Math.PI*Number(r)*Number(r)*Number(r);
    alert('The volume of a sphere with radius of '+ r +' m is ' + V +' m^3');
    //Write code here to ask your user to input the radius of the sphere with message 'Please enter the radius of the sphere in meters.'
    //Write code here to calculate the volume
    //User alert() to to show the result as 'The volume of a sphere with radius of RADIOUS m is m^3'
    //Write code here to return the value

}


