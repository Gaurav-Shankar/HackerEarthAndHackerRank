package sm;

import java.io.*;
import java.util.LinkedList;

import sm.bean.Shop;
import sm.dao.ShopDAO;

public class ShopMallApp {
	public static void main(String[] args) {


		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			while(true){
				System.out.println("============= Welcome Shopping Mall ===============");
				System.out.println("If you are a user type USER ");
				System.out.println("If you are aadministrator type ADMIN");
				System.out.println("To exit the app type exitApp");
				String opt = br.readLine();
				if(opt.equalsIgnoreCase("exitApp")) {
					break;
				}
				if(opt.equalsIgnoreCase("ADMIN")){

					System.out.println("Enter ADMIN password : ");
					String user_pass = br.readLine();
					if("123".equalsIgnoreCase(user_pass)){
						while(true) {

							System.out.println("To add enter a");
							System.out.println("To update enter u");
							System.out.println("To delete enter d");
							System.out.println("To search enter s");
							System.out.println("To exit enter e");
							String in = br.readLine();

							if("a".equalsIgnoreCase(in)){
								Shop s1 = new Shop();
								System.out.println("Please enter name");
								s1.setName(br.readLine());
								if(ShopDAO.findShop(s1.getName()) != null){
									System.out.println("Already Exists!!");
									continue;
								}
								System.out.println("Please enter floor");
								s1.setFloor(br.readLine());
								System.out.println("Please enter shop no");
								int no = Integer.parseInt(br.readLine());
								s1.setShopNo(no);
								System.out.println("Please enter category");
								s1.setCategory(br.readLine());
								boolean res = ShopDAO.insertShop(s1);
								if(res){
									System.out.println("inserted!!");
								}
							}
							else if("u".equalsIgnoreCase(in)){
								Shop s1 = new Shop();
								System.out.println("Please enter name");
								s1.setName(br.readLine());
								if(ShopDAO.findShop(s1.getName()) == null){
									System.out.println("Does not exists!!");
									continue;
								}
								System.out.println("Please enter floor");
								s1.setFloor(br.readLine());
								System.out.println("Please enter shop no");
								int no = Integer.parseInt(br.readLine());
								s1.setShopNo(no);
								System.out.println("Please enter category");
								s1.setCategory(br.readLine());
								boolean res = ShopDAO.updateShop(s1);
								if(res){
									System.out.println("updated!!");
								}

							}
							else if("d".equalsIgnoreCase(in)){
								System.out.println("Please enter name");
								String name = br.readLine();
								if(ShopDAO.findShop(name) == null){
									System.out.println("Does Not Exists!!");
									continue;
								}
								boolean res = ShopDAO.deleteShop(name);
								if(res){
									System.out.println("deleted!!");
								}			

							}
							else if("s".equalsIgnoreCase(in)){
								System.out.println("Search a shop!");
								System.out.println("Please enter name");
								String name = br.readLine();
								LinkedList<Shop> res = ShopDAO.searchShop(name);
								if(res.size()==0){
									System.out.println("No records found!!");
									continue;				
								}
								for(Shop s1 : res){
									System.out.println("======================");
									System.out.println("Name = " + s1.getName());
									System.out.println("Floor No = " + s1.getFloor());
									System.out.println("Shop No = " + s1.getShopNo());
									System.out.println("category  = " + s1.getCategory());
								}
							}
							else if("e".equalsIgnoreCase(in)){
								break;
							}
							else {
								System.out.println("INVALID OPTION!!");
							}
						}
					}
					else {
						System.out.println("Wrong password!!");

					}
				}
				else if(opt.equalsIgnoreCase("USER")){
					while(true) {
						System.out.println("To search type ser");
						System.out.println("To exit type exit");
						String user_opt = br.readLine();
						if("ser".equalsIgnoreCase(user_opt)) {

							System.out.println("Search a shop!");
							System.out.println("Please enter name");
							String name = br.readLine();
							LinkedList<Shop> res = ShopDAO.searchShop(name);
							if(res.size()==0){
								System.out.println("No records found!!");
								continue;				
							}
							for(Shop s1 : res){
								System.out.println("======================");
								System.out.println("Name = " + s1.getName());
								System.out.println("Floor No = " + s1.getFloor());
								System.out.println("Shop No = " + s1.getShopNo());
								System.out.println("category  = " + s1.getCategory());
							}
						}
						else if("exit".equalsIgnoreCase(user_opt)){
							break;
						}

					}
				}
				

			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}



	}
}








