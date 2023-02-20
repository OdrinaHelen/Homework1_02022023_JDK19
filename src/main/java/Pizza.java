public class Pizza {
    public static void main(String[] args) {
        int pizzaOneDiam = 24;
        int pizzaTwoDiam = 28;
        double pizzaOneArea = CircleArea.circleArea(pizzaOneDiam);
        double pizzaTwoArea = CircleArea.circleArea(pizzaTwoDiam);
        System.out.println("Площадь первой пиццы: " + pizzaOneArea + " cм.кв.");
        System.out.println("Площадь второй пиццы: " + pizzaTwoArea + " см.кв.");
        double areaDifference = pizzaTwoArea - pizzaOneArea;
        double extraCall = 40 * areaDifference;
        System.out.println(extraCall + " лишних каллорий ты сожрешь.");




    }

}
