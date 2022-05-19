package lab;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] a =new int[1];
         for (int i =0; i<a.length; i++) {
        	 a[i] =(int)(Math.round(Math.random()*40)-20);
        	 System.out.println(a[i]);
         }
	}

}
