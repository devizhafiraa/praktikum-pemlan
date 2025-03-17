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
    
        public String getJudul() {
            return judul;
        }
    
        public void tampilkanBuku() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("Penerbit: " + penerbit);
            System.out.println("Kategori: " + kategori);
            System.out.println("Sinopsis: " + sinopsis);
            System.out.println("Jumlah Kata Sinopsis: " + hitungJumlahKata());
            System.out.println("=============================");
        }
        
        public int hitungJumlahKata() {
            return sinopsis.split(" ").length;
        }
        
        public int cekKesamaan(BukunyaDevi bukuLain) {
            int total = 5;
            int kesamaan = 0;
            if (this.judul.equalsIgnoreCase(bukuLain.judul)) kesamaan++;
            if (this.penulis.equalsIgnoreCase(bukuLain.penulis)) kesamaan++;
            if (this.tahunTerbit == bukuLain.tahunTerbit) kesamaan++;
            if (this.penerbit.equalsIgnoreCase(bukuLain.penerbit)) kesamaan++;
            if (this.kategori.equalsIgnoreCase(bukuLain.kategori)) kesamaan++;
            return (kesamaan * 100) / total;
        }
        
        public BukunyaDevi copy() {
            return new BukunyaDevi(judul, penulis, tahunTerbit, penerbit, kategori, sinopsis);
        }
    }
    