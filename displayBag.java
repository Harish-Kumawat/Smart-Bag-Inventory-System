package com.bag;

public class displayBag {
	public static void main(String[] args) {
		
		//Pen Details
		 Pen p1=new Pen();
		 p1.penId=01;
		 p1.Company="Reynolds";
		 p1.penColor="Red";
		 p1.penType='G';
		 p1.isRefillable=true;
		 
		 Pen p2=new Pen();
		 p2.penId=02;
		 p2.Company="Cello";
		 p2.penColor="Black";
		 p2.penType='B';
		 p2.isRefillable=false;
		 
		 //Pencil Details
		 Pencil pc=new Pencil();
		 pc.Company="Natraj";
		 pc.pencilColor="Black";
		 pc.pencilId=01;
		 pc.isSharpened=true;
		 
		 //Compass Details
		 Compass com=new Compass();
		 com.brand="Camlin";
		 com.color="Yellow";
		 
		 com.pen1=p1;
		 com.pen2=p2;
		 com.pencil=pc;
		 
		 //Mobile Details
		 Mobile mob=new Mobile();
		 mob.billNo=111;
		 mob.mobilebrand="Apple";
		 mob.name="Iphone 17 pro max";
		 mob.isCharged=true;
		 
		 //Earphone Details
		 Earphone e=new Earphone();
		 e.earphoneId=11;
		 e.brand="Boat";
		 e.isWireless=true;
		 
		//Bag Details
		 Bag bg= new Bag();
		 bg.bagBrand="Sky Bags";
		 bg.bagColor= "Black";
		 
		 bg.compass=com;
		 bg.earphone=e;
		 bg.mobile=mob;
		 
		 System.out.println("-----------Bag Details-----------");
		 System.out.println("Bag Brand :"+ bg.bagBrand);
		 System.out.println("Bag Colour :"+ bg.bagColor);
		 
		 System.out.println("\n-----------Compass Details-----------");
		 System.out.println("Compass Brand :"+ bg.compass.brand);
		 System.out.println("Compass Colour :"+bg.compass.color);
		 
		 System.out.println("\n---Pen 1 Details");
		 System.out.println("Pen 1 Id :"+bg.compass.pen1.penId);
		 System.out.println("Pen 1 Brand :"+ bg.compass.pen1.Company);
		 System.out.println("Pen 1 Colour :"+ bg.compass.pen1.penColor);
		 System.out.println("Pen 1 Type :"+ bg.compass.pen1.penType);
		 System.out.println("Pen 1 Refillable :"+ bg.compass.pen1.isRefillable);
		 
		 System.out.println("\n---Pen 2 Details");
		 System.out.println("Pen 2 Id :"+bg.compass.pen2.penId);
		 System.out.println("Pen 2 Brand :"+ bg.compass.pen2.Company);
		 System.out.println("Pen 2 Colour :"+ bg.compass.pen2.penColor);
		 System.out.println("Pen 2 Type :"+ bg.compass.pen2.penType);
		 System.out.println("Pen 2 Refillable :"+ bg.compass.pen2.isRefillable);
		 
		 System.out.println("\n---Pencil Details");
		 System.out.println("Pencil Id :"+bg.compass.pencil.pencilId);
		 System.out.println("Pencil Name :"+bg.compass.pencil.Company);
		 System.out.println("Pencil Colour :"+bg.compass.pencil.pencilColor);
		 System.out.println("Pencil Sharpened :"+bg.compass.pencil.isSharpened);
		 
		 System.out.println("\n------------Earphone Details-----------");
		 System.out.println("Earphone Id :"+ bg.earphone.earphoneId);
		 System.out.println("Earphone Brand :"+ bg.earphone.brand);
		 System.out.println("Earphone wired or wireless :"+ bg.earphone.isWireless);
		 
		 System.out.println("\n------------Mobile Details----------");
		 System.out.println("Mobile Bill No.:"+bg.mobile.billNo);
		 System.out.println("Mobile Brand :"+bg.mobile.mobilebrand);
		 System.out.println("Mobile Charged:"+bg.mobile.isCharged);
		 System.out.println("Mobile Name :"+bg.mobile.name);
		 
	}

}
