import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;

public class Main {
   
	public static void main(String ...args){
		String [] names = { "thando","mafela","lionel","thaboe" };
		for(String name:names){
		   out.println(name);
		}
                //prints the first name
		out.println("My name is "+names[0]);
                for(int x=0; x<names.length;x++){
		   out.println("The name is "+names[x]);
		}
	Person thando = new Person("Thando","Mafela");
	Person lionel = new Person("Lionel","Mafela");
        List<Person> list = new ArrayList<Person>();
        list.add(thando);
	list.add(lionel);
        
	// the person list is printed out 
	for(Person p:list){
		out.print("Name :"+p.getName());
		out.print("\tSurname :"+p.getSurname());
		out.println("");
	}
    }


}
class Person {
  private String name;
  private String surname;

  public Person(String name,String surname){
 	this.name = name;
	this.surname = surname;
  }

  public String  getName(){
     return this.name;
  }

  public String getSurname(){
     return this.surname;
  }


}
