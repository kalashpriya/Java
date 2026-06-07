# *☕ Java Programs and Their Questions*

Below are the questions corresponding to each program.  
## The outputs for each program are mentioned at the end as comment lines for reference.

---

# #Arrays-

## 1️⃣ Left Principal Diagonal Program  
**Question:** Write a Java program to print the left principal diagonal of a matrix.  

---

## 2️⃣ Right Principal Diagonal Program  
**Question:** Write a Java program to print the right principal diagonal of a matrix.  

---

## 3️⃣ Saddle Point Program  
**Question:** Write a Java program to find the saddle point of a matrix.  

---

## 4️⃣ Clockwise Matrix Fill Program  
**Question:** Write a Java program to fill a matrix in clockwise order.  

---

## 5️⃣ Positive Elements Sorting Program  
**Question:** Write a Java program to enter positive elements into a matrix and arrange them in ascending order.  

---

## 6️⃣ Square Matrix Operations Program  
**Question:** Write a Java program to design a square matrix of order *n × n* (where 2 < n < 10).  
Perform the following tasks:  
1. Display the original matrix.  
2. Rotate the matrix 90° clockwise.  
3. Calculate the sum of the four corner elements of the matrix.  

---

## 7️⃣ Missing Numbers in Array Program  
**Question:** Write a Java program to store 20 numbers in a single‑dimensional array and arrange them in ascending order using any standard sorting technique.  
Display all missing numbers that make the series continuous in ascending order up to the last number.  

---

## 8️⃣ Column Sorting Program  
**Question:** Write a Java program to sort the column elements of a matrix in ascending order.  

---

## 9️⃣ Non‑Boundary Elements Sorting Program  
**Question:** Write a Java program to sort the non‑boundary elements of a matrix in descending order using Selection Sort.  

---

## 🔟 Transpose Program  
**Question:** Write a Java program to find the transpose of a matrix.  

---

# #Strings-

## 1️⃣1️⃣ Alphabetical Names Sorting Program  
**Question:** Write a Java program to accept $n$ number of names into a single-dimensional array and arrange them in alphabetical order using standard string sorting techniques. Display the final sorted list.

---

## 1️⃣2️⃣ Dual-Vowel Enclosed Words Segregation Program  
**Question:** Write a Java program to accept a string sentence.  
> ⚠️ **Input Constraint:** The sentence **must** terminate with a punctuation mark ('.', '?', or '!'), otherwise processing will be skipped.  
  
Convert the sentence to uppercase and filter out all words that both **begin and end with a vowel**. Print the count of such words, followed by a reconstructed sentence where these specific words are shifted to the front while maintaining the relative order of the remaining words.

---

## 1️⃣3️⃣ Pangram Tester and Length Extractor Program  
**Question:** Write a Java program to accept a string sentence.  
> ⚠️ **Input Constraint:** The sentence **must** terminate with a trailing punctuation mark (like a period '.') as the program trims the final character before parsing words.  
  
Check whether the input text is a **Pangram** (contains all 26 letters of the English alphabet from A to Z, case-insensitive). Additionally, extract and display the longest word and the shortest word present in the text sequence.

---

## 1️⃣4️⃣ ROT13 Caesar Cipher Encryption Program  
**Question:** Write a Java program to implement a classic Caesar Cipher (ROT13) encryption. The program should accept a text input (valid length between 4 and 99 characters) and shift each alphabetic character by 13 positions forward or backward within its case boundaries. Non-alphabetic characters should remain unchanged.

---

## 1️⃣5️⃣ Vowel-Terminated Words Extractor Program  
**Question:** Write a Java program to accept a sentence and extract and print each word that **ends with a vowel** on a new line.

---

## 1️⃣6️⃣ Character ASCII Map Generator Program  
**Question:** Write a Java program to generate and display a tabulated mapping of integer ASCII values ranging from 48 to 122 alongside their corresponding character representations.

---

## 1️⃣7️⃣ String Character Classifier & Counter Program  
**Question:** Write a Java program to accept a sentence and analyze its individual characters (ignoring spaces). Count and display:
1. Total number of lowercase characters
2. Total number of uppercase characters
3. Total number of numerical digits
4. Total number of special characters

---

## 1️⃣8️⃣ Vowel, Digit, and Special Character Word Filter Program  
**Question:** Write a Java program to accept a string, convert it to lowercase, and check each word. If a word contains *at least one* digit, special character, or vowel, print that word.

---

## 1️⃣9️⃣ Palindrome Word Checker with ASCII Summation Program  
**Question:** Write a Java program to accept a single word and check if it is a palindrome (case-insensitive). 
* If it is a palindrome, compute and display the sum of the ASCII values of all its characters.
* If it is not a palindrome, compute and display the sum of the ASCII values of only its first and last characters.

---

## 2️⃣0️⃣ Object-Oriented Character Sorting Program  
**Question:** Design a class `_20Arrange` that sorts the characters of an input word alphabetically according to their structural ASCII values (Uppercase followed by Lowercase). Implement the class with the following components:
* **Instance Variables:** To hold the original string and the processed string.
* **Constructor:** To initialize data members.
* **`void compute()`:** To sort and arrange the string characters dynamically.
* **`void display()`:** To print the rearranged string.
* **`main()` method:** To instantiate the object and drive execution.

---

## 2️⃣1️⃣ Word Length Sort and Sentence Reformatter Program  
**Question:** Write a Java program to accept a sentence string and reformat its arrangement based on word sizes.  
> ⚠️ **Input Constraints:** > 1. The sentence **must** end with a full stop ('.').  
> 2. The entire string input **must** be provided in lowercase letters initially.  
  
The program will display the input with its first letter capitalized. It should then parse the sentence, sort all of the individual words in ascending order of their lengths, and generate an output sentence that begins with a capitalized character and ends properly with a full stop.

---

## 2️⃣2️⃣ Tabular Banner Text Alignment Program  
**Question:** Write a Java program to display names vertically in a tabular format, resembling a banner. The program should perform the following tasks:
1. Accept an integer $n$ representing the total number of names (where $2 < n < 9$). If the value falls outside this range, print an invalid input message and terminate.
2. Accept $n$ individual string names from the user.
3. Determine the maximum length among all entered names.
4. Output the strings column-by-column separated by horizontal tabs (`\t`) such that the first characters of all names appear sequentially in the first row, the second characters in the second row, and so on. Shorter names should leave blank positions once their characters are exhausted.
