public class Main {

    public static void main(String[] args) {

        PhoneBook.addContact("Masha", 123_444_555);
        PhoneBook.addContact("Dasha", 123_444_666);
        PhoneBook.addContact("Vova", 123_444_777);
        PhoneBook.addContact("Dima", 123_444_888);

        System.out.print(PhoneBook.getPhoneBook());

    }
}
