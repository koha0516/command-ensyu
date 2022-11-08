import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	System.out.print("・身長(cm)を入力してください：");
    	double height = stdIn.nextDouble(); // 身長を入力
    	System.out.print("・体重(Kg)を入力してください：");
    	double weight = stdIn.nextDouble(); // 体重を入力
	double bmi = weight / Math.pow((height/100), 2);
	System.out.println("BMI値は" + (((double)Math.round(bmi*100))/100) + "です。");
	}
}

