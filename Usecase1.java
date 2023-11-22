import java.util.Scanner;
class LineComparison  {
    public static void main(String[] args){
        System.out.println("WELCOME TO LINE CPMPARISION COMPUTATION");
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the coordinates of Line 1");
       double x1=sc.nextInt();
        double x2=sc.nextInt();
        double y1=sc.nextInt();
        double y2=sc.nextInt();
       System.out.println("coordinates are: (x1,x2): ("+x1+","+x2+")"+ "(y1,y2): ("+y1+","+y2+")");
        double diff_x=  Math.pow((x2-x1),2);
        double diff_y= Math.pow((y2-y1),2);

       double length_line1=  Math.sqrt(diff_x+diff_y);
       

        System.out.println("Enter the coordinates of Line 2");
        double x3=sc.nextInt();
        double x4=sc.nextInt();
        double y3=sc.nextInt();
        double y4=sc.nextInt();
        System.out.println("coordinates are: (x1,x2): ("+x3+","+x4+")"+ "(y1,y2): ("+y3+","+y4+")");
        double diff_x3=  Math.pow((x4-x3),2);
        double diff_y3= Math.pow((y4-y3),2);

        double length_line2=  Math.sqrt(diff_x3+diff_y3);
        



    }
}
