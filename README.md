# Практична робота "Масиви, вирази, керування виконанням програми" 💻
## Завдання 15. Знайдіть друге за величиною число у заданому масиві.

* Проаналізувала обране завдання і обрала оптимальний алгоритм для його вирішення.
* Додала до класу  `Exercise` приватний метод `findSecondLargest`, параметром якого є масив integer-ів. Відповідно, цей метод знаходить друге за величиною число в заданому масиві та виводить його на консоль.
* Я змінила сигнатуру методу `Calculate` відповідно до свого завдання, тепер цей метод приймає масив integer-ів і викликає приватий метод `findSecondLargest`.
* В кінці своєї роботи над класом `Exercise` я додала javadoc-коментарі.
* Програмний код класу `Exercise` наведений нижче.

```java

package domain;
import java.util.Arrays;

public class Exercise {
    public static void Calculate(int[] arr) {
        findSecondLargest(arr);
    }
    
    /**
     * Finds the second largest number in the given array and prints it to the console.
     * If the array has fewer than two elements, prints an error message to the console and returns.
     *
     * @param arr the array of integers
     */
    private static void findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Масив повинен містити щонайменше два елементи");
            return;
        }
        
        //Sort the array in ascending order
        Arrays.sort(arr);
        
        //Get the penultimate element
        int secondLargest = arr[arr.length - 2];
        
        System.out.println("Другий за величиною елемент: " + secondLargest);
    }
}
```

* Також я внесла корективи до класу `TestResult` відповідно до свого завдання: ініціалізувала масив integer-ів, щоб потім в методі `main` викликати публічний метод `Calculate` класу `Exercise`.
* Програмний код класу `TestResult` наведений нижче.
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] theArray = {110, 24, 36, 453, 52, 340};
        
        Exercise.Calculate(theArray);
    }
}
```

* Перевірка працездатності класу `Exercise` ✅. Результат запуска коду наведений нижче.
![alt-текст](https://github.com/ppc-ntu-khpi/java-arrays-vellerii/blob/master/result.png "result.png")
