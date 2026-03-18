package edu.jecrc.sdt_java.oops.class_and_object;

public class JavaAppBL {
	public static  boolean ab(int num)
	{
		int count = 0;
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            count++;

            temp /= 10;
        }

        return count == sum;
		
	}
	
	public static boolean spy(int num)
	{
		int prod = 1;
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            prod*=digit;

            temp /= 10;
        }

        return prod == sum;
	}
	public static boolean xylem(int num) {
		

        int lastDigit = num % 10;   
        num = num / 10;

        int meanSum = 0;


        while (num >= 10) {
            meanSum += num % 10;
            num /= 10;
        }

        int firstDigit = num;   

        int extremeSum = firstDigit + lastDigit;

        return extremeSum == meanSum;
	
	
	}
	public static boolean disarium(int num) {
		int temp=num,c=0;
		while (temp >0) {
            c++;
            
            temp/=10;
        }
		temp=num;
		int sum=0;
		while(temp>0)
		{
			int r=temp%10;
			int re=1;
			for(int i=1;i<=c;i++)
			{
				re=re*r;
			}
			sum=sum+re;
			temp/=10;
			c--;
		}
		return num==sum;
	}
	
}
