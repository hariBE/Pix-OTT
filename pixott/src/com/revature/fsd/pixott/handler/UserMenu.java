package com.revature.fsd.pixott.handler;
import java.util.*;

public class UserMenu {
public static void display() {
	System.out.println("====MENUS====");
	System.out.println("1.TOP 5 movies");
	System.out.println("2.Search Movies");
	System.out.println("3.Your Wish List");
	System.out.println("4.Logout");
	System.out.println("enter option");
	Scanner scan = new Scanner(System.in);
	int option=scan.nextInt();
	if(option==1) {
		Top5moviesHandler.top5();
		UserMenu.display();		
	}else if(option==2) {
		SearchMovieHandler.display();
		UserMenu.display();
	}
	else {
		System.out.println("enter option");
	}
}
}
