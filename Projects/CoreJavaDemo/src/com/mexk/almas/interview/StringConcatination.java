package com.mexk.almas.interview;

public class StringConcatination {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1+" "+s2+" "+ (s1==s2));
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1+" "+sb2+" "+ (sb1==sb2));
	}

	
}
/*Above example shows that  ,String is immutable and string buffer is mutable  .  So string s2 and s1 both pointing 
 * to the same string abc . And ,  after making the changes the string s1 points to abcd and s2 points to abc ,
 *  hence false .
 *
  While in string buffer ,  both sb1 and sb2 point to the same object  , As string buffer is mutable , so
   making changes in one string also make changes to the other string . So both string still pointing to the same 
   object after making the changes to the object (here sb2)
*/