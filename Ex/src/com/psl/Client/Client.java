package com.psl.Client;


import java.util.*;

import com.psl.beans.*;

public class Client {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		TwoWheeler tw=new TwoWheeler("Activa","MH-12 LM 7642","Petrol");
		
		FourWheeler f2=new FourWheeler("Charger", "MH-12 LM 7642", "Black");
		//List list2=new ArrayList();
		ArrayList<String> list=new ArrayList<String>();
		list.add("adsadsad");
		list.add("adsadsad");
		list.add("adsadsad");
		User u=new User(1, "Rohit", list, tw);
	}
	
}