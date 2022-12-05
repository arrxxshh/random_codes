
import java.util.*;


 
public class java_patterns{

//recatngle_pattern_1
    public static void rectangle(int rows,int col){
        int n=0;
    for(int i=0;i<rows;i++){
        
        for(n=0;n<col;n++){
            if(i!=0  && i!=rows-1 && n!=0 && n!=col-1 ){
            System.out.print("  ");
            }
            else
            {System.out.print('*'+" ");}
        }
        System.out.println();
        
    }
    }
//inverted rotated pyramid
public static void irpyr(int rows){
    for(int i=0;i<rows;i++){
        for(int spaces=0;spaces<rows-i;spaces++){
            System.out.print(' ');
        }
        for(int n=0;n<=i;n++){
            System.out.print('*');
        }
        System.out.println();

    }
}
//invrtd_hlf_pyramd_num
public static void ihpn(int rows) {
    for(int i=0;i<rows;i++){
        int a=1;
        for(int j=0;j<rows-i;j++){
            
            System.out.print(a + "  ");
            a++;
        }
        System.out.println();
    }
    
}
//floyd_triangle
public static void floyd(int rows) {
    int a=1;
    for(int i=0;i<rows;i++){
        
        for(int j=0;j<=i;j++){
            if(a>9)//formatting no logic
            System.out.print(a + " ");
            else
            System.out.print(a + "  ");
            a++;
        }
        System.out.println();
    }
    
}

//zero_one_triangle
public static void zot(int rows) {
    
    for(int i=0;i<rows;i++){
        
        for(int j=0;j<=i;j++){
            if((i+j)%2==0)
            System.out.print(1+"  ");
            else
            System.out.print(0+"  ");
        }
        System.out.println();
        
    }
}
//butterfly
public static void bttr(int rows) {
    for(int i=1;i<=rows;i++){
    //top half
        //left
        for(int j = 0;j<i;j++){
            System.out.print("* ");
        }
        
        //space
        for(int j = 0;j<2*(rows-i);j++){
            System.out.print("  ");
        }
        
        //right
        for(int j = 0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=rows;0<=i;i--){
        //bottom half
            //left
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            
            //space
            for(int j = 0;j<2*(rows-i);j++){
                System.out.print("  ");
            }
            
            //right
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
}
// solid rhombus
public static void rs(int rows) {
    for(int i=1;i<=rows;i++)
    {
        for(int spc=1;spc<=(rows-i);spc++){
            System.out.print(" ");
        }
        for(int j=0;j<rows;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

}
//hollow rhombus
public static void hrs(int rows) {
    for(int i=1;i<=rows;i++)
    {
        for(int spc=1;spc<=(rows-i);spc++){
            System.out.print(" ");
        }
        for(int j=1;j<=rows;j++){
            if(j==rows||j==1||i==1||i==rows)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
    }

}
  //diamond
  public static void dmnd(int rows) {
    for(int i=1;i<=rows;i++)
    {
        for(int j=0;j<rows-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=rows-1;i>=1;i--)
    {
        for(int j=0;j<rows-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
   
   public static void main(String[] args) {
    System.out.println("rectangle");
    rectangle(10, 10);
    System.out.println("inverted rotated pyramid:");
    irpyr(10);
    System.out.println("inverted half pyramid of numbers:");
    ihpn(10);
    System.out.println("floyd's triangle:");
    floyd(10);
    System.out.println("zero and one triangle:");
    zot(10);
    System.out.println("butterfly:");
    bttr(10);
    System.out.println("solid rhombus:");
    rs(10);
    System.out.println("hollow rhombus ");
    hrs(10);
    System.out.println("diamond");
    dmnd(10);
}
}