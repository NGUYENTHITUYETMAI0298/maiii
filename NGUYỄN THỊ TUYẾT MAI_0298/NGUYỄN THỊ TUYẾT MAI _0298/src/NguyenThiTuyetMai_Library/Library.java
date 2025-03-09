
package NguyenThiTuyetMai_Library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;
    private final ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }
    public String borrowBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        if (book != null && !book.isBorrowed()) {
            book.borrowBook();
            return "Book borrowed successfully.";
        } else {
            return "Book is not available.";
        }
    }
    public String returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            return "Book returned successfully.";
        } else {
            return "Book is not borrowed.";
        }
    }
    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> listBooks() {
        return books;
    }
    public ArrayList<Book> listBorrowedBooks() {
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isBorrowed()) {
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }
    public ArrayList<Book> listAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    public int getTotalBooks() {
        return books.size();
    }
}

    
        
    

