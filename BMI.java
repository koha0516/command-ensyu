import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	System.out.print("・一人目の身長(cm)を入力してください：");
    	double height = stdIn.nextDouble(); // 身長を入力
    	System.out.print("・一人目の体重(Kg)を入力してください：");
    	double weight = stdIn.nextDouble(); // 体重を入力
	double bmi = weight / Math.pow((height/100), 2);
	 System.out.print("・二人目の身長(cm)を入力してください：");
        double height = stdIn.nextDouble(); // 身長を入力
        System.out.print("・二人目の体重(Kg)を入力してください：");
        double weight = stdIn.nextDouble(); // 体重を入力
        double bmi = weight / Math.pow((height/100), 2);
	System.out.println("一人目のBMI値は" + (((double)Math.round(bmi*100))/100) + "です。");
	System.out.println("二人目のBMI値は" + (((double)Math.round(bmi*100))/100) + "です。");
	}
}

