/* NIM   : 13020240269
Nama  : Leon Octa Pratama
Hari/Tanggal : 18 April 2026
Waktu : 13:00*/

package tokobuah;

public class Buah {
    private String nama;
    private int harga, stok;

    public Buah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String info() {
        return nama + " Rp" + harga + " (stok: " + stok + ")";
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }

    public int total(int qty) {
        return harga * qty;
    }
}
