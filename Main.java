import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        // if any student does not exists then you must add at least one
        if (studentList.size() == 0)
            forceToAddStudent();

        // if any book does not exists then you must add at least one
        if (bookList.size() == 0) {
            forceToAddBook();
        }

        welcome();
    }

    private static void forceToAddStudent() {
        System.out.println("please add student because there must be at least one");
        addStudent();
    }

    /**
     * this method is used to add new student
     */
    private static void addStudent() {
        Scanner sScanner = new Scanner(System.in);
        Scanner iScanner = new Scanner(System.in);

        Student student = new Student();
        // to set an unique id
        student.setId(student.hashCode());

        System.out.println("please enter student's name");
        student.setName(sScanner.nextLine());
        System.out.println("please enter student's surname");
        student.setSurname(sScanner.nextLine());
        System.out.println("please enter student's age");
        student.setAge(iScanner.nextInt());

        Address address = new Address();
        System.out.println("please enter student's city");
        address.setCity(sScanner.nextLine());
        System.out.println("please enter student's street");
        address.setStreet(sScanner.nextLine());
        System.out.println("please enter student's floor");
        address.setFloor(iScanner.nextInt());
        System.out.println("please enter student's buildingNo");
        address.setBuildingNo(iScanner.nextInt());

        student.setAddress(address);
        studentList.add(student);
    }

    private static void forceToAddBook() {
        System.out.println("please add book because there must be at least one");
        addBook();
    }

    /**
     * this method is used to add new book
     */
    private static void addBook() {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();
        // to set an unique id
        book.setId(book.hashCode());

        System.out.println("please enter book's title");
        book.setTitle(scanner.nextLine());
        System.out.println("please enter book's authorName");
        book.setAuthorName(scanner.nextLine());
        System.out.println("please enter book's authorSurname");
        book.setAuthorSurname(scanner.nextLine());

        bookList.add(book);
    }

    /**
     * menu
     */
    private static void welcome() {
        while (true) {
            System.out.println("Please select the operation you want to do");
            System.out.println("press -1 to exit");
            System.out.println("press 0 to add student");
            System.out.println("press 1 to remove student");
            System.out.println("press 2 to show all students");
            System.out.println("press 3 to show any student");
            System.out.println("press 4 to add book");
            System.out.println("press 5 to remove book");
            System.out.println("press 6 to show all books");
            System.out.println("press 7 to show any book");
            System.out.println("press 8 to send book to student");
            System.out.println("press 9 to show total price you will get");

            int selection = new Scanner(System.in).nextInt();

            if (selection == -1)
                return;

            run(selection);
        }

    }

    /**
     * make the operation selected
     *
     * @param selection the operation selected
     */
    private static void run(int selection) {
        switch (selection) {
            case 0:
                addStudent();
                break;
            case 1:
                removeStudent();
                break;
            case 2:
                showAllStudents();
                break;
            case 3:
                showAnyStudent();
                break;
            case 4:
                addBook();
                break;
            case 5:
                removeBook();
                break;
            case 6:
                showAllBooks();
                break;
            case 7:
                showAnyBook();
                break;
            case 8:
                sendBookToStudent();
                break;
            case 9:
                showTotalPrice();
                break;
        }
    }

    /**
     * this method is used to remove student
     */
    private static void removeStudent() {
        System.out.println("please enter student's id you want to remove");
        int id = new Scanner(System.in).nextInt();
        for (Student student : studentList)
            if (student.getId() == id) {
                studentList.remove(student);
                return;
            }

        System.out.println("the student with given id was not found");
    }

    private static void showAllStudents() {
        for (Student student : studentList)
            showAnyStudent(student);
    }

    /**
     * this method is used to show student
     */
    private static void showAnyStudent() {
        System.out.println("please enter student's id you want to show");
        int id = new Scanner(System.in).nextInt();
        for (Student student : studentList)
            if (student.getId() == id) {
                showAnyStudent(student);
                return;
            }

        System.out.println("the student with given id was not found");
    }

    /**
     * this method is used to show the given student
     *
     * @param student the given student
     */
    private static void showAnyStudent(Student student) {
        System.out.printf("id: %d%n", student.getId());
        System.out.printf("name: %s%n", student.getName());
        System.out.printf("surname: %s%n", student.getSurname());
        System.out.printf("age: %d%n", student.getAge());
        student.getAddress().showAddress();
        System.out.printf("toBePaidPrice: %d%n", student.getToBePaidPrice());
        System.out.println("**************************");
    }

    /**
     * this method is used to remove book
     */
    private static void removeBook() {
        System.out.println("please enter book's id you want to remove");
        int id = new Scanner(System.in).nextInt();
        for (Book book : bookList)
            if (book.getId() == id) {
                bookList.remove(book);
                return;
            }

        System.out.println("the book with given id was not found");
    }

    private static void showAllBooks() {
        for (Book book : bookList)
            showAnyBook(book);
    }

    /**
     * this method is used to show book
     */
    private static void showAnyBook() {
        System.out.println("please enter book's id you want to show");
        int id = new Scanner(System.in).nextInt();
        for (Book book : bookList)
            if (book.getId() == id) {
                showAnyBook(book);
                return;
            }

        System.out.println("the student with given id was not found");
    }

    /**
     * this method is used to show the given book
     *
     * @param book the given book
     */
    private static void showAnyBook(Book book) {
        System.out.printf("id: %d%n", book.getId());
        System.out.printf("title: %s%n", book.getTitle());
        System.out.printf("author name: %s%n", book.getAuthorName());
        System.out.printf("author surname: %s%n", book.getAuthorSurname());
        System.out.println("**************************");
    }

    /**
     * this method is used to send book with given id to student with given id
     */
    private static void sendBookToStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter student's id");
        int studentId = scanner.nextInt();
        Student student = null;
        boolean isStudentFound = false;
        for (Student std : studentList)
            if (std.getId() == studentId) {
                student = std;
                isStudentFound = true;
            }

        // if the condition is true, this means the student with given id was not found
        if (!isStudentFound) {
            System.out.println("any student with given id was not found");
            // recall the method and then return this
            sendBookToStudent();
            return;
        }

        System.out.println("please enter book's id");
        int bookId = scanner.nextInt();
        boolean isBookFound = false;
        for (Book book : bookList)
            if (book.getId() == bookId) {
                isBookFound = true;

                if (book.isBorrowed()) {
                    System.out.println("this book was borrowed before, please select another one");
                    return;
                }

                book.setBorrowed(true);
                student.setToBePaidPrice(student.getToBePaidPrice() + 10);
            }

        // if the condition is true, this means the book with given id was not found
        if (!isBookFound) {
            System.out.println("any book with given id was not found");
            // recall the method and then return this
            sendBookToStudent();
            return;
        }
    }

    /**
     * this method is used to show total price that students will pay for cargo
     */
    private static void showTotalPrice() {
        int sum = 0;
        for (Student student : studentList)
            sum += student.getToBePaidPrice();

        System.out.printf("total price: %d TL%n", sum);
        System.out.println("**************************");
    }
}