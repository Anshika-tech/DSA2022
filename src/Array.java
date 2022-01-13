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
import java.util.Scanner;
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

