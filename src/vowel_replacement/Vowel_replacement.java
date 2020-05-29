
package vowel_replacement;

import java.util.Scanner;

public class Vowel_replacement {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String name;
       String  name2;
       name2="";
        name=sn.nextLine();
        char ch;
        int len;
        len=name.length();
        
        for(int i=0;i<len;i++)
        {
        ch=name.charAt(i);
        ch=Character.toLowerCase(ch);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {    ch='z';
        }
          else{
                System.out.println("No vowel present");
                }
        name2=name2+ch;
      
      }
        System.out.println(name2);
    }
      
    
}
