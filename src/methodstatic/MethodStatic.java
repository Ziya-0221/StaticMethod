
package methodstatic;

/**
 *
 * @author indi
 */
public class MethodStatic {

   
    public static void main(String[] args) {
        //membuat objek gelombang
        MethodStatic gelombang = new MethodStatic ();
        //memnaggil method 
        gelombang.frekuensi(6, 2);
        gelombang.kecepatan(21, 3);
    }
    //method static frekuensi
    int frekuensi(int n,int t){
        System.out.println("***FREKUENSI***");
        int hasil = n/t;
        System.out.println("jika di ketahui n="+n+" dan t="+t);
       System.out.println("Maka frekuensinya adalah "+hasil);
       return hasil;
    }
    //method static kecepatan gelombang
    int kecepatan(int gelombang,int frekuensi ){
       System.out.println("***KECEPATAN GELOMBANG***");
       int  hasil = gelombang*frekuensi;
       System.out.println("jika di ketahui a="+gelombang+" dan f="+frekuensi);
       System.out.println("Maka cepat rambatnya adalah "+hasil);
       return hasil;
    }
}
