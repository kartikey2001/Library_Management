# 📚 Library Management System

A simple Java-based library management system that helps librarians keep track of books, patrons, and lending activities. Think of it as a digital version of the old card catalog system, but much more organized!

## 🌟 What This System Does

This system helps you manage a library by:
- **Adding and removing books** from the library collection
- **Tracking who borrowed what** and when
- **Managing library members** (called patrons)
- **Keeping records** of all book transactions
- **Searching for books** by title, author, or ISBN
- **Handling book reservations** when books are already borrowed

## 🏗️ How It's Built

The system is organized into different parts, each handling a specific job. Here's a visual diagram showing how all the components work together:

![Library Management System Architecture](https://via.placeholder.com/600x400/2d3748/ffffff?text=Library+Management+System+Architecture)

*This diagram shows the relationships between different parts of the system - how lending connects to inventory, how patrons interact with transactions, and how reservations work.*

The system is organized into different parts, each handling a specific job:

### 📖 Book Management (`Books/Book.java`)
- Stores information about each book (title, author, ISBN, year, genre)
- Tracks whether a book is available or borrowed
- Like a digital book card that knows everything about each book

### 👥 Patron Management (`Patron/Patron.java`)
- Keeps track of library members
- Stores their contact information and borrowing history
- Manages what books each person currently has borrowed

### 📚 Inventory System (`Inventory/Inventory.java`)
- The main catalog of all books in the library
- Helps you search for books by different criteria
- Shows which books are available and which are borrowed

### 🔄 Lending Process (`Lending/LendingProcess.java`)
- Handles the actual borrowing and returning of books
- Makes sure books are properly checked out and returned
- Keeps track of all active transactions

### 📝 Transaction Tracking (`Transaction/Transaction.java`)
- Records every time someone borrows or returns a book
- Stores dates and details for each transaction
- Like a receipt system for book lending

### 🎫 Reservation System (`Patron/Reservation/Reservation.java`)
- Allows people to reserve books that are currently borrowed
- Creates a waiting list for popular books
- Notifies people when their reserved book becomes available

## 🚀 How to Run the System

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A code editor like IntelliJ IDEA, Eclipse, or VS Code

### Running the Program
1. **Open your terminal/command prompt**
2. **Navigate to the project folder**:
   ```bash
   cd Library-Manage-System-main
   ```
3. **Compile the Java files**:
   ```bash
   javac -d . src/org/library/*.java src/org/library/*/*.java src/org/library/*/*/*.java
   ```
4. **Run the main program**:
   ```bash
   java org.library.Main
   ```

## 📋 Example Usage

The system comes with a demo that shows how everything works:

```java
// Creates a new inventory
Inventory inv = new Inventory();

// Adds some books to the library
Book b1 = new Book("Clean Code", "12345", "Robert Martin", 2008, "Coding");
Book b2 = new Book("Design Patterns", "67890", "Gof", 1994, "Coding");
inv.addBook(b1);
inv.addBook(b2);

// Creates a library member
Patron p1 = new Patron("P001", "Alice", "alice@example.com");

// Sets up the lending system
LendingProcess lending = new LendingProcess(inv);

// Alice borrows some books
lending.checkout(p1, b1);
lending.checkout(p1, b2);

// Alice returns one book
lending.returnBook(p1, b1);

// Shows what books are still available
System.out.println("Available Books:");
for (String book : inv.getAvailableBooks()) {
    System.out.println(book);
}
```

## 🔧 Key Features

### For Librarians:
- **Easy book management**: Add, remove, or update book information
- **Quick searches**: Find books by title, author, or ISBN
- **Transaction history**: See who borrowed what and when
- **Availability tracking**: Know which books are available at any time

### For Library Members:
- **Simple borrowing**: Easy checkout and return process
- **Borrowing history**: Keep track of what you've borrowed
- **Book reservations**: Reserve books that are currently borrowed
- **Account management**: Update your contact information

## 📁 Project Structure

```
Library-Manage-System-main/
├── src/
│   └── org/
│       └── library/
│           ├── Main.java                 # Main program that runs everything
│           ├── Books/
│           │   └── Book.java            # Book information and management
│           ├── Patron/
│           │   ├── Patron.java          # Library member management
│           │   └── Reservation/
│           │       └── Reservation.java # Book reservation system
│           ├── Inventory/
│           │   └── Inventory.java       # Book catalog and search
│           ├── Lending/
│           │   └── LendingProcess.java  # Borrowing and returning books
│           └── Transaction/
│               └── Transaction.java     # Transaction records
└── README.md                           # This file
```

## 🎯 What Makes This System Special

1. **Simple and Easy**: No complicated setup - just run and use!
2. **Well Organized**: Each part has a specific job, making it easy to understand
3. **Complete**: Handles all basic library operations
4. **Extensible**: Easy to add new features like due dates, fines, or email notifications
5. **Educational**: Great for learning how object-oriented programming works

## 🔮 Future Improvements

This system could be enhanced with:
- **Due dates and late fees** for overdue books
- **Email notifications** for due dates and reservations
- **Database storage** instead of keeping everything in memory
- **Web interface** for easier use
- **Barcode scanning** for quick book checkout
- **Reports and statistics** about library usage

## 🤝 Contributing

Feel free to improve this system! Some ideas:
- Add more search options (by genre, year, etc.)
- Implement a user-friendly menu system
- Add data validation to prevent errors
- Create a simple file-based storage system
- Add more detailed error messages

## 📝 License

This project is open source and available for educational purposes.

---

**Happy Reading! 📚✨**

*This system was designed to be simple and educational. It's perfect for learning Java programming concepts while building something useful!*
