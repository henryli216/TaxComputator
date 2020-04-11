import org.junit.Test;
import static org.junit.Assert.*;
@SuppressWarnings("static-access")
public class JunitTest {
	TaxComputator test = new TaxComputator();
	double T1 = test.standard(300000,18000);
	double T2 = test.standard(3000000,18000);
	double mpfT1 =test.MPFcalculator(370000);
	double mpfT2 = test.MPFcalculator(180000);
	double mpfT3 = test.MPFcalculator(40000);
	double mpfT4 = test.MPFcalculator(60000);
	double tcT1 = test.taxCal(313000);
	double tcT2 = test.taxCal(5000);
	double tcT3 = test.taxCal(1163000);
	double tcT4 = test.taxCal(0);
	double taxCal1 = TaxComputator.taxCal(150000);
	double taxCal2 = TaxComputator.taxCal(50000);
	double taxCal3 = TaxComputator.taxCal(2850000);
	double ComT1 =test.comStandard(1000000, 30000, 18000, 1500);
	double ComT2 =test.comStandard(4000, 1000000, 200, 18000);
	double ComT3 =test.comStandard(60000, 34000, 3000, 1700);
	double ComT4 =test.comStandard(700000, 0, 18000, 0);
	
	@Test public void standardtest(){
		assertEquals(42300,T1,0.0);
		assertEquals(447300,TT2,0.0);
	}
	@Test public void mpftest() {
		assertEquals(18000,mpfT1,0.0);
		assertEquals(9000,mpfT2,0.0);
		assertEquals(2000,mpfT3,0.0);
		assertEquals(3000,mpfT4,0.0);
	}
	@Test public void taxCaltest(){
		assertEquals(35210,tcT1,0.0);
		assertEquals(100,tcT2,0.0);
		assertEquals(179710,tcT3,0.0);
		assertEquals(0,tcT4,0.0);
		assertEquals(9000,taxCal1,0.0);
		assertEquals(0,taxCal2,0.0);
		assertEquals(447300,(float)taxCal3,0.0);
	}
	@Test public void Comstandardtest(){
		assertEquals(151575,ComT1,0.0);
		assertEquals(147870,ComT2,0.0);
		assertEquals(13395,ComT3,0.0);
		assertEquals(102300,ComT4,0.0);
	}
}

