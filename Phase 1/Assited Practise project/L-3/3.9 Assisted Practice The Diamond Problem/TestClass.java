package simplilearn.com.multithreading2;

public class TestClass implements First,Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    }


}
