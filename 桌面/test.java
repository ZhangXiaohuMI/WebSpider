package hust2012.mi.zxh.simple;
import java.io.*;
import hust2012.mi.zxh.simple.*;

public class test
{
	static public void main(String[] args)
	{
		/**可变参数实现
		*/
		new test().printOutArray((Object[])new String[]{"test"});
		
		new Person("zxh",new Person("zzn",null,null),new Person("zww",null,null)).printRelationship();
		return ;
	}

	void printOutArray(Object... obArray)
	{
		for(Object ob:obArray)
		{
			System.out.print(ob.toString()+"\n");
		}
	}

}

class Person
{
	public String name;
	private Person mother;
	private Person father;
	
	public Person(String name,Person mother,Person father)
	{
		this.name=name;
		this.father=father;
		this.mother=mother;
	}

	public void printRelationship()
	{
		System.out.println(mother.name+"@"+father.name+"--->>"+name);
	}
}
