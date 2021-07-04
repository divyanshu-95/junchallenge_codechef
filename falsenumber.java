import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            String str=s.next();
            String a="";
            if(str.charAt(0)=='1'){
                a=a+"10"+str.substring(1);
            }else{
                a=a+"1"+str;
            }
            System.out.println(a);
        }
    }
}
