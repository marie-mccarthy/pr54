package pr54;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class pr54 {
public static void main(String[] args) throws FileNotFoundException
{
	ArrayList <Student> Class = new ArrayList <Student>();
  Scanner file = new Scanner(new File( "pr54.dat" ));
  int times = file.nextInt();      
  file.nextLine();
  int total = 0;
  for( int zz = 0; zz < times; zz++ )
  {
    //creates the array
	String teacher = file.next();
	String student = file.next();
		Class.add(new Student(teacher, student));
file.nextLine();
    //sorts the array
    for (int j = 0; j < (Class.get(zz).getTeacher()).length()-1; j++)

//    {
//      int minIndex = j;
//      for (int k = j + 1; k < Class.size(); k++)
//      {
//        if (Class.get(k).getList() < Class.get(k).getList())
//        {
//        minIndex = k;
//        }
//      }
//      list temp =  Class.get(j);
//      home.get(j) = Class.get(minIndex);
//      Class.get(minIndex) = temp;
//    //removes duplicates
    	
  //print the array
    for(int i= 0 ; i <Class.size(); i ++)
    {
      System.out.println(Class.get(i).getTeacher());     
      if(Class.get(i).getName().equals(Class.get(i).getTeacher()))
    	  {
    		  System.out.println(Class.get(i).getName());
    	  }
    }
}
}

}
