import java.util.Scanner;

public class CountNumbersWithDigit5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt the user to enter the value of n
System.out.print(&quot;Enter a positive integer n: &quot;);
int n = scanner.nextInt();

// Close the scanner
scanner.close();

int count = 0; // Initialize a counter for numbers with the digit 5

for (int i = 1; i &lt;= n; i++) {
int number = i;

// Check each digit of the number
