import java.util.Scanner;

class LineComparison  {

     
        public static void main(String[] args){
            System.out.println("WELCOME TO LINE CPMPARISION COMPUTATION");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the coordinates of Line 1");
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            System.out.println("coordinates are: (x1,x2): ("+x1+","+x2+")"+ "(y1,y2): ("+y1+","+y2+")");
            double diff_x=  Math.pow((x2-x1),2);
            double diff_y= Math.pow((y2-y1),2);

            double length_line1=  Math.sqrt(diff_x+diff_y);


            System.out.println("Enter the coordinates of Line 2");
            int x3=sc.nextInt();
            int x4=sc.nextInt();
            int y3=sc.nextInt();
            int y4=sc.nextInt();
            System.out.println("coordinates are: (x1,x2): ("+x3+","+x4+")"+ "(y1,y2): ("+y3+","+y4+")");
            double diff_x3=  Math.pow((x4-x3),2);
            double diff_y3= Math.pow((y4-y3),2);

            double length_line2=  Math.sqrt(diff_x3+diff_y3);
	 

	 
           



        }
    }
