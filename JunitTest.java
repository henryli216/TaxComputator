import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest {
	@Test public void mpftest() {
		double mpf = TaxComputator.MPFcalculator(370000);
		double testmpf = 18000.0;
		if(mpf==testmpf){
		System.out.println("Function for mpf over 36000 is OK!");}
		else{
			System.out.println("Function for mpf over 360000 is False");
		}
		assertEquals(mpf,testmpf,0.0);
		}
	@Test public void mpfnormal(){
		double mpfn = TaxComputator.MPFcalculator(180000);
		double testmpfn = 9000.0;
		if(mpfn == testmpfn){
			System.out.println("Function for Normal MPF is OK!");
		}else{
			System.out.println("Function for Normal MPF is False!");
		}
		assertEquals(mpfn,testmpfn,0.0);
	}
	@Test public void combineNormal(){
		double combineoutput = TaxComputator.taxCal(313000);
		double testcombine = 35210.0;
		if(combineoutput == testcombine){
			System.out.println("Function for Progressive Tax is OK!");
		}else{
			System.out.println("Function for Progressive Tax is False!");
		}
		assertEquals(combineoutput,testcombine,0.0);
	}
	@Test public void combineRich(){
		double Richoutput =TaxComputator.comStandard(5000000,100000,18000,5000);
		double Richtest = 761550.0;
		if(Richoutput == Richtest){
			System.out.println("Function using Standard Rate for Combined is OK!");
		}else{
			System.out.println("Function using Standard Rate for Combines is False!");
		}
		assertEquals(Richoutput,Richtest,0);
	}
	@Test public void singlePro(){
		double single = TaxComputator.taxCal(393100);
		double singletest = 48827;
		if(single == singletest){
			System.out.println("Function Using Progressive Rate for single is OK!");
		}else{
			System.out.println("Function Using Progressive Rate for singleis False!");
		}
		assertEquals(singletest,single,0.0);
	}
	@Test public void singleStandard(){
		double stand = TaxComputator.standard(15000246);
		double standtest = 2247336;
		if(stand == standtest){
			System.out.print("Function using standard Rate for single is OK!");
		}else{
			System.out.print("Function using standard Rate for single is False!");
		}
		assertEquals(stand,standtest,0.0);
		
	}
}

