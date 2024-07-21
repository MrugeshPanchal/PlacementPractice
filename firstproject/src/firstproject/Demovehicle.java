package firstproject;

import java.util.Arrays;

public class Demovehicle {

	public static void main(String[] args) {
			//declartion
			
			vehicle vn, vn1 ;
			
			vn=new vehicle();
			vn1=new vehicle();
			
			vn.setCompany("mercedzes");
			vn.setColour("white");
			vn.setproduct("cream");
			
			System.out.println(vn.getCompany());
			System.out.println(vn.getColour());
			System.out.println(vn.getproduct());
		}
}
