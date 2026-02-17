class Conversion 
    {
    public static void main(String args[])
    {
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.00f;
        double d=60.0984;
        char c='a';
        boolean b2=true;
        
        //autoboxing : converting primitives into objects
        byte byteobj=b;
        short shortobj=s;
        int intobj=i;
        long longobj=l;
        float floatobj=f;
        double doubleobj=d;
        char charobj=c;
        boolean boolobj=b2;
        
        //printing objects
        System.out.println("------printing object values----");
        System.out.println("byte object:" + byteobj);
        System.out.println("short object:" + shortobj);
        System.out.println("integer object:" + intobj);
        System.out.println("long object:" + longobj);
        System.out.println("float object:" + floatobj);
        System.out.println("double object:" + doubleobj);
        System.out.println("character object:" + charobj);
        System.out.println("boolean object:" + boolobj);
        
        //unboxing : converting objects to primitives.
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;
        
        //printing primitives
        System.out.println("-----printing primitive values-----");
        System.out.println("byte value:" + bytevalue);
        System.out.println("short value:" + shortvalue);
        System.out.println("integer value:" + intvalue);
        System.out.println("long value:" + longvalue);
        System.out.println("float value:" + floatvalue);
        System.out.println("double value:" + doublevalue);
        System.out.println("character value:" + charvalue);
        System.out.println("boolean value:" + boolvalue);
        
        
    }
    
    }
