package fulijisuan;

import org.junit.Assert;
import org.junit.Before;

public class Test {
	private Object P;
	@Before
	public void setUp() throws Exception {
	}
	@org.junit.Test
	public void test1() {
		double F=1900000.00;
		double P = 1000000.00;
		double r = 0.03;
		int N = 30;
		F=P+P*N*r;
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
	@org.junit.Test
	public void test2() {
		double F=3000000;
		double P = 1235960.28;
		double r = 0.03;
		int N = 30;
		P=F/Math.pow(1+r, N);
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
	@org.junit.Test
	public void test3() {
		double F=2000000;
		double P =1000000;
		double r = 0.1;
		int N = 7;
		N=(int)((Math.log(F)/Math.log(1+r))-(Math.log(P)/Math.log(1+r)));
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
	@org.junit.Test
	public void test4() {
		double F=2000000;
		double P =1000000;
		double r = 1.15;
		int N = 5;
		r=Math.pow(F/P,1d/N);
		 Assert.assertEquals(25, 19384.2982435, 0.0);
	}
	@org.junit.Test
	public void test51() {
		double F=1427262.47;
		double P =30000;
		double r = 0.03;
		int N = 30;
		F=P*(Math.pow((1+r), N)-1)/r;
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
	@org.junit.Test
	public void test52() {
		double F=1748210.65;
		double P =3000;
		double r = 0.03;
		int N = 30;
		F=P*(Math.pow(1+r/12.0, N*12)-1)/(r/12);
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
	@org.junit.Test
	public void test6() {
	    double p1=13750.00;
		double P =100000;
		double r = 0.065;
		int N = 10;
		 p1=(P+(P*r)*N)/12;
		 Assert.assertEquals(143004, 143004.6710959476, 1.0);
	}
}
