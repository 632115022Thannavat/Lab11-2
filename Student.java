//Thannavat 632115022
public class Student {
   String name;
   double num1;
   double num2;
   public Student(String name,double num1,double num2){
      this.name = name;
      this.num1 = num1;
      this.num2 = num2;
   }
   public String getname(){
      return name;
   }
   public double getnum1(){
      return num1;
   }
   public double getnum2(){
      return num2;
   }
   @Override
   public boolean equals(Object obj){
      if(obj == null){
         return false;
      }
      if(obj == this){
         return true;
      }
      return this.getname() == ((Student)obj).getname(); 
          
   }
   public boolean equals1(Object obj){
      if(obj == null){
         return false;
      }
      if(obj == this){
         return true;
      }
      return this.getnum1() == ((Student)obj).getnum1(); 
          
   }
   public boolean equals2(Object obj){
      if(obj == null){
         return false;
      }
      if(obj == this){
         return true;
      }
      return this.getnum2() == ((Student)obj).getnum2(); 
          
   }
}
