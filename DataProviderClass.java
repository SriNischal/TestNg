package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProviderClass
{
	@Test(dataProvider="nischal")
	   	public void input(String name,String id) {
		System.out.println("this test case run for 3 people");
		System.out.println(name);
		System.out.println(id);
	}
    @DataProvider(name="nischal")
    public Object[][] dataProvider()
    {
    	Object[][] obj=new Object[3][2];
        obj[0][0]="Nischal";
        obj[0][1]="1";
        obj[1][0]="Suraj";
        obj[1][1]="2";
        obj[2][0]="Magesh";
        obj[2][1]="3";
		return obj;
    }
}