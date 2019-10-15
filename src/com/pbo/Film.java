package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini menampilkan daftar film beserta keterangannya
 *
 */

public class Film {

    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying() {
        System.out.println("\nJudul film : ".concat(this.filmName));
        System.out.println("Genre film : ".concat(this.filmGenre));
        System.out.println("Rating film : ".concat(toString().valueOf(this.filmRating)));
        System.out.println("Duration film : ".concat(toString().valueOf(this.filmDuration).concat(" menit")));
    }

    public static void main(String[] args) {

        String[] listOfTitle = {"Venom", "Small Foot", "Crazy Rich Asian", "Asih"};
        String[] listOfGenre = {"Action, Horror, Scifi", "Animation", "Comedy", "Horror"};
        Double[] listOfRating = {8.5, 9.0, 7.8, 6.0};
        int[] listOfDuration = {120, 96, 119, 100};

        Film film1 = new Film();
        film1.filmName = listOfTitle[0];
        film1.filmGenre = listOfGenre[0];
        film1.filmRating = listOfRating[0];
        film1.filmDuration = listOfDuration[0];

        Film film2 = new Film();
        film2.filmName = listOfTitle[1];
        film2.filmGenre = listOfGenre[1];
        film2.filmRating = listOfRating[1];
        film2.filmDuration = listOfDuration[1];

        Film film3 = new Film();
        film3.filmName = listOfTitle[2];
        film3.filmGenre = listOfGenre[2];
        film3.filmRating = listOfRating[2];
        film3.filmDuration = listOfDuration[2];

        Film film4 = new Film();
        film4.filmName = listOfTitle[3];
        film4.filmGenre = listOfGenre[3];
        film4.filmRating = listOfRating[3];
        film4.filmDuration = listOfDuration[3];

        System.out.println("=== Daftar Film Sedang Tayang ===");
        film1.nowPlaying();
        film2.nowPlaying();
        film3.nowPlaying();
        film4.nowPlaying();
    }
}
