// import static org.junit.jupiter.api.Assertions.assertEquals;
/*адан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа. */
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.print("Вывожу чётные числа: ");
    System.out.println();
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }
  }
}