package com.revature.fsd.pixott.model;

public class Top5 {
	private int id;
	private String movies;
	public Top5(int id, String movies) {
		super();
		this.id = id;
		this.movies = movies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((movies == null) ? 0 : movies.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Top5 other = (Top5) obj;
		if (id != other.id)
			return false;
		if (movies == null) {
			if (other.movies != null)
				return false;
		} else if (!movies.equals(other.movies))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Top5 [id=" + id + ", movies=" + movies + "]";
	}
	}

