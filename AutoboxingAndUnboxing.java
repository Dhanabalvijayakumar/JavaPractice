package MyFirstExample;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;

		Byte byteobj=b;                /*Byte is class:syntax: classname classobj= value*;this will save the space*/
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		System.out.println(" object:"+byteobj);
		System.out.println(" object:"+shortobj);
		System.out.println(" object:"+intobj);
		System.out.println(" object:"+longobj);
		System.out.println(" object:"+floatobj);
		System.out.println(" object:"+doubleobj);
		System.out.println(" object:"+charobj);
		System.out.println(" object:"+booleanobj);
		
		
		byte bytevalue=byteobj;                              /*syntax: datatype variable=value*/
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;

		System.out.println(" object1:"+bytevalue);
		System.out.println(" object1:"+shortvalue);
		System.out.println(" object1:"+intvalue);
		System.out.println(" object1:"+longvalue);
		System.out.println(" object1:"+floatvalue);
		System.out.println(" object1:"+doublevalue);
		System.out.println(" object1:"+charvalue);
		System.out.println(" object1:"+booleanvalue);
		


	}

}
