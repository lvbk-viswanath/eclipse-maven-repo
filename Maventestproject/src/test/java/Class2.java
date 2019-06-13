



public class Class2 {

public String swap(String s)
{
   int len=s.length();
  if( len <2 )
 {
    return s;
 }
 char last=s.charAt(len-1);
 char last2=s.charAt(len-2);
 return s.substring(0,len-2)+last+last2;
}
}
