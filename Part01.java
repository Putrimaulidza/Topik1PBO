 class Barang {
    String idProduk;
    String nama;
    double harga;

    public Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void print(){
        System.out.println(getIdProduk()+" | "+getNama()+" | "+getHarga());
    }
}
 class Part01 {

    public static void main(String[] args) {
        Barang produk1 = new Barang("BRG-001", "Tas Gucci");
        produk1.setHarga(1200);
        Barang produk2 = new Barang("BRG-002", "Printer Epson L355");
        produk2.setHarga(200);
        produk1.print();
        Barang produk3 = new Barang("BRG-003", "Koper", 150);
        Barang produk4 = new Barang("BRG-004", "Helm", 20);
        produk3.print();
        produk4.print();
        System.out.println(produk1.getHarga() + produk3.getHarga() + produk4.getHarga());
    }
}