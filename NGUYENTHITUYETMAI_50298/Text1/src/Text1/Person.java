
package Text1;

import java.util.Date;
public abstract class Person implements IPerson{
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date  bookBorrowDate;
    private Date bookReturnDate;
 
    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    @Override
    public abstract void displayInfo();

    @Override
    public abstract void updatePerson(String id);

    @Override
    public abstract void addPerson();
    public boolean isBookOverdue(){
    long diff = bookReturnDate.getTime()-bookBrrowDate.getTime();
     long daysBetween = diff / (1000*60*60*24);
     return daysBetween >=30;
    }
    }

