package ru.siksmfp.basic.structure.stack;

import ru.siksmfp.basic.structure.array.dynamic.Array;
import ru.siksmfp.basic.structure.exceptions.IncorrectSizeException;
import ru.siksmfp.basic.structure.utils.StructureUtils;

/**
 * Created by Artyom Karnov on 18.11.16.
 * artyom-karnov@yandex.ru
 */

/*
 * Stack built on dynamic array
 *
 * @param <T> object type for storing in stack
 */
public class Stack<T> {
    private Array<T> array;
    private int size;

    /**
     * Stack initialization
     */
    public Stack() {
        size = 0;
        array = new Array<>();
    }

    /**
     * Pushing element stack
     *
     * @param element element for pushing
     */
    public void push(T element) {
        StructureUtils.checkDataStructureSize(size);
        array.add(element);
        size++;
    }

    /**
     * Extraction upper element from stack
     *
     * @return extracted element
     */
    public T pop() {
        if (size > 0) {
            T temp = array.get(size - 1);
            size--;
            return temp;
        } else {
            throw new IncorrectSizeException("Stack is empty");
        }
    }

    /**
     * Checking stack on elements presence
     *
     * @return true - if stack has elements, false - if stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Getting stack size
     *
     * @return size of array
     */
    public int size() {
        return size;
    }

    /**
     * Checking elements storing in array
     *
     * @param element element for checking
     * @return true - if stack contain adjusted element, false - if doesn't
     */
    public boolean contains(T element) {
        return array.contains(element);
    }
}