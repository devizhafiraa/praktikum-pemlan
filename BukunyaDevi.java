public class BukunyaDevi {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String penerbit;
    private String kategori;
    private String sinopsis;

    public BukunyaDevi(String judul, String penulis, int tahunTerbit, String penerbit, String kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }

    public void tampilkanBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("=============================");
        
    }

    public int hitungJumlahKataSinopsis() {
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }

    public double cekTingkatKesamaan(BukunyaDevi bukuLain) {
        int sama = 0;
        if (this.judul.equals(bukuLain.judul)) sama++;
        if (this.penulis.equals(bukuLain.penulis)) sama++;
        if (this.tahunTerbit == bukuLain.tahunTerbit) sama++;
        if (this.penerbit.equals(bukuLain.penerbit)) sama++;
        if (this.kategori.equals(bukuLain.kategori)) sama++;
        if (this.sinopsis.equals(bukuLain.sinopsis)) sama++;
        return (sama / 6.0) * 100;
    }
// constructor copy buat nyalin dari object lain
public BukunyaDevi(BukunyaDevi bukuLain) {
    this.copy(bukuLain);
}
  // method copy buat nyalin dari object lain
  public void copy(BukunyaDevi bukuLain) {
    this.judul = bukuLain.judul;
        this.penulis = bukuLain.penulis;
        this.tahunterbit = bukuLain.tahunterbit;
        this.penerbit = bukuLain.penerbit;
        this.kategori = bukuLain.kategori;
        this.sinopsis = bukuLain.sinopsis;
    }
     // method buat bikin object baru dengan isi yang sama
    public BukunyaDevi copy() {
        return new BukunyaDevi(judul, penulis, tahunTerbit, penerbit, kategori, sinopsis);
    }
}
