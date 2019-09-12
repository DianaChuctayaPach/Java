import java.util.Scanner;
public class Mayor{
	public static void main(String arg[]){
	Scanner n=new Scanner (System.in);
	int a,b,c; int mayor=0; int  menor=0;
	System.out.println("Ingresar un valor para A: ");
	a=n.nextInt();
	System.out.println("Ingresar un valor para B: ");
	b=n.nextInt();
	System.out.println("Ingresar un valor para C: ");
	c=n.nextInt();
	if(a>b){
	menor=b; 
	mayor=a;
	}else{ menor=a; mayor=b;}
        if(c>mayor){
	mayor=c; 
	} 
	if(c<menor){
	menor=c;
	}
System.out.println("Mayor: "+mayor);
System.out.println("Menor: "+menor);


  }
}