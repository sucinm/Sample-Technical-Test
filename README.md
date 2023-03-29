## Sample Technical Test Made With ❤️ 

### Sort Char From String (NA** *A**)
**Input:**

One line of words


**Output:**

Contains vowel and consonant characters that has been sorted according to the following rules.
- Sort the letters according to the order they came out
- Separate between vowels and consonants
- Process as lowercase letters (whitespace are ignored)

| Input         | Output                                                                  | 
| ------------- |-------------------------------------------------------------------------| 
| Sample Case   | Vowel Characters : <br/> aaee <br/> Consonant Characters : <br/> ssmplc |
| Next Case     | Vowel Characters : <br/> eea <br/> Consonant Characters : <br/> nxtcs   | 


To create a Java program that sorts a string containing vowels and consonants, we can use the following logic:

- Get the input string from the user.
- Create two string variables to store the vowels and consonants in the input string.
- Traverse the input string character by character.
- If the current character is a vowel, append it to the vowels string. Otherwise, append it to the consonants string.
- Sort the vowels and consonants strings separately.
- Concatenate the sorted vowels and consonants strings to form the final sorted string.
- Display the final sorted string on the console.



### Minimum Bus Required (NA** D***)
**Problem:**

Mini bus can only carry at most 4 passangers.

**Input:**

The first line contains integer _n_ - number of families

The second line contains a sequence of integers. Integer are separated by a space, each integer is the number of members in the _family_


**Output:**

Print the single number - the minimum number of buses necessary to drive all family

Print "Input must be equal with count of family" if input number of family is not equal with count of family

| Input              | Output                                        | 
| ------------------ |:---------------------------------------------:| 
| 5 <br/> 2 3 4 5 5  | Minimum bus required is : 5                   |
| 3 <br/> 2 3 4 5    | Input must be equal with count of family      | 

The first line contains an integer n, which is the number of families. The second line contains a sequence of integers separated by a space, which represents the number of members in each family. In this example, there are 5 families, with 2, 4, 1, 3, and 5 members in each family, respectively.

We can read and parse this input in Java using the Scanner class as follows:
- Read the number of families.
- Create two integer variables to store the number of passanger and count from the input integer.
- Read each family size and calculate family size to passanger.
- Increase count every read each family size.
- If count not equal to number of family, print "Input must be equal with count of family". Otherwise, calculate the minimum bus.

### Unique Numbers (E****MI**)
**Problem:**

All numbers that occur exactly once in the input collection.

**Input:**

Array list of number

**Output:**

| Input           |                  Output                  | 
|-----------------|:----------------------------------------:| 
| 1, 2, 1, 3      |                   2, 3                   |

### The sum of the two largest elements (E****MI**)
**Problem:**

The largest sum of any two elements in the given list of positive numbers.

**Input:**

List of number

**Output:**

| Input        | Output | 
|--------------|:------:| 
| 5, 9, 7, 11  |  20    |
