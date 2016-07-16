import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class exeEngine1 {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
	String [][] recdata=LaunchTheAmazonApplication.readExcel("C:/Users/LenMathew/Documents/amazon/test suit.xls/", "Sheet1");
	String script;
	for(int i=1;i<recdata.length;i++){
	try {
		script=recdata[i][1];
		Method a=LaunchTheAmazonApplication.class.getMethod(script);
		a.invoke(a);
	} catch (Exception e) {
		System.out.println(e);
	}
		
	}
	
}
}
