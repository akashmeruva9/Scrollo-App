# Scrollo-App 
This an app where the user can see News , Memes and Reels in a scrollable manner in one app.

# Feautres

-  Beautiful UI, Dark Theme
-  Parse complicated JSON.
-  News Home page
-  Live News
-  Different categories of news like world , science , busines , etc..
-  Find news with keyword
-  Uses Google News Api.
-  Display full news detail through in-app browser.
-  Quality Memes 
-  Unlimited Memes from reddit api.
-  Share News, Memes, Reels
-  Download Memes.
-  Swipeable Reels.
-  Switch from one data to another very easily using frame layout.

# Output 


<table style="border: 1px solid black;">
            <tr>
                <td  style="border: 1px solid black ;">
                    News
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295679-1c3ce8e2-b9a5-4864-a773-804742483932.jpg"   width="200">
                </td>
                <td  style="border: 1px solid black ;">
                    Memes
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295720-01b1a683-7a4d-4b52-aaaf-d935872c58c0.jpg"   width="200">
                </td>
                 <td  style="border: 1px solid black ;">
                    Reels
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170317420-bb010cb6-962e-462b-80bc-595f1749c50b.jpg"   width="200">
                </td>
            </tr>
            <tr>
                <td  style="border: 1px solid black ;">
                   In-App full News
                </td>
                <td  style="border: 1px solid black ;">
                    <img src = "https://user-images.githubusercontent.com/106223361/170317769-2783a0df-5061-4ed4-ab55-0e8f2aaf3289.jpg"   width="200">
                </td>
                <td  style="border: 1px solid black ;">
                     Category
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170318044-315af3a0-b4a2-41ce-b328-faaa274a5455.jpg"   width="200">
                </td>
               <td  style="border: 1px solid black ;">
                    Share
                </td>
                <td  style="border: 1px solid black ;">
                    <img src="https://user-images.githubusercontent.com/106223361/170295888-d3970b0d-162e-41b7-bca0-0aca35401d22.jpg"   width="200">
                </td>
            </tr>
        </table>
        
        
1. Declare a class Named Teacher. The class will have all the data members(First_Name, Last_Name,Emp_ ID, Dept_Name) as per your convenient.The class will have constructors. Write a function to read the values of the class variables. The values of the variable will be stored in a FILE (text file). The values will be stored in a structured format of your own choice.Further, read the content of the FILE and display the content in an ordered form (First Name, LastName).

Concept Learning:
1. FILE manipulation
2. Use try catch blocks
3. Use multiple try catch block
4. Finally statement
Try to have your own Exception


Code:

Teacher.java

    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Teacher {
    private String firstName;
    private String lastName;
    private String empId;
    private String deptName;

    public Teacher(String firstName, String lastName, String empId, String deptName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.deptName = deptName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void saveToFile(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(this.firstName + "," + this.lastName + "," + this.empId + "," + this.deptName);
        writer.close();
    }

    public static ArrayList<Teacher> readFromFile(String filename) throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            Teacher teacher = new Teacher(parts[0], parts[1], parts[2], parts[3]);
            teachers.add(teacher);
        }
        scanner.close();
        return teachers;
    }

    
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    }
__________________

MainClass1.java 

    import java.io.IOException;
    import java.util.ArrayList;

    public class MainClass1{
    public static void main(String[] args) throws IOException {
        // Create a Teacher object
        Teacher teacher = new Teacher("Sree", "V", "1234", "CSE");

        // Save the Teacher object to a file
        teacher.saveToFile("teacher.txt");

        // Read the Teacher object from the file
        ArrayList<Teacher> teachers = Teacher.readFromFile("teacher.txt");

        // Print the list of Teacher objects
        for (Teacher t : teachers) {
            System.out.println(t.toString());
        }
    }
    }



2. Create three classes Named Student, Teacher, Parents. Student and Teacher class inherits Thread class and Parent class implements Runnable interface. These three classes have run methods with statements. The task of the teacher class of the first assignment has to be synchronized. Similarly, the other two classes should have run methods with few valid statements under synchronized.

Code:

    class Student extends Thread {
    public void run() {
        synchronized (System.out) {
            System.out.println("Student is attending class.");
        }
    }
    }

    class Teacher extends Thread {
    public void run() {
        synchronized (System.out) {
            System.out.println("Teacher is giving an assignment.");
            
        }
    }
    }

    class Parent implements Runnable {
    public void run() {
        synchronized (System.out) {
            System.out.println("Parent is attending a parent-teacher conference.");
                  }
    }
    }
    class MainClass2{
    public static void main(String[] args) {
        Student o1 = new Student();
        Teacher o2 = new Teacher();
        Parent o3 = new Parent();

        o1.start();
        o2.start();
        o3.run();
    }
    }

3. Create two classes Named Student and Teacher with required data members. Assume that the information about the Student and Teacher is stored in a text file. Read n and m number of Student  and Teacher information from the File. Store the information in Array list of type Student and Teacher Array List<Student> and Array List<Teacher>. Print the information of Teacher who taught OOPS and Maths. Use Iterator and other functions of util in your program.


Code:
	
    import java.util.ArrayList;
    import java.util.Scanner;
    import java.io.File;
    import java.io.FileNotFoundException;

    class Student {
    private String name;
    private int rollNo;
    private float cgpa;
    
    public Student(int rollNo, String name, float cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    
    public String toString() {
        return "Student:["+rollNo+" "+name+" "+cgpa+"]";
    }
    
    }

    class Teacher {
    private String name;
    private String subject;
    
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public String toString() {
        return "Teacher:["+name+" "+" "+subject+"]";
    }
    }

    public class MainClass3 {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();
        ArrayList<Teacher> t = new ArrayList<Teacher>();
        try {
            File file = new File("students_and_teachers.txt");
            Scanner scanner = new Scanner(file);
            
           for(int i = 0; i < 4; i++) {
                int rollNo = scanner.nextInt();
	    String name = scanner.next();
                float cgpa = scanner.nextFloat();
                Student stu = new Student(rollNo,name,cgpa);
                s.add(stu);
            }
            
            for (int i = 0; i < 3; i++) {
                String name = scanner.next();
                String subject = scanner.next();
                
                Teacher teach = new Teacher(name, subject);
                t.add(teach);
            } 
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        // Print the student and teacher lists
        System.out.println("Students:");
        for (Student s1 : s) {
            System.out.println(s1);
        }

        System.out.println("Teachers:");
        for (Teacher t1 : t) {
            System.out.println(t1);
        }

      }
      }

4. Watch any of the favorite movie of your choice (any language is fine, preferably English). Create a Text file to store at least 10 meaningful dialogs from the movie and store it in a text file. Process the file to remove the stop words (eg. the, is, was, .......) and create another file to have clean text (word).

Code:

    import java.io.*;
    import java.util.*;

    public class MainClass4 {
    public static void main(String[] args) {
        // Set of common stop words
        Set<String> stopWords = new HashSet<>(Arrays.asList("a", "an", "the", "is", "was", "and", "or", "in", "of", "will"));
       
        // Input file containing movie dialogs
        String inputFileName = "movie_dialogs.txt";
        // Output file to store cleaned text
        String outputFileName = "cleaned_dialogs.txt";
       
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) 
     {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" "); 
                for (String word : words) {
                    // Check if the word is a stop word
                    if (!stopWords.contains(word.toLowerCase())) {
                        writer.write(word + " ");
                    }
                }
                writer.newLine();
            }
	System.out.println("cleaned_dialogs text file created successfully.");

        } 
     catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

5. Write a java program to create Hashtable to act as a dictionary for the word collection. The dictionary meaning of the words, including synonyms, etc., has to be displayed.

Code:

     import java.util.Hashtable;

     public class MainClass5  {
    
    public static void main(String[] args) {
        
        // Create a Hashtable to store the words and their meanings
        Hashtable<String, String> dictionary = new Hashtable<>();
        
        // Add some words and their meanings to the dictionary
        dictionary.put("apple", "a round fruit with red or green skin and a white inside");
        dictionary.put("cloud", " a term used to describe a global network of servers, each with a unique function");
        dictionary.put("car", "a vehicle with four wheels that runs on roads");
        dictionary.put("computer", "an electronic device used for processing and storing data");
        
        // Add some synonyms for the words in the dictionary
        dictionary.put("apple", dictionary.get("apple") + ", also known as a fruit");
        dictionary.put("cloud", dictionary.get("cloud") + ", also called a virtual store");
        dictionary.put("car", dictionary.get("car") + ", also known as an automobile or vehicle");
        dictionary.put("computer", dictionary.get("computer") + ", also called a PC or a Mac");
        
        // Display the contents of the dictionary
        System.out.println("Dictionary:");
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }
    }

6. Declare two classes Student and Teacher. The classes will have the data members and constructors as per your convenience. Write a JAVA program, (i) where the Teacher will enter the marks of all the students in the database. (ii) Once the marks are entered, the student can view the marks

Code:

    import java.io.*;
    import java.util.Scanner;

    class MainClass6 {
    public static void main(String[] args) {
    try{
		File f1=new File("marks.txt");
		Scanner scanner = new Scanner(f1);
        } 
	catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            // Create a FileReader object to read from the file
            FileReader reader = new FileReader("marks.txt");

            // Ask the student to view their marks
            System.out.print("Enter your roll number to view the marks: ");
	Scanner scanner = new Scanner(System.in);

            int rollNo = scanner.nextInt();
            boolean found = false;
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) 
	{
                String[] tokens = line.split(" ");
                int studentRollNo = Integer.parseInt(tokens[0]);
                int studentMarks = Integer.parseInt(tokens[1]);
                if (studentRollNo == rollNo) 
	     {
                    System.out.println("Marks of roll number " + rollNo + ": " + studentMarks);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with roll number " + rollNo + " not found.");
            }

            // Close the FileReader object
            reader.close();
        } 
	catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
    }






        
        
