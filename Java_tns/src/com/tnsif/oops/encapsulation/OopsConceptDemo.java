package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
	

		//Var declaration/Data members
		private int serialNum; //int,string,boolean,float
		private String name; //private can be accessible only within class
		private int age;
		
		//getters and setters method -it is a build in method
		public int getSerialNum() { //is used to get the var name
			return serialNum;
		}
		public void setSerialNum(int serialNum) {
        	this.serialNum = serialNum; //this keyword refers to current object
        }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//object class method
		@Override
		public String toString() {
			return "OopsConceptDemo [Serial Number="+ serialNum +","+"name="+ name +",age=" + age+"]";
		}
}
