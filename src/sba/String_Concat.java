package sba;

import java.util.*;
class String_Concat
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=sc.nextLine();
        System.out.print("Inmate's father's name:");
        String fname=sc.nextLine();
        String st = name.concat(" ").concat(fname);
        char []chars=name.toCharArray();
        for(char c:chars)
        {
            if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*'||c=='('
            ||c==')'||c=='-'||c=='='||c=='/'||c=='<'||c=='>'||c=='?'||c=='{'||c=='}'||c=='['||c==']')
            {
                System.out.print("Invalid name");
                System.exit(0);
            }
        }
        System.out.println(st.toUpperCase());
    }
}
