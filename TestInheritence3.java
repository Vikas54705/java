class Animal{
void eat(){
System.out.println("eating....");}
}
class Dog extends Animal{
void bark(){
System.out.println("barking....");}
}
class cat extends Animal{
void meow(){
System.out.println("meowing....");}
}
class TestInheritence3{
public static void main(String args[]){
cat c =new cat();
Dog d =new Dog();
c.meow();
c.eat();
d.bark();
}
}

