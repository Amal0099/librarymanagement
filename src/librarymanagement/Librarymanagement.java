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
  /*  
      */
   //4
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
  
  
   //5
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
  
  
   //6
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
  
  
   //7
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
  
  
  
  
   //8
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
  
  
  
   //9
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
  
  
  
  
  
  
  
  }
 
  
    
    
    
    
    
    
    
    
    
    
    

