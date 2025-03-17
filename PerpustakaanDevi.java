public class PerpustakaanDevi {
    public static void main(String[] args) {
        Kategoriks[] kategoriList = {
            new Kategoriks("Teknologi"), new Kategoriks("Filsafat"), new Kategoriks("Sejarah"),
            new Kategoriks("Agama"), new Kategoriks("Psikologi"), new Kategoriks("Politik"), new Kategoriks("Fiksi")
        };

        String[][] dataBuku = {
            {"Menyelami Teknologi", "Budi Raharjo", "2020", "Gramedia", "Teknologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Revolusi Digital", "Soe Hok Gie", "2019", "Mizan", "Teknologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Inovasi Tak Terbatas", "Arief Budiman", "2021", "Elex Media", "Teknologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Teknologi Masa Depan", "Rani Suryani", "2022", "Indie Book", "Teknologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Transformasi Digital", "Tomi Gunawan", "2020", "Alpukat", "Teknologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Filsafat Hidup", "Sukarno", "2015", "Alfabet", "Filsafat", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Pemikiran Filosofis", "Joko Widodo", "2018", "Buku Kita", "Filsafat", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Merenung di Dunia Filsafat", "Pramudya Ananta Toer", "2017", "Pustaka Populer", "Filsafat", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Sejarah Indonesia", "Eddy Saparudin", "2016", "Erlangga", "Sejarah", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Perang Dunia Kedua", "Rudi Wijaya", "2015", "Yayasan Pustaka", "Sejarah", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Al-Qur'an", "K.H. Hasyim Asyari", "2010", "Mizan", "Agama", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Kisah Nabi Muhammad SAW", "Amien Rais", "2015", "Buku Muslim", "Agama", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Psikologi Manusia", "Psikologina", "2021", "Psikologi Press", "Psikologi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Politik Indonesia", "Puan Maharani", "2016", "Buku Politik", "Politik", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"},
            {"Laskar Pelangi", "Andrea Hirata", "2005", "Bentang Pustaka", "Fiksi", "Bukunya bagus banget makanya beli dongggg jangan gratisan kan penulis udah hardwork banget nih ye"}
        };

        for (String[] buku : dataBuku) {
            int indexKategori = switch (buku[4]) {
                case "Teknologi" -> 0;
                case "Filsafat" -> 1;
                case "Sejarah" -> 2;
                case "Agama" -> 3;
                case "Psikologi" -> 4;
                case "Politik" -> 5;
                case "Fiksi" -> 6;
                default -> -1;
            };
            if (indexKategori != -1) {
                kategoriList[indexKategori].tambahBuku(new BukunyaDevi(buku[0], buku[1], Integer.parseInt(buku[2]), buku[3], buku[4], buku[5]));
            }
        }

        for (Kategoriks kategori : kategoriList) {
            kategori.tampilkanBuku();
        }

        System.out.println("===== Tingkat Kesamaan Buku =====");
        for (Kategoriks kategori : kategoriList) {
            for (int i = 0; i < kategori.getDaftarBuku().size(); i++) {
                for (int j = i + 1; j < kategori.getDaftarBuku().size(); j++) {
                    BukunyaDevi buku1 = kategori.getDaftarBuku().get(i);
                    BukunyaDevi buku2 = kategori.getDaftarBuku().get(j);
                    System.out.println("Kesamaan antara \"" + buku1.getJudul() + "\" dan \"" + buku2.getJudul() + "\": " + buku1.cekKesamaan(buku2) + "%");
                }
            }
        }
    }
}
