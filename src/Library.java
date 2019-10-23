public class Library {
    public static void main(String[] args) {
        Book myBook1=new Book();
        Book myBook2=new Book("Harry Potter","ISBN12456",300,25.5f);

        System.out.println(myBook1.toString());
        System.out.println(myBook2.toString());
    }
}