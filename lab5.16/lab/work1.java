package lab;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] array;
           int b = (int) Math.round(Math.random()*100);
           array = new int [b];
        		   for (int i =0; i<array.length; i++) {
        			   array[i] =i+1;
        			   int a = (int) Math.round(Math.random()*100);
        			   System.out.println(a);
        		   }
	}

}
