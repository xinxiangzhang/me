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
		System.out.print("复利计算器：计算单利和复利请按1,计算本金请按2,股票请按3，报酬率请按4:");
		int num=scanner.nextInt();
		if(num==1){
			double H=1,F;
	        System.out.print("请输入本金：");     
	        double P = scanner.nextDouble();  
	        System.out.print("请输入存入年数：");
	        int N = scanner.nextInt();           
	        System.out.print("请输入利率：");
	        double r = scanner.nextDouble();
	        F=P+P*N*r;
	        System.out.println("单利终值为："+F);
	        F=0;
	         for(int i=1;i<=N;i++){
	               H=(1+r)*H;
	           }
	             F=H*P;
	             System.out.println("复利终值为："+F);

		}
		if(num==2){
			 double H=1,P;
	          System.out.print("请输入复利终值：");     
	          double F = scanner.nextDouble();  
	          System.out.print("请输入存入年数：");
	          int N = scanner.nextInt();           
	         System.out.print("请输入利率：");
	          double r = scanner.nextDouble();
	          for(int i=1;i<=N;i++){
	               H=(1+r)*H;
	           }
	             P=F/H;
	             System.out.println("本金应为："+P);
		}
		if(num==3){
			double N = 1;
			System.out.print("请输入本金：");     
	        double P= scanner.nextDouble();  
	        System.out.print("请输入终值：");
	        int F= scanner.nextInt();           
	        System.out.print("请输入报酬率：");
	        double r = scanner.nextDouble();
	        for(int i=1;i<=F;i++){
	        	N=Math.log(F/P)/Math.log(1+r);
	        }
	        System.out.println("存入时间为："+N);
		}
		if(num==4){
			double r= 1;
			System.out.print("请输入本金：");     
	        double P= scanner.nextDouble();  
	        System.out.print("请输入终值：");
	        int F= scanner.nextInt();           
	        System.out.print("请输入存入年数：");
	        double N = scanner.nextDouble();
	        for(int i=1;i<=F;i++){
	        	r=Math.pow(F/P,1d/N);
	        }
	        System.out.println("报酬率应为："+r);
		}
		                    
	 
		 }
	}
