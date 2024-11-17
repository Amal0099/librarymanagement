package librarymanagement;
import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author MY PC
 */
public class Librarymanagement {

    public static void main(String[] args) {
        // TODO code application logic here
        getConnection();
        //1
        LibraryData.Categories  Category = new LibraryData.Categories ();
         
              Category.setCategoryID(88);
        Category.setCategoryName("Amal");
        insert(Category);
       
        
        
        //2
         LibraryData.Books  Book = new LibraryData.Books ();
         
        Book.setBookID(0);
        Book.setTitle("");
        Book.setAuthor("");
        
        Book.setPublisher("");
        Book.setPublishedYear(0);
        Book.setQuantity(0);
        
        Book.setStatus("");
        Book.setCategoryID(0);
              
        insert(Book);
       
      //3
       LibraryData.Users  User = new LibraryData.Users ();
         
        User.setUserID(0);
        User.setName("");
        User.setEmail("");
        
        User.setPhone("");
        User.setMembershipDate("");
        User.setAddress("");
        User.setDateOfBirth("");
              
        insert(User); 
      
        //4
              LibraryData.Employees  Employee = new LibraryData.Employees ();
         
        Employee.setEmployeeID(0);
        Employee.setName("");
        Employee.setEmail("");
        
        Employee.setPhone("");
        Employee.setJobTitle("");
        Employee.setHireDate("");
        Employee.setSalary(0.0);
              
        insert(Employee); 
        
        //5
              LibraryData.Shifts  Shift = new LibraryData.Shifts ();
         
        Shift.setShiftID(0);
        Shift.setEmployeeID(0);
        Shift.setShiftDate("");
        
        Shift.setStartTime("");
        Shift.setEndTime("");
        
        insert(Shift); 
        
        //6

              LibraryData.Borrowings  Borrow = new LibraryData.Borrowings ();
         
        Borrow.setBorrowID(0);
        Borrow.setUserID(0);
        Borrow.setBookID(0);
        
        Borrow.setBorrowDate("");
        Borrow.setReturnDate("");
          Borrow.setStatus("");
        insert(Borrow); 
        
        
         //7

              LibraryData.Fines  Fines = new LibraryData.Fines ();
         
        Fines.setFineID(0);
        Fines.setBorrowID(0);
        Fines.setFineAmount(0.0);
        
        Fines.setFineDate("");
        Fines.setPaidStatus("");
        
        insert(Fines); 
        
         //8

              LibraryData.Memberships  Membership = new LibraryData.Memberships ();
         
        Membership.setMembershipID(0);
        Membership.setUserID(0);
        
        Membership.setStartDate("");
        Membership.setEndDate("");
        Membership.setMembershipType("");
        Membership.setFee(0.0);
        
        
        insert(Membership); 
        
         //9

              LibraryData.Reviews  Review = new LibraryData.Reviews ();
         
        Review.setReviewID(0);
        Review.setUserID(0);
        Review.setBookID(0);
        Review.setRating(0);
        
        Review.setReviewText("");
        Review.setReviewDate("");
        insert(Review); 
    }
    
    
    
    
    public static Connection getConnection()
    
 {
     String url="jdbc:mysql://localhost:3306/Librarymanagement";
      String databaseName ="Librarymanagement";
      String userName ="root";
       String password ="";
        try  { 
         Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con =DriverManager.getConnection(url, userName, password);
  System.out.println("Connection successfully");
  return con; }
        
        catch (Exception e)  {
         System.out.println("could not Connect to database");
         e.printStackTrace(); }
        return null;
     
 }
    //1
  public static void insert (LibraryData.Categories  Category )    
  {
     Connection conne =getConnection();
      try  { 
     String sql = "INSERT INTO `Categories`(`CategoryID`,`CategoryName`) VALUES (?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Category.getCategoryID());
     st.setString(2, Category.getCategoryName());
     st.execute();
          System.out.println("Category insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
  
   //2
  public static void insert (LibraryData.Books  Book )    
  {
     Connection conne =getConnection();
      try  { 
     String sql = "INSERT INTO `Books`(`bookID`,`title`,`author`,`publisher`,`publishedYear`,`quantity`,`status`,`categoryID`) VALUES (?,?,?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Book.getBookID());
     st.setString(2, Book.getTitle());
      st.setString(3, Book.getAuthor());
     st.setString(4, Book.getPublisher());
     
     st.setInt(5, Book.getPublishedYear());
     st.setInt(6, Book.getQuantity());
      st.setString(7, Book.getStatus());
     st.setInt(8, Book.getCategoryID());
     st.execute();
          System.out.println("Books insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }

  
   //3
 public static void insert ( LibraryData.Users  User )    
  {
     Connection conne =getConnection();
      try  { 
     String sql = "INSERT INTO `Users`(`userID`,`name`,`email`,`phone`,`membershipDate`,`address`,`dateOfBirth`) VALUES (?,?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, User.getUserID());
     st.setString(2, User.getName());
      st.setString(3, User.getEmail());
     st.setString(4, User.getPhone());
     
     st.setString(5, User.getMembershipDate());
     st.setString(6, User.getAddress());
      st.setString(7, User.getDateOfBirth());
     st.execute();
          System.out.println("Users insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
   //4
  public static void insert (LibraryData.Employees  Employee  )    
  {
     Connection conne =getConnection();
       try  { 
     String sql = "INSERT INTO `Employees`(`employeeID`,`name`,`email`,`phone`,`jobTitle`,`hireDate`,`salary`) VALUES (?,?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Employee.getEmployeeID());
     st.setString(2, Employee.getName());
      st.setString(3, Employee.getEmail());
     st.setString(4, Employee.getPhone());
     
     st.setString(5, Employee.getJobTitle());
     st.setString(6, Employee.getHireDate());
      st.setDouble(7, Employee.getSalary());
     st.execute();
          System.out.println("Employees insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
  
   //5
  public static void insert ( LibraryData.Shifts  Shift )    
  {
     Connection conne =getConnection();
      try  { 
     String sql = "INSERT INTO `Shifts`(`shiftID`,`employeeID`,`shiftDate`,`startTime`,`startTime`) VALUES (?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Shift.getShiftID());
     st.setInt(2, Shift.getEmployeeID());
      st.setString(3, Shift.getShiftDate());
     st.setString(4, Shift.getStartTime());
     st.setString(5, Shift.getEndTime());
     st.execute();
          System.out.println("Shifts insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
  
   //6
  public static void insert (LibraryData.Borrowings  Borrow )    
  {
     Connection conne =getConnection();
     try  { 
     String sql = "INSERT INTO `Borrowings`(`borrowID`,`userID`,`bookID`,`borrowDate`,`returnDate`,`status`) VALUES (?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Borrow.getBorrowID());
     st.setInt(2, Borrow.getUserID());
     st.setInt(3, Borrow.getBookID());
     st.setString(4, Borrow.getBorrowDate());
     st.setString(5, Borrow.getReturnDate());
     st.setString(6, Borrow.getStatus());
     st.execute();
          System.out.println("Borrowings insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 } 
 
  
  
   //7
  public static void insert ( LibraryData.Fines  Fines )    
  {
     Connection conne =getConnection();
  try  { 
     String sql = "INSERT INTO `Fines`(`fineID`,`borrowID`,`fineAmount`,`fineDate`,`paidStatus`) VALUES (?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Fines.getFineID());
     st.setInt(2, Fines.getBorrowID());
      st.setDouble(3, Fines.getFineAmount());
     st.setString(4, Fines.getFineDate());
     st.setString(5, Fines.getPaidStatus());
     st.execute();
          System.out.println("Fines insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
  
  
  
   //8
  public static void insert ( LibraryData.Memberships  Membership )    
  {
     Connection conne =getConnection();
      try  { 
     String sql = "INSERT INTO `Memberships`(`membershipID`,`userID`,`startDate`,`endDate`,`membershipType`,`fee`) VALUES (?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Membership.getMembershipID());
     st.setInt(2, Membership.getUserID());
      st.setString(3, Membership.getStartDate());
     st.setString(4, Membership.getEndDate());
     st.setString(5, Membership.getMembershipType());
     st.setDouble(6, Membership.getFee());
     st.execute();
          System.out.println("Memberships insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
  
     
 }
  
   //9
  public static void insert ( LibraryData.Reviews  Review )    
  {
     Connection conne =getConnection();
     try  { 
     String sql = "INSERT INTO `Reviews`(`reviewID`,`userID`,`bookID`,`rating`,`reviewText`,`reviewDate`) VALUES (?,?,?,?,?,?)";
     PreparedStatement st =conne.prepareStatement(sql );
     st.setInt(1, Review.getReviewID());
     st.setInt(2, Review.getUserID());
     st.setInt(3, Review.getBookID());
     st.setInt(4, Review.getRating());
     st.setString(5, Review.getReviewText());
     st.setString(6, Review.getReviewDate());
     st.execute();
          System.out.println("Reviews insert successfully ");
      conne.close();
      }
       catch (Exception e)  {
         System.out.println("could not insert to data");
         e.printStackTrace(); }
     
 }
  }
 
  
    
    
    
    
    
    
    
    
    
    
    

