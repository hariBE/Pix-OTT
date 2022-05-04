package com.revature.fsd.pixott.handler;

import java.awt.List;

import com.revature.fsd.pixott.dao.WishListDao;
import com.revature.fsd.pixott.model.Movie;

public class WishListHandler {
	public static void display() {
		int unique=LoginHandler.id;
		System.out.println("you watched movie list");
		System.out.println("*********");
		WishListDao list=new WishListDao();
		List<Movie> movie=list.view(unique);
		movie.forEach(System.out::println);
		System.out.println("select the movie id to play");
		int option=App.scanner.nextInt();
		System.out.println("Thanks for watchig......");
		UserMenu.display();
	}

}
