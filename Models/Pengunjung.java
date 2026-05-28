package Models;

public class Pengunjung {

    private int id;
    private String nama;
    private String movieId;
    private String judulFilm;
    private int jumlahTiket;
    private double totalHarga;

    public Pengunjung(String nama, String movieId, String judulFilm, int jumlahTiket, double totalHarga) {
        this.nama = nama;
        this.movieId = movieId;
        this.judulFilm = judulFilm;
        this.jumlahTiket = jumlahTiket;
        this.totalHarga = totalHarga;
    }
}
