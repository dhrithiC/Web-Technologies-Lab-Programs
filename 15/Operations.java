package mycom;
import java.io.Serializable;

public class Operations
{
	String x, y;
	public Operations()
	{

	}
	public void setProp1(String x)
	{
		prop1 = x;
	}
	public void setProp2(String y)
	{
		prop2 = y;
	}
	public String getProp1()
	{
		return x;
	}
	public String getProp2()
	{
		return y;
	}
	public String performOperation(String op)
	{
		String result = "";
		if(op.equals("add"))
			result = Integer.parseInt(x) + Integer.parseInt(y) + "";
		else if(op.equals("sub"))
			result = Integer.parseInt(x) - Integer.parseInt(y) + "";
		else if(op.equals("mul"))
			result = Integer.parseInt(x) * Integer.parseInt(y) + "";
		return result;
	}
}