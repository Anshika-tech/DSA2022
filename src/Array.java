// how to create Array of non primitive data types
/*import java.util.Scanner;
class Student {
    int rollno;
    String name;
    int marks;
    public Student(int rollno,String name, int marks)
    {
        this.name = name;
        this.marks = marks;
        this.rollno= rollno;
    }
}
public class Array {
    public static void main(String[] args) {

        // creating an array that will hold 5 student objects
        Student arr[] = new Student[5];

        // initializing the array with Student object
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= new Student(s.nextInt(),s.next(),s.nextInt()); // object creation
        }

        // traverse/print all the objects value stored in array
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].rollno + "\t" + arr[i].name+ "\t"+ arr[i].marks);
        }
    }
}*/
//check whether array of integers contain duplicate elements or not .If yes print the index of duplicate element .
/*import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    f=1;
                    System.out.println(arr[i]+ " duplicate found at index "+j);
                }
            }
        }
        if(f==0){
            System.out.println("duplicate elements not found");
        }
    }
}
//create arr[4][5] in which 4 students and their marks in 5 subject are present.
//a. find average of each subject.
//b. find average of each student.
//c. display no. of students scored below 50.
//d. display the scores of every student.
import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][5];
        int c=0;
        for(int i=0;i<4;i++){
            int s=0;
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                s+=arr[i][j];
            }
            System.out.println("average of student "+(i+1)+ " is "+ s/5.0);
            if((s/5.0)<50.0){
                c++;
            }
        }
        System.out.println("total no. of students scored below 50 in their average is "+c);
        for(int j=0;j<5;j++){
             int s1=0;
            for(int i=0;i<4;i++){
                s1+=arr[i][j];
            }
            System.out.println("average of subject "+(j+1)+ " is "+ s1/4.0);
        }
        for(int i=0;i<4;i++){
            System.out.println("scores of student "+(i+1)+"are ");
            for(int j=0;j<5;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}*/
/* create an array of 5 students and print the record of those student who got the highest marks
and who got the lowest marks and members of class are private.
 */
import java.util.Scanner;
class Student {
    private int rollno;
     private String name;
    private int marks;
    public Student(int rollno,String name, int marks)
    {
        this.name = name;
        this.marks = marks;
        this.rollno= rollno;
    }
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
}
public class Array {
    public static void main(String[] args) {
        // creating an array that will hold 5 student objects
        Student arr[] = new Student[5];
        // initializing the array with Student object
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= new Student(s.nextInt(),s.next(),s.nextInt()); // object creation
        }
        // traverse/print all the objects value stored in array
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].getRollno() + "\t" + arr[i].getName()+ "\t"+ arr[i].getMarks());
        }
        int m=arr[0].getMarks();
        int n=arr[0].getMarks();
        for(int i=1;i<arr.length;i++){
            m=Math.max(m,arr[i].getMarks());
            n=Math.min(n,arr[i].getMarks());
        }
        System.out.println("highest marks is "+ m);
        System.out.println("lowest marks is "+ n);
        System.out.println("record of lowest and highest marks student are \n");
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMarks()==m){
                System.out.println(arr[i].getRollno() + "\t" + arr[i].getName()+ "\t"+ arr[i].getMarks());
            }
            if(arr[i].getMarks()==n){
                System.out.println(arr[i].getRollno() + "\t" + arr[i].getName()+ "\t"+ arr[i].getMarks());
            }
        }

    }
}


