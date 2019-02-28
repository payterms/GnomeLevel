package Lesson1;

import java.util.*;

class MainApp {
    public static void main(String[] args) {
        Integer[] arrInt = {666, 77, 888};
        String[] arrString = {"one", "zwei", "dry"};
        Object[] arrObj = {"unf",2 , "zwei"};
        Character[] charArray = {'a', 'b', (byte) 39, (byte) 0x32, 250};

        ArrayTransformer.swap(arrInt, 2, 0);
        System.out.println(Arrays.toString(arrInt));
        ArrayTransformer.swap(arrString, 2, 0);
        System.out.println(Arrays.toString(arrString));
        ArrayTransformer.swap(arrObj, 2, 0);
        System.out.println(Arrays.toString(arrObj));
        List<Character> list = ArrayTransformer.convertToList(charArray);
        System.out.println(list);

        /* FRUITTY SECTION */
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("appleBox :" + appleBox.getMass());// масса коробки с яблоками
        System.out.println("orangeBox :" + orangeBox.getMass());// масса коробки с апельсинами
        System.out.println(appleBox.compare(orangeBox));



    }

}