import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	System.out.print("�E�g��(cm)����͂��Ă��������F");
    	double height = stdIn.nextDouble(); // �g�������
    	System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    	double weight = stdIn.nextDouble(); // �̏d�����
	double bmi = weight / Math.pow((height/100), 2);
	System.out.println("BMI�l��" + (((double)Math.round(bmi*100))/100) + "�ł��B");
	}
}

