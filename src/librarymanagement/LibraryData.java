package librarymanagement;
public class LibraryData {

    // Inner class for Categories
    public static class Categories
    {
        private int CategoryID ;
        private String CategoryName ;

        public int getCategoryID() {
            return CategoryID;
        }

        public void setCategoryID(int categoryID) {
            this.CategoryID = categoryID;
        }

        public String getCategoryName() {
            return CategoryName;
        }

        public void setCategoryName(String categoryName) {
            this.CategoryName = categoryName;
        }
    }

    // Inner class for Books
    public static class Books {
        private int bookID;
        private String title;
        private String author;
        private String publisher;
        private int publishedYear;
        private int quantity;
        private String status;
        private int categoryID;

        public int getBookID() {
            return bookID;
        }

        public void setBookID(int bookID) {
            this.bookID = bookID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getPublishedYear() {
            return publishedYear;
        }

        public void setPublishedYear(int publishedYear) {
            this.publishedYear = publishedYear;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getCategoryID() {
            return categoryID;
        }

        public void setCategoryID(int categoryID) {
            this.categoryID = categoryID;
        }
    }

    // Inner class for Users
    public static class Users {
        private int userID;
        private String name;
        private String email;
        private String phone;
        private String membershipDate;
        private String address;
        private String dateOfBirth;

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getMembershipDate() {
            return membershipDate;
        }

        public void setMembershipDate(String membershipDate) {
            this.membershipDate = membershipDate;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    // Inner class for Employees
    public static class Employees {
        private int employeeID;
        private String name;
        private String email;
        private String phone;
        private String jobTitle;
        private String hireDate;
        private double salary;

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getHireDate() {
            return hireDate;
        }

        public void setHireDate(String hireDate) {
            this.hireDate = hireDate;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    // Inner class for Shifts
    public static class Shifts {
        private int shiftID;
        private int employeeID;
        private String shiftDate;
        private String startTime;
        private String endTime;

        public int getShiftID() {
            return shiftID;
        }

        public void setShiftID(int shiftID) {
            this.shiftID = shiftID;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public String getShiftDate() {
            return shiftDate;
        }

        public void setShiftDate(String shiftDate) {
            this.shiftDate = shiftDate;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }
    }

    // Inner class for Borrowings
    public static class Borrowings {
        private int borrowID;
        private int userID;
        private int bookID;
        private String borrowDate;
        private String returnDate;
        private String status;

        public int getBorrowID() {
            return borrowID;
        }

        public void setBorrowID(int borrowID) {
            this.borrowID = borrowID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public int getBookID() {
            return bookID;
        }

        public void setBookID(int bookID) {
            this.bookID = bookID;
        }

        public String getBorrowDate() {
            return borrowDate;
        }

        public void setBorrowDate(String borrowDate) {
            this.borrowDate = borrowDate;
        }

        public String getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    // Inner class for Fines
    public static class Fines {
        private int fineID;
        private int borrowID;
        private double fineAmount;
        private String fineDate;
        private String paidStatus;

        public int getFineID() {
            return fineID;
        }

        public void setFineID(int fineID) {
            this.fineID = fineID;
        }

        public int getBorrowID() {
            return borrowID;
        }

        public void setBorrowID(int borrowID) {
            this.borrowID = borrowID;
        }

        public double getFineAmount() {
            return fineAmount;
        }

        public void setFineAmount(double fineAmount) {
            this.fineAmount = fineAmount;
        }

        public String getFineDate() {
            return fineDate;
        }

        public void setFineDate(String fineDate) {
            this.fineDate = fineDate;
        }

        public String getPaidStatus() {
            return paidStatus;
        }

        public void setPaidStatus(String paidStatus) {
            this.paidStatus = paidStatus;
        }
    }

    // Inner class for Memberships
    public static class Memberships {
        private int membershipID;
        private int userID;
        private String startDate;
        private String endDate;
        private String membershipType;
        private double fee;

        public int getMembershipID() {
            return membershipID;
        }

        public void setMembershipID(int membershipID) {
            this.membershipID = membershipID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getMembershipType() {
            return membershipType;
        }

        public void setMembershipType(String membershipType) {
            this.membershipType = membershipType;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }
    }

    // Inner class for Reviews
    public static class Reviews {
        private int reviewID;
        private int userID;
        private int bookID;
        private int rating;
        private String reviewText;
        private String reviewDate;

        public int getReviewID() {
            return reviewID;
        }

        public void setReviewID(int reviewID) {
            this.reviewID = reviewID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }

        public int getBookID() {
            return bookID;
        }

        public void setBookID(int bookID) {
            this.bookID = bookID;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getReviewText() {
            return reviewText;
        }

        public void setReviewText(String reviewText) {
            this.reviewText = reviewText;
        }

        public String getReviewDate() {
            return reviewDate;
        }

        public void setReviewDate(String reviewDate) {
            this.reviewDate = reviewDate;
        }
    }
}