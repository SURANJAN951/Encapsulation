package EncapsulationDemo;
class Student{
    private String name;
    private int age;
    public void setName(String name){

        this.name=name;
    }
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
        else{
            System.out.println("invalid age");
        }
    }
    public int getAge(){

        return age;
    }
   public String getName(){

        return name;
   }
//   Mai setValue ka use karke ek hi method se sab ka value
//    set kar sakta hu:-
//                      public void setValues(String name,int age){
//                         this.name=name;
//                         this.age=age;
//                      }
//   and you can call like this:-> s.setValue("boii",89)
// one another point ki ham ek sath multiple data set kar
// sakte hai but ek sath print nhi kar sakte because return
// keyword ek baar me ek hi data return karta hai.

}
public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student();


        s.setName("boii");
        s.setAge(89);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
