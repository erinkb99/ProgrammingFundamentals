package com.bryant;

public class JavaMethodExercisesOne {
    int numOne = 0;
    int numTwo = 0;


    static int addTwoNumbers(int numOne, int numTwo) {
        return numOne + numTwo;
    } // method 1

    static int subTwoNumbers(int numOne, int numTwo) {
        return numOne - numTwo;
    } //method 2

    static void hello(String[] studentNames) { //method 3
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("hello " + studentNames[i]);
        }
    }

    static boolean isOver30(int age) { //method 4
        return age > 30;
    }

    static int sum(int[] numbers) { //method 5
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int different(int numOne, int numTwo) { //method 6
        return java.lang.Math.abs(numOne - numTwo);
    }

    static void dayOfWeek(int number) { //method 7
        if (number == 1) {
            System.out.println("Sunday");
        } else if (number == 2) {
            System.out.println("Monday");
        } else if (number == 3) {
            System.out.println("Tuesday");
        } else if (number == 4) {
            System.out.println("Wednesday");
        } else if (number == 5) {
            System.out.println("Thursday");
        } else if (number == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }

    }

    static int[] oddNumbers(int upperLimit) { //method 8

        int[] oddNumbersList = new int[upperLimit];

        int counter = 0;
        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 != 0) {
                oddNumbersList[counter] = i;
                counter++;

            }
        }
        int[] oddNumberListFinal = new int[counter];
        counter = 0;
        for (int i = 0; i < oddNumbersList.length; i++) {
            if (oddNumbersList[i] != 0) {
                oddNumberListFinal[counter] = oddNumbersList[i];
                counter++;
            }
        }
        return oddNumberListFinal;
    }

    static int[] evenNumbers(int upperLimit) { //method 9

        int[] evenNumbersList = new int[upperLimit];

        int counter = 0;
        for (int i = 1; i < upperLimit; i++) {
            if (i % 2 == 0) {
                evenNumbersList[counter] = i;
                counter++;

            }
        }
        int[] oddNumberListFinal = new int[counter];
        counter = 0;
        for (int i = 0; i < evenNumbersList.length; i++) {
            if (evenNumbersList[i] != 0) {
                oddNumberListFinal[counter] = evenNumbersList[i];
                counter++;
            }
        }
        return oddNumberListFinal;
    }

    static void toUpperCase() { //method 10
    }

    static int numberOfItems(String[] studentNames) { //method 11
        int numberOfItems = 0;
        for (int i = 0; i < studentNames.length; i++) {
            numberOfItems++;
        }
        return numberOfItems;
    }

    static int greaterThan10(int[] numbers) { //method 12
        int greaterThan10 = 0;
        if (numbers.length > 10) {
            for (int i = 0; i < numbers.length; i++) {
                greaterThan10++;
            }
            return greaterThan10;
        }
        return greaterThan10;
    }

    static int lessThan10(int[] numbers) { //method 13
        int lessThan10 = 0;
        if (numbers.length < 10) {
            for (int i = 0; i < numbers.length; i++) {
                lessThan10++;
            }
            return lessThan10;
        }
        return lessThan10;
    }

    static int[] toArray(int numberOne, int numberTwo, int numberThree) { //method 14
        int[] toArray = {0};
        return toArray;
    }

    static void print(int[] numbers) { //method 15
        System.out.println(numbers);
    }

    static int[] larger(int[] setOne, int[] setTwo) { // method 16
        int sumOne = 0;
        int sumTwo = 0;
        int[] larger = {0};

        for (int i = 0; i < setOne.length; i++) {
            sumOne += setOne[i];
        }
        for (int i = 0; i < setTwo.length; i++) {
            sumTwo += setTwo[i];
        }
        if (sumOne > sumTwo) {
            larger = setOne;
        } else {
            larger = setTwo;
        }
        return larger; }


//MAIN
public static void main(String[]args){
        System.out.println(addTwoNumbers(2,3)); // method 1
        System.out.println(subTwoNumbers(2,3)); //method 2
        String[]studentNames={"John","Dan","Leah"}; // method 3
        hello(studentNames);
        boolean age;
        age=isOver30(37);
        System.out.println(age); // method 4
        int[]numbers={2,3,4,5};
        int sum;
        int[]oddNumbers;
        int[]evenNumbers;
        sum=sum(numbers);
        System.out.println(sum); //method 5
        System.out.println(different(4,9)); //method 6
        dayOfWeek(5); //method 7
        oddNumbers=oddNumbers(9);
        for(int i=0;i<oddNumbers.length;i++){
        System.out.println(oddNumbers[i]); // method 8
        }
        evenNumbers=evenNumbers(9);
        for(int i=0;i<evenNumbers.length;i++){
        System.out.println(evenNumbers[i]); // method 9
        }
        System.out.println("hey".toUpperCase()); //method 10

        System.out.println(numberOfItems(studentNames)); // method 11

        System.out.println(greaterThan10(numbers)); // method 12

        System.out.println(lessThan10(numbers)); // method 13

        System.out.println(toArray(1, 3, 4));

        print(numbers); //method 14

        int[] setOne ={1, 3, 7, 2, 9};
        int[] setTwo = {3, 8, 9, 2, 10};
        int[] larger = {0};
        System.out.println(larger(setOne, setTwo)); //method 16
        }


        }
