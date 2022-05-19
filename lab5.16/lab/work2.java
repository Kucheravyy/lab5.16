package lab;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a=3;
        double b=4;
        double c=Math.pow(a, 2);
        double d=Math.pow(b, 2);
        double e=c+d;
        System.out.println("first leg:3.0,second leg:4.0,third leg:" +Math.sqrt(e));
        double q = (a*b *0.5);
        System.out.println("the area of the triangle"+q);
        double w=(a+b+ Math.sqrt(e));
        System.out.println("the perimeter of the triangle"+w); 
	}

}
