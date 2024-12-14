/**
 *  Реализуем фильтр, например, для преобразования чисел в их квадраты
 *  Оператор instanceof проверяет, является ли объект o экземпляром (или наследником) класса Integer
 */
class SquareFilter implements Filter {
    @Override
    public Object apply(Object o) {
        if (o instanceof Integer) {
            return (Integer) o * (Integer) o;
        }
        return o; // если объект не Integer, возвращаем его без изменений
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4};

        // Применяем фильтр SquareFilter
        Object[] result = CollectionUtil.filter(array, new SquareFilter());

        // Выводим результат
        for (Object o : result) {
            System.out.println(o);
        }
    }
}

