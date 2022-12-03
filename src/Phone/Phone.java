package Phone;

public class Phone {
    public int number;
    public String model;
    public int weight;

    public Phone(){
    }

    public void receiveCall(String Name){
        System.out.println("Звонит: " + Name);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber(){
        return number;
    }

    public void receiveCall(String Name, int Number){
        System.out.println("Звонит: " + Name + " по номеру " + Number);
    }

    public void sendMessage(int...Number){
        System.out.println("Номера для отправки сообщения: ");
        for (int i = 0; i < Number.length; i++) {
            System.out.println(Number[i]);
        }

    }

}
