import java.util.Scanner;
class Multi
{
public static void main(String args[])
{
Scanner ml=new Scanner(System.in);
System.out.println("ENTR THR NO:::");
int i= ml.nextInt();
int j,k;
for(j=1;j<=10;j++)
	{
        k=i*j;
		System.out.println(i+"*"+j+"="+k);
	}

}
}