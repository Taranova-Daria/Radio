public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Radio
        Radio radio = new Radio();

        // Установка текущей радиостанции
        radio.setCurrentStation(5);

        // Переключение на следующую станцию
        radio.nextStation();

        // Установка громкости
        radio.setVolume(50);

        // Увеличение громкости
        radio.increaseVolume();

        // Вывод текущей радиостанции и громкости
        System.out.println("Текущая радиостанция: " + radio.getCurrentStation());
        System.out.println("Громкость: " + radio.getVolume());
    }
}
