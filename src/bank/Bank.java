package bank;

public class Bank<view> {
    private int number;
    private String view;
    private boolean owner;
    private String term;
    private int cvv;


    public static void main(String[] args) {
        Bank bank = new Bank(12345678, "Visa", true, "06/22", 234);
        bank.validateCheck(12345678, "Visa", true, "06/22", 234);
    }


    public Bank(int number, String view, boolean owner, String term, int cvv) {
        this.number = number;
        this.view = view;
        this.owner = owner;
        this.term = term;
        this.cvv = cvv;
    }

    public void validateCheck (int number, String view, boolean owner, String term, int cvv) {
        class Map {

            public void cardCheck(int number, String view, boolean owner, String term, int cvv) {
                if (number / 100000000 != 0)
                    System.out.println("Введите правильно номер Карты!");
                else if (view == "" || view == null)
                    System.out.println("Введите вид Карты!");
                else if (owner == false)
                    System.out.println("Владельца карты нет!");
                else if (term == "" || term == null)
                    System.out.println("Введите срок действия Карты!");
                else if (cvv / 1000 != 0)
                    System.out.println("Введите правильно CVV код Карты!");
                else
                    System.out.println("Все параметры карты введены верно!");
            }
        }
        Map map = new Map();
        map.cardCheck(number, view, owner, term, cvv);
    }
}