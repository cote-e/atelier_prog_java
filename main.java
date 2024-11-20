
import java.util.Arrays;
import java.util.HashSet;

public class main {
    // Challenge 1 - Reverse a string
    public static String reverse(String str) {
        // l'objet StringBuilder pourrait être utile...
        return new StringBuilder
    }

    // Challenge 2 - Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = 
        return str.equals
    }

    // Challenge 3 - Generate Fibonacci sequence
    public static int[] generateFibonacci(int n) {
        // initialiser un tableau d'entiers de taille n
        int[] fib = 
        if (n > 0)
            fib[0] = 0;
        if (n > 1)
            fib[1] = 1;
        // générer les nombres de la suite de Fibonacci
        return fib;
    }

    // Challenge 4 - Calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 0;
        int result = 1;
        // calculer le factoriel de n
        return result;
    }

    // Challenge 5 - Find the largest element in an array
    public static int findLargest(int[] arr) {
        int max = arr[0];
        // trouver le plus grand élément dans le tableau
        return max;
    }

    // challenge 6 - Sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        // calculer la somme des chiffres de n
        return sum;
    }

    // challenge 7 - Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        // vérifier si n est un nombre premier
        return true;
    }

    // challenge 8 - Merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        // déclarer un tableau pour stocker les éléments fusionnés
        int[] merged = 

        // i est l'index pour arr1, j est l'index pour arr2, k est l'index pour merged
        int i = 0, j = 0, k = 0;

        // fusionner les deux tableaux
       
        // ajouter les éléments restants de arr1 

        // ajouter les éléments restants de arr2 

        return merged;
    }

    // challenge 9 - Find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        // initialiser les variables pour stocker le plus grand et le deuxième plus grand élément
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // trouver le deuxième plus grand élément dans le tableau
        for (int num : arr) {
        }
        return second;
    }

    // Challenge 10 - Remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        // utiliser un ensemble pour stocker les éléments uniques
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        // convertir l'ensemble en tableau
        int[] result = new int[set.size()];
        return result;
    }

    public static void main(String[] args) {
        // Testing challenge 1
        System.out.print("Challenge 1: ");
        System.out.println(reverse("hello")); // Output: "olleh"

        // Testing challenge 2
        System.out.print("Challenge 2: ");
        System.out.println(isPalindrome("racecar")); // Output: true

        // Testing challenge 3
        int[] fib = generateFibonacci(10);
        System.out.print("Challenge 3: ");
        for (int num : fib) {
            System.out.print(num + " "); // Output: 0 1 1 2 3 5 8 13 21 34
        }
        System.out.println("");

        // Testing challenge 4
        System.out.print("Challenge 4: ");
        System.out.println(factorial(5)); // Output: 120

        // Testing challenge 5
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Challenge 5: ");
        System.out.println(findLargest(arr)); // Output: 5

        // Testing challenge 6
        System.out.print("Challenge 6: ");
        System.out.println(sumOfDigits(1234)); // Output: 10

        // Testing challenge 7
        System.out.print("Challenge 7: ");
        System.out.println(isPrime(7)); // Output: true

        // Testing challenge 8
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        System.out.print("Challenge 8: ");
        System.out.println(Arrays.toString(merge(arr1, arr2))); // Output: [1, 2, 3, 4, 5, 6]

        // testing challenge 9
        int[] arr3 = { 1, 2, 3, 4, 5 };
        System.out.print("Challenge 9: ");
        System.out.println(findSecondLargest(arr3)); // Output: 4

        // Testing challenge 10
        int[] arr4 = { 1, 2, 2, 3, 4, 4, 5 };
        System.out.print("Challenge 10: ");
        System.out.println(Arrays.toString(removeDuplicates(arr4))); // Output: [1, 2, 3, 4, 5]
    }
}