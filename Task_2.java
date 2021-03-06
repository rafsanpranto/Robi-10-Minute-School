package com.mycompany.robi10minuteschool;
import java.util.*;
public class Task_2 {
    public static void main(String[]args)
    {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int count = 0, size = 0;
        do
          {
               char name[] = str.toCharArray();
               size = name.length;
               count = 0;
               for(int j=0; j < size; j++)
               {
                    if(name[0] == name[j])
                    {
                        count++;
                    }
               }
               if(count!=0)
               {
                    System.out.print(name[0]+""+count);
               }
               str = str.replace(""+name[0],"");          
          }
        while(size != 1);
     }
}
