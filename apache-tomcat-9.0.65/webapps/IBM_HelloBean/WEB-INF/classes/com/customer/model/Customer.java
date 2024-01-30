package com.customer.model;

public class Customer implements java.io.Serializable {
		private String username;
		private String addr;

		public Customer(){}
		
		public String getUsername(){
			return username;
			
		}
		
		public String getAddr(){
			return addr;
		}
		
		public void setUsername(String username){
			this.username=username;
			System.out.println("username="+username);
		}
		
		public void setAddr(String addr){
			this.addr=addr;
			System.out.println("addr="+addr);
		}
}