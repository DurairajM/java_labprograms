//Copying a java array
package lab_programs;
public class ex61 {
	public static void main(String ar[])
	{
		char[] name={'a','b','c','d','e','f','g','h','i','j','k','l'};
		char[] toname=new char[8];
		System.arraycopy(name, 2, toname, 0, 8);
		System.out.println(new String(toname)+" ");
	}

}