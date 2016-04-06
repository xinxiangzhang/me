package investment;

import java.util.Scanner;

public class investment {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in); 
		double sum,a ,b ,c;
        System.out.print("请输入本金：");
	    double money = scanner.nextDouble();
	    System.out.print("请输入利率：");
        double r = scanner.nextDouble();
        System.out.print("请输入存钱年数：");
        int years = scanner.nextInt();        
        System.out.println("股票投资：");
        a=money*0.25; //拿25%的本金来每月固定股票投资
        sum=years*12*(a*(r/12)+a);
        System.out.println("若拿25%的本金投资股票，本金每月固定不变，则最后得到的资产总值为：" + sum);
        b=money*0.35;//拿35%的本金来连本带利股票投资
        sum=0;
        sum=b*(Math.pow(1+r,years)-1)/r;
        System.out.println("若拿35%的本金连本带利投资股票，则最后得到的资产总值为：" + sum);
        c=money*0.4;//拿40%的本金来债券投资       
        sum=0;
        System.out.println("债券投资：");
        sum=c*r*years;
        System.out.println("若拿40%的本金来债券投资，则最后得到的资产总值为："+sum);       
	}
}
