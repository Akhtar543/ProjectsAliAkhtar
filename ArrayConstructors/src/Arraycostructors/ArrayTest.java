package Arraycostructors;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ArrayTest {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df=new DecimalFormat("###.#");
	String numall="";
	String average;
	String gpa;
	public void ArrayTest() {
		double[] allnums;
		double avg = 0;
		String Savg="",collegegpa = "";
		System.out.print("How many grades? ");
		int numgrade = scan.nextInt();
		if(numgrade<=0) {
			System.out.println("Enter a number higher than zero");
		}
		else {
			allnums=new double[numgrade];
			for (int i=0; i<numgrade;i++) {
				System.out.println("Enter grade");
				allnums[i]=scan.nextDouble();
					if (numgrade <= 2) {
						avg=0;
						Savg="The Average needs more than two numbers.";
					}
					else {
						avg+=(allnums[i])/numgrade;
						Savg=df.format(avg);
						if (avg >= 97 && avg <= 100) {
						    collegegpa = "A+";
						} else if (avg >= 93 && avg < 97) {//I have to use a if else,if/else because you can't use switchers with doubles.
						    collegegpa = "A";
						} else if (avg >= 90 && avg < 93) {
						    collegegpa = "A-";
						} else if (avg >= 87 && avg < 90) {
						    collegegpa = "B+";
						} else if (avg >= 83 && avg < 87) {
						    collegegpa = "B";
						} else if (avg >= 80 && avg < 83) {
						    collegegpa = "B-";
					
						} else {
						    collegegpa = "F";
						}
					}
				
				
			}
			for (int i=0; i<numgrade;i++) {
					if (numgrade<=2) {
						numall="You need more than 2 grades to compute!";
					}
					else {
						numall+=", "+allnums[i];
					}
				
			}
		}
		this.gpa=collegegpa;
		this.numall=numall;
		this.average=Savg;
	}
	
}
