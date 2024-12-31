
import java.util.Arrays;
import java.util.HashSet;


public class challenges {
    // Challenge 1 - Reverse a string
    public static String reverse(String str) {
        String reversed = "";
        // convertir la chaîne en tableau de caractères
        char[] chars = str.toCharArray();

        // boucler à travers le tableau de caractères en ordre inverse
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        return reversed;
    };

    // Challenge 2 - Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // utilise le code du challenge 1!
        String reversed = reverse(str);

        return reversed.equals(str);
    }

    // Challenge 3 - Generate Fibonacci sequence
    public static int[] generateFibonacci(int n) {
        //créer un tableau d'entiers de taille n
        int[] fib = new int[n];
        // initialiser les premiers éléments de la suite de Fibonacci
        if (n > 0)
            fib[0] = 0;
        if (n > 1)
            fib[1] = 1;

        // générer les nombres de la suite de Fibonacci
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Challenge 4 - Calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 0;
        int result = 1;

        // calculer le factoriel de n
        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
    }

    // Challenge 5 - Find the largest element in an array
    public static int findLargest(int[] arr) {
        int max = arr[0];

        // trouver le plus grand élément dans le tableau
        for (int num : arr)
            if (num > max)
                max = num;

        return max;
    }

    // challenge 6 - Sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        // calculer la somme des chiffres de n
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    // challenge 7 - Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        // vérifier si n est un nombre premier
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    // challenge 8 - Merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        // déclarer un tableau pour stocker les éléments fusionnés
        int[] merged = new int[arr1.length + arr2.length];

        // i est l'index pour arr1, j est l'index pour arr2, k est l'index pour merged
        int i = 0, j = 0, k = 0;

        // fusionner les deux tableaux
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
       
        // ajouter les éléments restants de arr1 et / ou arr2
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    // challenge 9 - Find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        // initialiser les variables pour stocker le plus grand et le deuxième plus
        // grand élément
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        // trouver le deuxième plus grand élément dans le tableau
        for (int num : arr) {
            if (num > first)
                first = num; 
        }
        for (int num : arr) {
            if (num > second && num < first)
                second = num;
        }
        return second;
    }

    // Challenge 10 - Remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        // utiliser un ensemble pour stocker les éléments uniques
        HashSet<Integer> set = new HashSet<>();
        for (int num = 0; num < arr.length; num++) {
            if (!set.contains(arr[num])) 
                set.add(arr[num]);
        }
        // convertir l'ensemble en tableau
        int[] result = new int[set.size()];
        int i = 0;
        for (int n:set){
            result[i] = n;
            i++;
        }

        return result;
    }

    // challenge 11 - Simple calculator using operators +, -, *, /
    public static double calculate(int num1, int num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = (double) num1 / num2;
                else 
                    System.err.println("erreur division par zero");
                break;
            
            default:
                break;
        }
        return result;
    }

    // challenge 12 - Using a lambda expression to output lowercase of a string
    public static void printLowerCase(String str) {
        // no lambda
        String low = str.toLowerCase();
        System.out.println(low);
        // no lambda
        System.out.println(str.toLowerCase());
        // i genuinely have no clue why and how i would use a lambda here
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
        System.out.println(isPrime(2147483647)); // Output: true

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

        // testing challenge 11
        System.out.print("Challenge 11: ");
        System.out.println(calculate(10, 5, '+')); // Output: 15.0
        System.out.println(calculate(10, 5, '-')); // Output: 5.0
        System.out.println(calculate(10, 5, '*')); // Output: 50.0
        System.out.println(calculate(10, 5, '/')); // Output: 2.0

        // Testing challenge 12
        System.out.print("Challenge 12: ");
        printLowerCase("HELLO"); // Output: hello
    }
}