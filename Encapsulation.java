class Encapsulation
{
	private int i=5;
}
class Data extends Encapsulation
{
	int i;
	public void getprint()
	{
		this.i=i;
	}
	public void setcopy()
	{
		System.out.println(i);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Data d=new Data();
		d.getprint();
		d.setcopy();
	}
} 
