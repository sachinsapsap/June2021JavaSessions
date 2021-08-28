package javasessions;

import java.util.ArrayList;

public class Ecomm {
	
	public ArrayList<String> getSellerList(String productName)
	{
		System.out.println("Product name is : "+ productName);
		ArrayList<String> sellerList=new ArrayList<String>();
		if(productName.equals("MacBook Pro"))
		{
			sellerList.add("Seller1");
			sellerList.add("Seller2");
		}
		else
		{
			sellerList.add("Seller3");
		}
		return sellerList;
	}

	public static void main(String[] args) {
		Ecomm obj= new Ecomm();
		System.out.println(obj.getSellerList("MacBook Pro"));

	}

}
