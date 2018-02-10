package Library;
public class Library {
    // Add the missing implementation to this class
    static int booknum = 0;

    static String openingHours = "9AM to 5PM";
    String address;
    public Library(String address){
        this.address = address;

    }

    Book [] books = new Book [1];

    public void addBook(Book book){
        if(this.booknum == 0){
            this.books[0] = book;
        }
        else{
            Book [] temp = new Book[this.books.length+1];
            System.arraycopy(this.books, 0, temp, 0 , this.books.length);
            temp[this.books.length] = book;
            this.books = temp;
        }
        this.booknum++;
    }
    static void printOpeningHours(){
        System.out.println(openingHours);
    }
    public void printAddress(){
        System.out.println(this.address);
    }
    public void borrowBook(String bookname){
        if(this.books[0] == null){
            System.out.println("No books available at this library");
        }
        else {
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].getTitle() == bookname) {
                    if (this.books[i].isBorrowed()) {
                        System.out.println("Sorry this book is unavailable");
                    } else {
                        this.books[i].borrowed();
                        System.out.println("Enjoy reading " + bookname);
                    }
                    break;
                }
            }
        }
    }
    public void printAvailableBooks(){
        if(this.books[0] == null){
            System.out.println("No books in this Library!");
        }
        else{
            for(int i =0; i<this.books.length; i++){
                if(!this.books[i].isBorrowed()){
                    System.out.println(this.books[i].getTitle());
                }

            }
        }
    }
    public void returnBook(String bookname){
        if(this.books[0] == null){
            System.out.println("Sorry, this book wasn't borrowed from this Library!");
        }
        else{
            for(int i = 0; i<this.books.length; i++){
                if(this.books[i].getTitle() == bookname){
                    this.books[i].returned();
                    System.out.println("thank you for returning " + bookname);
                }
            }
        }

    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
//
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
//
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 