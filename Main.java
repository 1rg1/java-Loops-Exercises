//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //1.Write a program that prints the numbers from 1 to 100 such that:
    //If the number is a multiple of 3, you need to print "Fizz" instead of that
    //number.
    //If the number is a multiple of 5, you need to print "Buzz" instead of that
    //number.
    //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
    //instead of that number.
    int num = 1;
    for (int i = 0; i < 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else continue;
        System.out.println(i);

    }


    //2.Write a Java program to reverse a string.
    //Test Data: Input a string: The quick brown fox Expected Output: Reverse
    //string: xof nworb kciuq ehT
    Scanner sc = new Scanner(System.in);

    System.out.println("Input a string: ");
    String next = sc.nextLine();
    int len = next.length();
    char reverce;

    for (int i = len - 1; i >= 0; i--) {
        reverce = next.charAt(i);
        System.out.print(reverce);
    }
    System.out.print("\n");

    //3.Write a program to find the factorial value of any number entered
    //through the keyboard.

    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    int fac=1;

    for (int i = 2 ; i <=number ; i++) {
        fac *= i;
    }
    System.out.println("The factorial value is "+fac);

    //4.Two numbers are entered through the keyboard. Write a program to find
    //the value of one number raised to the power of another. (Do not use Java
    //built-in method)

    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int value=1;
    for (int i=0 ; i < num2; i++) {
        value *= num1 ;
    }
    System.out.print("The value is " +value);



//5.Write a program that reads a set of integers, and then prints the sum of
//the even and odd integers.
    System.out.println("How many numbers you will enter? ");
    int numberOfNum = sc.nextInt();
    System.out.println("Enter the numbers: ");

    int totalOfEven=0;
    int totalOfOdd=0;
    for (int i=0 ; i < numberOfNum; i++) {
        int num_ber = sc.nextInt();
        if(num_ber%2==0)
            totalOfEven += num_ber ;
        else
            totalOfOdd += num_ber ;

    }
    System.out.println("The total of even number is "+totalOfEven);
    System.out.println("The total of even number is "+totalOfOdd);




// 6.Write a program that prompts the user to input a positive integer. It
//should then output a message indicating whether the number is a prime
//number.

    System.out.println("Please enter a positive number ");
    int positive = sc.nextInt();
    int count=0;
    for (int i=1 ; i <= positive; i++) {
         if (positive % i == 0)
           count++;
    }
    if (positive <= 0)
        System.out.println("Invalid number!");
    else if (count==2)
        System.out.println("It is a prime number! ");
    else
        System.out.println("Not a prime number! ");


//7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//another for loop to print the days (Days 1 -7) for each week.
//Expected Output:
//Week 1
//Day1
//Day2
//Day3
//Day4
//Day5
//Day6
//Day7
//Week 2
//Day1
//Day2
//...

    for (int i=1 ; i <= 4; i++) {
        System.out.println("Week"+i);
        for (int d=1 ; d <= 7; d++)
            System.out.println("Day"+d);
    }


//8.Write a program thats check if the word is a palindrome or not. hint: A
//string is said to be a palindrome if it is the same if we start reading it from
//left to right or right to left.

    System.out.println("Write the word please ");
    String word = sc.next();
    String revercedWord ="";
    for (int i=word.length()-1 ; i >= 0 ; i--)
        revercedWord += word.charAt(i);

    if (word.equals(revercedWord))
        System.out.println("It is a palindrome! ");
    else
        System.out.println("Not a palindrome! ");

}