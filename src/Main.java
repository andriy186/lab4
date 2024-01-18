public class Main {
    public static void main(String[] args) {
        // Створення екземпляра зовнішнього класу
        OuterClass outerInstance = new OuterClass(42);

        // Виклик методу тестування
        outerInstance.test();
    }
}
