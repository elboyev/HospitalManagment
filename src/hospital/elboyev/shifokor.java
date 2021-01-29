package hospital.elboyev;

public class shifokor {

    private String ism;
    private String familya;
    private int id;

    public shifokor() {

    }

    public shifokor(String ism, String familya , int id){
        this.ism=ism;
        this.familya=familya;
        this.id=id;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getIsm() {
        return ism;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
    }

    public String getFamilya() {
        return familya;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public shifokor(shifokor duxtir){
        this(duxtir.getIsm(), duxtir.getFamilya(), duxtir.getId());
    }
}
