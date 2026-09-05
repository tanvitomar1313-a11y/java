lass Book{
    int bookId;
    String title;
    String author;
    boolean isIssued;
    Book(int id,String t,String a){
        bookId=id;
        title=t;
        author=a;
        isIssued=false;
    }
    void issueBook(){
        if(isIssued){
            System.out.println("Book already issued");
        }else{
            isIssued=true;
            System.out.println("Book issued successfully");
        }
    }
    void returnBook(){
        isIssued=false;
        System.out.println("Book returned successfully");
    }
    void displayBook(){
        System.out.println("Book ID: "+bookId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Status: "+(isIssued?"Issued":"Available"));
    }
}
public class Library{
    public static void main(String args[]){
        Book b1=new Book(1,"Java Basics","James Gosling");
        b1.displayBook();
        b1.issueBook();
        b1.issueBook();   // already issued
        b1.returnBook();
        b1.displayBook();
    }
}
