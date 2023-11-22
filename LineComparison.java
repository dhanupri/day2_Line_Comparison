import java.util.Scanner;

class LineComparison  {

         public  static boolean areLinesEqual(int x1, int y1, int x2, int y2,
                                         int x3, int y3, int x4, int y4) {
            return (x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4) ||
                (x1 == x4 && y1 == y4 && x2 == x3 && y2 == y3);
         }
         public static int CompareTo(double line1,double line2){
             if(line1>line2){
                 return 1;
             }
             else if(line2> line1){
                 return 2;
             }
             else {
                 return 0;
             }
         }
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
            boolean linesAreEqual = areLinesEqual(x1, y1, x2, y2, x3, y3, x4,  y4);

            System.out.println("Lines are equal: " + linesAreEqual);

            int ans=CompareTo(length_line1,length_line2);

            if(ans==1){
                System.out.println("Line1 is greater than line2");
            }
            else if(ans==2){
                System.out.println("Line2 is greater than line1");

            }
            else{
                System.out.println("Line1 and Line2 are equal");
            }




        }
    }
