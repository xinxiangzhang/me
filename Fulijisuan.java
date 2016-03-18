import java.text.DecimalFormat;
import java.util.Scanner;

public class Fulijisuan {
	public static void main(String[] args) {
		          // TODO Auto-generated method stub
		System.out.println("欢迎使用复利计算器！");
		/*复利计算公式：F=P*(1+r)^N
		 * F:复利终值
		 * P:本金
		 * r:利率
		 * N:利率获取时间的整数倍
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.print("复利计算器：计算单利和复利请按1,计算本金请按2,股票请按3,报酬率请按4,资产总值请按5,每月等额本息还款请按6:");
		int num=scanner.nextInt();
		 DecimalFormat df1 = new DecimalFormat("#.00");
		if(num==1){
			double F;
	        System.out.print("请输入本金P：");     
	        double P = scanner.nextDouble();  
	        System.out.print("请输入存入年数N：");
	        int N = scanner.nextInt();           
	        System.out.print("请输入利率r：");
	        double r = scanner.nextDouble();
	        F=P+P*N*r;
	        System.out.println("单利终值为F："+df1.format(F));
	        F=0;
	        System.out.print("请输入复利次数：");
	        double m = scanner.nextDouble();
	         F=P*(Math.pow((1+r/m), N*m));
	             System.out.println("复利终值为F："+df1.format(F));

		}
		if(num==2){
			 double H=1,P;
	          System.out.print("请输入复利终值F：");     
	          double F = scanner.nextDouble();  
	          System.out.print("请输入存入年数N：");
	          int N = scanner.nextInt();           
	         System.out.print("请输入利率r：");
	          double r = scanner.nextDouble();
	             P=F/Math.pow(1+r, N);
	             System.out.println("本金应为P："+df1.format(P));
		}
		if(num==3){
			double N = 1;
			System.out.print("请输入本金P：");     
	        double P= scanner.nextDouble();  
	        System.out.print("请输入终值F：");
	        double F= scanner.nextDouble();           
	        System.out.print("请输入报酬率r：");
	        double r = scanner.nextDouble();
	        	N=(int)((Math.log(F)/Math.log(1+r))-(Math.log(P)/Math.log(1+r)));
	        System.out.println("存入时间为N："+N);
		}
		if(num==4){
			double r= 1;
			System.out.print("请输入本金P：");     
	        double P= scanner.nextDouble();  
	        System.out.print("请输入终值F：");
	        double F= scanner.nextDouble();           
	        System.out.print("请输入存入年数N：");
	        int N = scanner.nextInt();
	        	r=Math.pow(F/P,1d/N);
	        System.out.println("报酬率应为r："+df1.format(r));
		}
		if(num==5){
			System.out.println("年投入请按51,月投入请按52:");
			int number=scanner.nextInt();
			if(number==51){
			    double F= 1;
				System.out.print("请输入年本金P：");     
		        double P= scanner.nextDouble();  
		        System.out.print("请输入利率r：");
		        Double r= scanner.nextDouble();           
		        System.out.print("请输入存入年数N：");
		        int N = scanner.nextInt();
		        	F=P*(Math.pow((1+r), N)-1)/r;
		        System.out.println("按年投资的终值为F："+df1.format(F));
				}
			if(number==52){
				System.out.print("请输入月本金P：");     
		        double P= scanner.nextDouble();  
		        System.out.print("请输入利率r：");
		        Double r= scanner.nextDouble();           
		        System.out.print("请输入存入年数N：");
		        int N = scanner.nextInt();
		        double F=P*(Math.pow(1+r/12.0, N*12)-1)/(r/12);
		        System.out.println("按月投资的终值为F："+df1.format(F));
				}
			}
	        
		                    
		if(num==6){
			double p1=1,F=1;
			System.out.print("请输入借款金额P：");     
	        double P= scanner.nextDouble();  
	        System.out.print("请输入年利率r：");
	        Double r= scanner.nextDouble();           
	        System.out.print("请输入还款期限N：");
	        int N = scanner.nextInt();
	        for(int i=1;i<=N;i++){
	        	F=P+(P*r)*N;
	        }
	        p1=F/12;
	        System.out.println("每月等额本息还款为："+df1.format(p1));
			
		}
	}
}
