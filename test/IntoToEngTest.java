import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class IntoToEngTest {

	@Test
	public void テスト0() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void テスト10() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

	@Test
	public void テスト22() {
		IntToEng ite = new IntToEng();
		String expected = "twenty two";
		String actual = ite.translateEng(22);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	@Test
	public void テスト33() {
		IntToEng ite = new IntToEng();
		String expected = "thirty three";
		String actual = ite.translateEng(33);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	@Test
	public void テスト11() {
		IntToEng ite = new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

	@Test
	public void テスト20() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void テスト40() {
		IntToEng ite = new IntToEng();
		String expected = "fourty";
		String actual = ite.translateEng(40);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void テスト100() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void テスト119() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred nineteen";
		String actual = ite.translateEng(119);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト120() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty";
		String actual = ite.translateEng(120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト151() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred fifty one";
		String actual = ite.translateEng(151);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1000() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1019() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand nineteen";
		String actual = ite.translateEng(1019);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1020() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand twenty";
		String actual = ite.translateEng(1020);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1100() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred";
		String actual = ite.translateEng(1100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1119() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred nineteen";
		String actual = ite.translateEng(1119);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1120() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred twenty";
		String actual = ite.translateEng(1120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト1121() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred twenty one";
		String actual = ite.translateEng(1121);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void テスト10000() {
		IntToEng ite = new IntToEng();
		String expected = "ten thousand";
		String actual = ite.translateEng(10000);

		assertThat(actual, is(expected));
	}
}