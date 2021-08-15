package model;

public class Food {
    private String ten;
    private String img;
    private int gia;
    private String mota;
    private int loai;

    public Food() {
    }

    public Food(String ten, String img, int gia, String mota, int loai) {
        this.ten = ten;
        this.img = img;
        this.gia = gia;
        this.mota = mota;
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
}
