package com.company.classes;

import com.company.main.Main;

public class Movie extends Show {
    private String tanggalRilis;
    private int durasi;
    public Movie(String judul, String sinopsis, String[] genre, String rating, String tanggalRilis, int durasi) {
        super(judul, sinopsis, genre, rating);
        this.tanggalRilis = tanggalRilis;
        this.durasi = durasi;
    }
    public String getTanggalRilis(){
        return this.tanggalRilis;
    }
    public int getDurasi(){
        return this.durasi;
    }
    public void setTanggalRilis(String tanggalRilis){
        this.tanggalRilis = tanggalRilis;
    }
    public void setDurasi(int durasi){
        this.durasi = durasi;
    }
    public static void main(String[] args) {
//        try{
//            FileWriter fw=new FileWriter("D:/src/com/company/main/text/movie.txt");
//            fw.write("Welcome to javaTpoint.");
//            fw.close();
//        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}

