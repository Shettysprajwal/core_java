/*
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.


greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10 */

public int greenTicket(int a, int b, int c) {
    if (a == b && b == c) {
             return 20; // All values are the same
         } else if (a == b || a == c || b == c) {
             return 10; // Two values are the same
         } else {
             return 0; // All values are different
         }
         
 }