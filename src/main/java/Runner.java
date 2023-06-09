import javax.swing.plaf.metal.MetalBorders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

////        SCOTTISH ISLANDS
//        List<String> scottishIslands = new ArrayList<>();
//        scottishIslands.add("Jura");
//        scottishIslands.add("Mull");
//        scottishIslands.add("Skye");
//        scottishIslands.add("Arran");
//        scottishIslands.add("Tresco");
//
////        1. Add "Coll" to the end of the list
//        scottishIslands.add("Coll");
//
////        2. Add "Tiree" to the start of the list
//        scottishIslands.add(0, "Tiree");
//
////        3. Add "Islay" after "Jura" and before "Mull"
//        scottishIslands.add(2, "Islay");
//
////        4. Print out the index position of "Skye"
//        int indexOfSkye = scottishIslands.indexOf("Skye");
//        System.out.println(indexOfSkye);
//
////        5. Remove "Tresco" from the list by name
//        scottishIslands.remove("Tresco");
//
////        6. Remove "Arran" from the list by index
//        scottishIslands.remove(5);
//
////        7. Print the number of islands in your arraylist
//        int numberIslands = scottishIslands.size();
//        System.out.println("number of islands: " + numberIslands);
//
////        8. Sort the list alphabetically
//        Collections.sort(scottishIslands);
//
////        9. Print out all the islands using a for loop
//        for (String scottishIsland : scottishIslands) {
//            System.out.println(scottishIsland);
//        }
//
////        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

////        1. Print out a list of the even integers
//        List<Integer> evenNumbers = new ArrayList<>();
//        for (int number : numbers) {
//            if (number % 2 == 0){
//                evenNumbers.add(number);
//            }
//        }
//        System.out.println("Even numbers are:" + evenNumbers);



////        2. Print the difference between the largest and smallest value
//        System.out.println(Collections.max(numbers) - Collections.min(numbers));



////        3. Print True if the list contains a 1 next to a 1 somewhere.

//        METHOD 1:
//        boolean outcome = false;
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1){
//                outcome = true;
//            }
//        }
//        System.out.println("There a 1 next to another 1 in this list? This statement is " + outcome + ".");

//        METHOD 2: I did during the lab:
//        String result = "";
//        for (int i = 0; i < numbers.size() - 1; i++){
//            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1 ){
//                result = "True";
//                break;
//            } else {
//                result = "False!";
//            }
//        }
//        System.out.println(result);



////        4. Print the sum of the numbers:

//        METHOD 1:
//       int sumOfNumbers = 0;
//        for ( int number : numbers){
//            sumOfNumbers += number;
//        }
//        System.out.println("this is the sum of the arraylist: " + sumOfNumbers);

//        METHOD 2:
//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++){
//            sum += numbers.get(i);
//        }
//        System.out.println(sum);




////        5. Print the sum of the numbers...
////           ...except the number 13 is unlucky, so it does not count...
//
//
////           ...and numbers that come immediately after a 13 also do not count.
//             So [2, 7, 13, 2] would have sum of 9.


//        METHOD 1:

//        int unluckySum = 0;
//        for (int number : numbers){
//            if( number == 13){
//                break;
//            }
//            unluckySum += number;
//        }
//        System.out.println(unluckySum);

//        METHOD 2:

//        int unluckySum = 0;
//        for (int i = 0; i < numbers.size(); i++){
//            if (numbers.get(i)==13){
//                break;
//            }
//            unluckySum += numbers.get(i);
//        }
//        System.out.println(unluckySum);

    }
}
