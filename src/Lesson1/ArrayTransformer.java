package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTransformer {

    /**
     * 1. Написать метод, который меняет два элемента массива местами.
     * (массив может быть любого ссылочного типа);
     */
    static <T> void swap(T[] arr, int firstIndex, int secondIndex) {
        T bufferElement = arr[firstIndex]; // буферный элемент для сохранения значения типа T
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = bufferElement;
    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */
    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}