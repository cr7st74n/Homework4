public class Book {
    int pages;
    String title;

    public void initBook(int Pages, String Title){
        pages = Pages;
        title = Title;
    }

//    Init the Getters for pages and title
    public int getPages(){
        return pages;
    }
    public String getTitle(){
        return title;
    }
//    Init the Setters for pages and title

    public void setPages(int UserPages){ pages = UserPages ;}

    public void setTitle(String title) {this.title = title;}

//    toString Method that will return a string with pages and title
    public String toSting(){
        String BookValues = Integer.toString(pages);
        BookValues = BookValues.concat(", ").concat(title);
        return BookValues;
    }
//    method that checks if the books are equal
    public boolean equals(Book book1,Book book2){
        if (book1.title == book2.title && book1.pages == book2.pages ){
            return true;
        }else {
            return false;
        }
    }
//CompareTo method between two books
    public int CompareTo(Book book1, Book book2){
        if(book1.pages < book2.pages){
            return -1;
        } else if (book1.pages > book2.pages) {
            return 1;
        } else {
            return 0;
        }
    }

}
