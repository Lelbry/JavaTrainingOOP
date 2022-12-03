package Phone;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Телефоны: ");
        Phone Phone1 = new Phone(905114, "Iphone" , 200);
        Phone Phone2 = new Phone(905120,"Sumsung",220);
        Phone Phone3 = new Phone(905135,"Realme",180);
        System.out.println(Phone1.number + " " + Phone1.model + " " + Phone1.weight);
        System.out.println(Phone2.number + " " + Phone2.model + " " + Phone2.weight);
        System.out.println(Phone3.number + " " + Phone3.model + " " + Phone3.weight);
        System.out.println(" ");
        System.out.println("Метод Получения звонка: ");
        Phone1.receiveCall("Александр");
        Phone2.receiveCall("Екатерина");
        Phone3.receiveCall("Николай");
        System.out.println(" ");
        System.out.println("Метод Получения номера: ");
        System.out.println("Номер телефона 1: " + Phone1.getNumber());
        System.out.println("Номер телефона 2: " + Phone2.getNumber());
        System.out.println("Номер телефона 3: " + Phone3.getNumber());
        System.out.println(" ");
        System.out.println("Метод Получения звонка Перенагруженный: ");
        Phone1.receiveCall("Александр", 905998);
        Phone2.receiveCall("Екатерина", 905606);
        Phone3.receiveCall("Николай", 905768);
        System.out.println(" ");
        System.out.println("Метод Отправления письма: ");
        Phone1.sendMessage(905661,504665,333770);
    }
}
