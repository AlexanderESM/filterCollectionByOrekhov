/**
 * Интерфейс Filter с методом apply
 * Java все объекты наследуют класс Object, поэтому в качестве аргумента может быть передан объект любого типа.
 */
interface Filter {
    Object apply(Object o);
}

// Метод filter, который применяет функцию apply ко всем элементам массива
public class CollectionUtil {

    public static Object[] filter(Object[] array, Filter filter) {
        // Создаем новый массив, размер которого равен размеру входного массива
        Object[] result = new Object[array.length];

        // Применяем функцию apply ко всем элементам массива
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }

        return result;
    }
}

