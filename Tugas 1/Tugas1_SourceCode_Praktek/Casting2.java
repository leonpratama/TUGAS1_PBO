/* NIM   : 13020240269
Nama  : Leon Octa Pratama
Hari/Tanggal : 5 April 2026
Waktu : 04:00*/
public class Casting2 {
    public static void main(String[] args) {
        int a, b = 9;
        float d, e = 3.2f;
        char g = '5';
        double k;

        String n = "67", m = "45", l = "100";

        a = Integer.parseInt(n);
        k = Double.parseDouble(m);
        d = Float.parseFloat(l);

        System.out.println("a : " + a + "\nk : " + k + "\nd : " + d);

        n = String.valueOf(b);
        m = String.valueOf(g);
        l = String.valueOf(e);

        System.out.println("n : " + n + "\nm : " + m + "\nl : " + l);
    }
}