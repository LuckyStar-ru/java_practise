package ru.novikov.practika.two.tenth;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
// НЕ ПРОВЕРЕНО ПРЕПОДОВАТАЛЕМ
public class Main {

    public static void main(String[] args) {
        //Написать метод для конвертации массива строк/чисел в список.
        List<Object> objectList = convert("bsad", "asdasd");
        System.out.println(objectList.toString() + ' ' + objectList.getClass());
        //Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
    }

    public static List<Object> convert(Object... objects) {
        return Arrays.asList(objects);
    }
}
class AnyObjectList<E>
{
    private final E[] a;

    AnyObjectList(E[] array) {
        a = Objects.requireNonNull(array);
    }

    public int size() {
        return a.length;
    }

    public E get(int index) {
        return a[index];
    }

    public int indexOf(Object o) {
        E[] a = this.a;
        if (o == null) {
            for (int i = 0; i < a.length; i++)
                if (a[i] == null)
                    return i;
        } else {
            for (int i = 0; i < a.length; i++)
                if (o.equals(a[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(a, Spliterator.ORDERED);
    }

    public void forEach(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        for (E e : a) {
            action.accept(e);
        }
    }

    public void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        E[] a = this.a;
        for (int i = 0; i < a.length; i++) {
            a[i] = operator.apply(a[i]);
        }
    }

    public void sort(Comparator<? super E> c) {
        Arrays.sort(a, c);
    }
}