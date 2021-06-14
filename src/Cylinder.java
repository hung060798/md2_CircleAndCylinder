public class Cylinder extends Circle{
    private double chieuCao;

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich(){
        return super.Area()*this.chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", theTich= " + this.theTich() +
                '}';
    }
}
