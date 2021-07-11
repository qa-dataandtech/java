package com.code.ooo;

import java.util.Date;

public class Movie {
   public  String name;
   public Date releaseDate;
   public String cast;
   public float length;

    public Movie() {
    }

    public Movie(String name, Date releaseDate, String cast, float length) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cast = cast;
        this.length = length;
    }

    public Movie(String name, Date releaseDate, String cast) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cast = cast;
    }



}
