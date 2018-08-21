//Passing Array to method in java
package lab_programs;
public class ex59 {
	static void mini(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);
	}
public static void main(String ar[])
{
	ex59 a=new ex59();
	int arrr[]={12,25,2,7};
	mini(arrr);
}
}
