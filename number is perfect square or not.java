import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int i;
    boolean res=false;
    for(i=1;i*i<=num;i++)
    {
      if((num%i==0) && (num/i==i)){
        res=true;
      }
    }
      if(num==i*i){
        System.out.println("Perfect Square");
      }
      else{
      System.out.println("Not");
    }
}
}
