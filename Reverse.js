function reverseWords(sentence) 
{
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

// Example usage:
const inputA = 'This is a sunny day';
const outputA = reverseWords(inputA);
console.log(outputA);