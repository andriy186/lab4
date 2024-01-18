// Зовнішній клас
class OuterClass {
    private int outerVariable;

    // Конструктор зовнішнього класу
    public OuterClass(int outerVariable) {
        this.outerVariable = outerVariable;
    }

    // Метод зовнішнього класу
    public void outerMethod() {
        System.out.println("Метод зовнішнього класу. Зовнішня змінна: " + outerVariable);
    }

    // Вкладений клас
    class InnerClass {
        // Метод вкладеного класу, який використовує зовнішню змінну та метод
        public void innerMethod() {
            outerMethod(); // Виклик методу зовнішнього класу
            System.out.println("Метод вкладеного класу. Внутрішня змінна: " + outerVariable);
        }
    }

    // Метод для тестування (виклик методу вкладеного класу)
    public void test() {
        InnerClass innerInstance = new InnerClass();
        innerInstance.innerMethod();
    }
}

