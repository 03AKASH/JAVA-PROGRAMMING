
 class Employee
  {
       int r;
       String n;
       int p;
       String des;
       String dep;
    
       Employee(int record_id,String Name,int ph_Number,String Designation,String Department)
       {
              r = record_id;
              n= Name;
              p = ph_Number;
              des = Designation;
              dep = Department;
       }

       void display()
        {
            System.out.println(r+"\t\t"+n+"\t\t"+p+"\t\t"+des+"\t\t"+dep);
        }
    
        public static void main(String[] args)
         {
             Employee ob1 = new Employee(01,"Akshay",754474999,"HOD","MCA");
             Employee ob2 = new Employee(02,"Kiran",753467879,"Staff","MCA");
             Employee ob3 = new Employee(03,"Aromal",856565449,"HOD","MBA");
             Employee ob4 = new Employee(04,"Lekshmi",959834679,"Staff","MBA");
             Employee ob5 = new Employee(05,"Akash",65445649,"HOD","Btech");
               
             ob1.display();
             ob2.display();
             ob3.display();
             ob4.display();
             ob5.display();
                   
         }
       
  } 