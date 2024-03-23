// Классы Dollar наследуются от класса Money и представляют собой конкретные валюты.
// Класс содержит переопределенный метод toString для представления объекта в виде строки с указанием суммы.

public class Dollar extends Money {
    @Override
    public String toString() {
        return "Dollar{" +
                "count=" + count +
                '}';
    }
}
