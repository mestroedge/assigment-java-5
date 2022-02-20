
public class flip {
public static void main(String args[])
{ int Heads ,tails;
int n;
Heads = 0;
tails = 0;
//n = (int)(Math.random()*30);
n=20;
for(int i=0;i<n;i++)
{
	if(Math.random()>=0.5)
	{
	Heads+=1;
	}
	else
	{
	tails+=1;
	}
}
//System.out.println(Math.random());
System.out.println("Heads percentage"+ (float)((Heads*100/n)) +"\n" +"Tails percentage"+(float)((tails*100/n)));
}
}
