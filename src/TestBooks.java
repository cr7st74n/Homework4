import java.util.Scanner;
public class TestBooks {
    public static void main(String[] args) {
//        Scanner part for Input
        Scanner scanner = new Scanner(System.in);
        Book booksForUser = new Book();

        System.out.println("Welcome to the Book App");
        System.out.println("How may books did you read during de summer?");
        int numberOfBooks = scanner.nextInt();
        System.out.println("Thank you, please write the information about the books. ");
        for(int i = 0;i < numberOfBooks; i ++){
            System.out.println("Enter the title of the book");
            String titleUser = scanner.next();
            System.out.println("Enter the number of pages for your book");
            int pagesUser = scanner.nextInt();
            booksForUser.initBook(pagesUser,titleUser);
        }
        String test = booksForUser.toSting();

        System.out.println(test);

    }
}