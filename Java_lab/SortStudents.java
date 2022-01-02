import java.util.*;
class Student{
private int roll;
private String name;
private int marks;
public void setRoll(int roll){
this.roll = roll;
}
public int getRoll(){
return roll;
}
public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}
public void setMarks(int marks){
this.marks = marks;
}
public int getMarks(){
return marks;
}
}
public class SortStudents
{
public static void main(String args[]){
List stu= new ArrayList();
Student st1= new Student();
st1.setRoll(101);
st1.setName("Amit");
st1.setMarks(56);
Student st2= new Student();
st2.setRoll(103);
st2.setName("Anil");
st2.setMarks(66);
Student st3= new Student();
st3.setRoll(103);
st3.setName("Ankit");
st3.setMarks(76);
stu.add(st1);
stu.add(st2);
stu.add(st3);
ListIterator listItr =(ListIterator)stu.listIterator();
while(listItr.hasNext()){
Student stud =(Student)listItr.next();
System.out.print(" "+stud.getRoll());
System.out.print(" "+stud.getName());
System.out.println(" "+stud.getMarks());
}
while(listItr.hasPrevious()){
Student stud =(Student)listItr.previous();
System.out.print(" "+stud.getRoll());
System.out.print(" "+stud.getName());
System.out.println(" "+stud.getMarks());
}
}
}