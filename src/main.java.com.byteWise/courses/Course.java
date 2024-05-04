package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// course class for Online-Course System
public class Course {
	 private String title;
	 private String description;
	 private int price;
	 private int grade ;
	 private ArrayList<Student> class_list = new ArrayList<>();
	 

	    public Course (String title, String description) {
	        this.title = title;
	        this.description = description;
	   
	    }
	    //setters part
	    public void setTitle(String title) {
	    	  this.title=title;}
	    
	    public void setdescription(String description) {
	    	  this.description=description;}
	    //getters part
	    public String getTitle() {
	        return title;}
	 
	    
	    public String getDescription() {
	        return description;}

	    @Override
	    public String toString() {
	        return title + " - " + description; }
	    
	   
	    public void showmembers() {
			for(int i = 0; i < this.class_list.size(); i++) {
				System.out.println(this.class_list.get(i).getName());
			}
		}
		public void addStudent(Student x) {
			this.class_list.add(x);
		}
}
