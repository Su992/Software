import java.util.*;
    class demo{
	public static void main(String[]args){
	Scanner kb=new Scanner (System.in);
	int a,b,c,d;
    
	b=(int)(Math.random()*21);
	c=1;
	while (c<=10){
    	a=kb.nextInt();
	if(a  > b){
	System.out.println ("猜错了，太大了！");
	}else if(a<b){
	System.out.println("猜错了，太小了！");
	}else{
	System.out.printf("猜对了是%d",b);
		break;}
	c++;
	    
     
	 if (c==11){
	    System.out.println("机会已尽是否需要查看答案？");	 
    	d=kb.nextInt();
	    if (d==1){
	    System.out.printf("答案是%d",b);
	}
		break;
		  }
	}	 
	
	
	}
}
	