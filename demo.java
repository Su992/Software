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
	System.out.println ("�´��ˣ�̫���ˣ�");
	}else if(a<b){
	System.out.println("�´��ˣ�̫С�ˣ�");
	}else{
	System.out.printf("�¶�����%d",b);
		break;}
	c++;
	    
     
	 if (c==11){
	    System.out.println("�����Ѿ��Ƿ���Ҫ�鿴�𰸣�");	 
    	d=kb.nextInt();
	    if (d==1){
	    System.out.printf("����%d",b);
	}
		break;
		  }
	}	 
	
	
	}
}
	