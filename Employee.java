class Employee{
float salary=100000;
}
class programmer extends Employee{
int bonus=5000;
public static void main(String []args){
programmer p=new programmer();
System.out.println("programmer salary="+ p.salary);
System.out.println("programmer bonus="+ p.bonus);
}
}


