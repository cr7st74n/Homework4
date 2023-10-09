import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TestBooks {
    public static void main(String[] args) {
//        Scanner part for Input
        Scanner scanner = new Scanner(System.in);

        int NumPages = 0;

        List<Book> BooksReadSummer = new ArrayList<Book>();

        System.out.println("Welcome to the Book App");
        System.out.println("How may books did you read during the summer?");
        int numberOfBooks = scanner.nextInt();
        System.out.println("Thank you, please write the information about the books. ");
        for(int i = 0;i < numberOfBooks; i ++){
            System.out.println("Enter the title of the book Number: " +(i+1));
            String titleUser = scanner.next();
            System.out.println("Enter the number of pages for your book Number: " +(i+1));
            int pagesUser = scanner.nextInt();
            Book booksForUser = new Book();
            booksForUser.initBook(pagesUser,titleUser);
            BooksReadSummer.add(booksForUser);
            System.out.println("===============================================");
        }

        System.out.println("Books read during the Summer");
        for (Book book : BooksReadSummer){
            System.out.println(book.toString());
        }
//          Average number of pages
        for(Book book: BooksReadSummer){
            NumPages = NumPages+book.getPages();
        }
        int totalPages = NumPages/numberOfBooks;
        System.out.println("Average number of pages per book read:");
        System.out.println("===========================================");
        System.out.println("Your average is: "+totalPages +" Pages");
//        Get the Smallest number of pages in a Book
        Book SmallPages = new Book();

        int lastBook = BooksReadSummer.size()-1;

        for(int i = 0; i<lastBook; i++){
            int compare = SmallPages.CompareTo(BooksReadSummer.get(i),BooksReadSummer.get(i+1));
            if (compare == -1){
                BooksReadSummer.set(i+1,BooksReadSummer.get(i));
            }
        }
        System.out.println("the Smallest number of pages in a Book is: " +BooksReadSummer.get(lastBook));

    }
}