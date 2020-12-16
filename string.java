import java.io.*;
import java.util.*;
public class string
{
	public static void main(String args[])
	{
		char[]ch={'n','a','n','t','h','a'};
		String nam="nantha";
		String nam1="kumar";
		System.out.println((ch));
		System.out.println(nam.charAt(5));
		System.out.println(nam.length());
		System.out.println(nam.indexOf('t'));
		System.out.println(nam.indexOf(nam1));
		System.out.println(nam.indexOf('a',2));
		System.out.println(nam.compareTo(nam1));
		System.out.println(nam.concat(nam1));
		System.out.println(nam.replace('t','d'));
		System.out.println(nam.substring(0,5));
		System.out.println(nam.toUpperCase());
		System.out.println(nam.toLowerCase());
	}
}