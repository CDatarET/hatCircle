/*Problem Description: 
At a recent social gathering, N people sit around a circular table, where N is even. 
The seats are numbered clockwise from 1 to N. Each person is wearing a hat with a number on it. 
Specifically, the person at seat "i" is wearing a hat with the number H"i" on it. 
Each person looks at the person who is directly across (diametrically opposite) them in the circle. 
Determine the number of people who see someone with a hat with the same number as their own.

Input Specification: 
The first line of input will consist of one even positive integer N, representing the number of people at the social gathering. 
The next N lines each contain a single non-negative integer H"i", representing the hat number of person "i".

Sample Input 1 
4 0 1 0 1 Output for Sample Input 1 4

Sample Input 2 4 1 0 0 1 Output for Sample Input 2 0
*/

import java.util.Scanner;

public class hatCircle{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);

        int match = 0;
        int N = scan.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        for (int j = 0; j < N/2; j++) {
            if (array[j]==array[j+(N/2)]) {
                match++;
            }
        }

        match = match*2;
        System.out.println(match);
    }
}