package test;
class oops {
	oops()
	{
		System.out.println("Object is created\n");
	}
	oops(int i)
	{
		System.out.println("cunstructor call through child");
	}
	int prodid;
	String name;
	int price;
	
	void showproductsDetails() {
		System.out.println("Id:"+prodid);
		System.out.println("name:"+name);
		System.out.println("price:"+price);
	}
	void setproductsdetails(int prodid,String name,int price)
	{
		this.prodid=prodid;
		this.name=name;
		this.price=price;
	}
	void setproductsdetails()
	{
		this.prodid=0;
		this.name=null;
		this.price=0;
	}
}
class mobile extends oops{
	mobile(){
		super(1);
			}
}
class datatypes {
   public static void main(String args[])
   {
	   mobile obj = new mobile();
	   obj.name="iphone";
	   System.out.println(obj.name);
	   obj.setproductsdetails(12,"samsung",12000);
	   mobile obj1 = new mobile();
	   obj1.setproductsdetails();
	   
	   obj.showproductsDetails();
	   obj1.showproductsDetails();
   }
}
