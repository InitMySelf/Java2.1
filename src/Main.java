public class Main {
    public static void main(String[] args) {

        int ticket = 500;                          //Цена билета
        int spentOnTicket = 20;                   //Потраченное кол-во рублей для 1 бонусной мили
        int bonusMiles = ticket / spentOnTicket;  // spentOnTicket; //Бонусные мили

        System.out.println(bonusMiles);

    }
}
