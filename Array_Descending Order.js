function sortDescending(arr) 
{
    return arr.sort((a, b) => b - a);
}

const inputB = [5, 1, 3, 8, 2];
const outputB = sortDescending(inputB);
console.log(outputB);

/* 

                  this code won't work in vs code, so try to copy and execute this code in web browser's developer tool

function sortDescending(arr) 
{
    return arr.sort((a, b) => b - a);
}

const inputB = [];
for(var i = 0; i <= 5; i++)
{
    inputB[i] = parseInt(prompt("Enter a value for the index " + i));
}
const outputB = sortDescending(inputB);
console.log(outputB);

 */

