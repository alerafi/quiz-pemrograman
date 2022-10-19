class member{
    String noHP,nama,alamat_lengkap;
    int jual,beli;
    double pajak;

    //method tanpa return dengan parameter
   public member(String nama , String tlp, String alamat){
        this.nama=nama;
        this.noHP=noHP;
        this.alamat_lengkap=alamat_lengkap;
    }
    member(int saldo, int pinjam, Double pajak){
        this.jual=jual;
        this.beli=beli;
        this.pajak=pajak;
    }
    // method dengan return dan tanpa parameter
    double total () {
        //perhitungan
        return (jual+(beli-(beli*pajak)));
    }
    //method tanpa parameter tanpa return
    void tampil (){
        System.out.println("Nama Anggota : "+ this.nama);
        System.out.println("No Telepon : "+ this.noHP);
        System.out.println("Alamat Anggota : "+ this.alamat_lengkap);
        System.out.println();
    }
    void tampil2(){
        System.out.println("harga jual : Rp."+ this.jual);
        System.out.println("harga beli : Rp."+ this.beli);
        System.out.println("Pajak beli : 10%");
        System.out.println();
        System.out.println("Total Saldo : Rp."+ this.total());

    }
}
public class Main {
public static void main(String[] args) {
       member member1 = new member ("1532"," Nuranda Alerafi","Depok");
       member member2 = new member (10000,50000,0.10);
        member1.tampil();
        member2.tampil2();
}
}