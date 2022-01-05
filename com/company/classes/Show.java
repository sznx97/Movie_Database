package com.company.classes;

public class Show {

    private String judul;
    private String sinopsis;
    private String[] genre;
    private String rating;

    public Show(String judul, String sinopsis, String[] genre, String rating){
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.genre = genre;
        this.rating = rating;
    }
    public String getJudul(){
        return this.judul;
    }
    public String getSinopsis(){
        return this.sinopsis;
    }
    public String[] getGenre(){
        return this.genre;
    }
    public String getRating(){
        return this.rating;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    public void setGenre(String[] genre){
        this.genre = genre;
    }
    public void setRating(String rating){
        this.rating = rating;
    }

}
