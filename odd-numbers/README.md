Use the logic of number - [ ( number / 2 ) * 2 )
where the division of an integer truncates
the decimal value, givin a whole number.

NOTE that we say "truncate", not "round-off" 

For instance, given a number of 5:

```bash
   5 - ((5/2) * 2)
-> 5 - ((2.5) * 2)  # Int is truncated from 2.5 to 2
-> 5 - (2 * 2) 
-> 5 - 4 
-> 1
```

Also, when the number is 4: 

```bash
   4 - ((4/2) * 2)
-> 4 - (2*2) 
-> 4 - 4 
-> 0
```

If the value difference is zero, then the
number is even. Otherwise, the number is odd.

Input: A list of numbers.

|   |   |   |   |   |   |   |
| - | - | - | - | - | - | - |  
| 7 | 2 | 5 | 6 | 1 | 3 | 4 |
|   |   |   |   |   |   |   |

Calculation table:

| Number | Half | Truncated | Whole     | Evaluation | Difference | Boolean | Even/Odd  |
| ------ | ---- | --------- | --------- | ---------- | ---------- | ------- | --------- |
| 7 | 7/2 = 3.5 | 3         | 3 * 2 = 6 | 7 - 6 = 1  | 1          | False   | 7 is odd  |
| 2 | 2/2 = 1   | 1         | 1 * 2 = 2 | 2 - 2 = 0  | 0          | True    | 2 is even |
| 5 | 5/2 = 2.5 | 2         | 2 * 2 = 4 | 5 - 4 = 1  | 1          | False   | 5 is odd  |
| 6 | 6/2 = 3   | 3         | 3 * 2 = 6 | 6 - 6 = 0  | 0          | True    | 6 is even |
| 1 | 1/2 = 0.5 | 0         | 0 * 2 = 0 | 1 - 0 = 1  | 1          | False   | 1 is odd  |
| 3 | 3/2 = 1.5 | 1         | 1 * 2 = 2 | 3 - 2 = 1  | 1          | False   | 3 is odd  |
| 4 | 4/2 = 2   | 2         | 2 * 2 = 4 | 4 - 4 = 0  | 0          | True    | 4 is even |

---

This should be the end result:

```bash
🚀 java IntegerDivisionExample.java 
        
7 is odd
2 is even
5 is odd
6 is even
1 is odd
3 is odd
4 is even
```