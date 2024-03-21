// Marycruz Maciel 
//Sept 09 2022
//Description: Example of: Accessor, Mutator, Constructor(Default, Explicit), Instance
//File Name: Person.java
//To Compile in terminal type: Person.java
//To run the program type: java person 

class Person 
{
  //data declaration section 
  //below are the instance variables,
  // instance variable belong to Instances
  String name; //instance variable
  int age; //instance variable 

  //Default COnstructor: Same person initially 
  Person ()
  {
    name = "ALex";
    age = 36;
  }

  // Explicit Constructor - specific person initially 
  // Parameter is a variable that accept the ARGUMETNS 
  Person(String newName, int newAge)
  { //          ^^Parameter  ^^parameter
    name = newName;
    age= newAge;
  }
  //Mutator 
  void changeName(String newName) 
  {
    name = newName;
  }
  public String toString()
  {
    return "person's name = " + name + ", age = " + age;
  }
  public static void main(String[] args)
  {
    //"me" and "someone" are an "INSTANCE" of the Person class
    Person me = new Person();
    Person someone = new Person("Ellen", 56);
    //"Ellen" and 56 are ARGUMENTS^^     ^^
    //ARGUMENTS are the values that go into the PARAMETERS 

    System.out.println(me);
    me.changeName("Alex");
    System.out.println(someone);
  }
}

/* 
Marycruzs-Air:Week 2A.1 marycruzmaciel$ javac Person.java
Marycruzs-Air:Week 2A.1 marycruzmaciel$ java Person
person's name = ALex, age = 36
person's name = Ellen, age = 56
*/