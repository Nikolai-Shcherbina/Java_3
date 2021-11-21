package ru.geekbrains.shcherbina.hw_1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] arr = {"Jon", "Bob", "Pit", "Alice", "Carol", "Jean", "Alexis"};
        toSwapsElements(arr, 2, 4);
        ArrayList<String> b = convertToList(arr);
        b.add("Hello");
        System.out.println(b);

        Box <Fruit> box1 = new Box<>();
        Box <Apple> box2 = new Box<>();
        Box <Orange> box3 = new Box<>();
        box2.addFruit(new Apple());
        box3.addFruit(new Orange());
        box2.transference(box1);
        box3.transference(box1);

    }

    // метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
    public static <T> void toSwapsElements(T[] arr, int index_num_1, int index_num_2) {
        T temp_var = arr[index_num_1];
        arr[index_num_1] = arr[index_num_2];
        arr[index_num_2] = temp_var;
    }

    // метод, который преобразует массив в ArrayList
    private static <T> ArrayList<T> convertToList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}

