package quiz1question1;

import java.util.Scanner;
public class Qbrating {
	
	public static double examine(double x){
		if (x>2.375){
			x=2.375;
		}
		else if (x<0){
			x=0;
			
		}
		else{
			return x;	
		}
		return x;
	}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner datainput=new Scanner(System.in);
		
		System.out.print("Enter a quarterback collects touchdowns:");
		double TD=datainput.nextDouble();
		
		System.out.print("Enter total yards:");
		double YDS=datainput.nextDouble();
		
		System.out.print("Enter interceptions:");
		double INT=datainput.nextDouble();
		
		System.out.print("Enter completions:");
		double COMP=datainput.nextDouble();
		
		System.out.print("Enter number of passes attempted:");
		double ATT=datainput.nextDouble();
		
		datainput.close();
		
		double a=(COMP/ATT-0.3)*5;
		examine(a);
		double b=(YDS/ATT-3)*0.25;
		examine(b);
		double c=(TD/ATT)*20;
		examine(c);
		double d=2.375-(INT/ATT*25);
		examine(d);
		
		double PasserRating=((a+b+c+d)/6)*100;
		System.out.printf("The passer Rating is %,2f:", PasserRating);
					
		}
	}


