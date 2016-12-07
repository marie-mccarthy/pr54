package pr54;

import Dog;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class pr54 {
public static void main(String[] args)
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
//    for (int j = 0; j < (home.getTeacher()).legnth-1; j++)
//    {
//      int minIndex = j;
//      for (int k = j + 1; k < home.size(); k++)
//      {
//        if (home.get(k).getList() < home.get(k).getList())
//        {
//        minIndex = k;
//        }
//      }
//      list temp =  home.get(j);
//      home.get(j) = home.get(minIndex);
//      home.get(minIndex) = temp;
//    //removes duplicates
//  if(home.contains(home.get(zz)))
//        {
//        home.remove(zz);
//        }
//        //removes spaces
//    if(home.contains(" "))
//        {
//        home.remove(" ");
//        }
//  }
//  //print the array
//    for(int i= 0 ; i <home.size(); i ++)
//    {
//      System.out.println(home.get(i));
 //   }
}
}

}
