import java.util.*;

class prime_num{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int count=0;
for(int i=1;i<=num;i++){
	if(num%i==0){
		count++;
		}
	}
	if(count==2){
		System.out.println("primne number");
		}
		else{
			System.out.println("Not prime number");
			}

}
}