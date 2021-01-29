package hospital.elboyev;

public class bemor {
    private String ism;
    private String familya;
    private int id;
    public bemor(){

    }

    public bemor(String ism, String familya, int id){
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

    public bemor(bemor kasal){
        this(kasal.getIsm(),kasal.getFamilya(), kasal.getId());
    }
}
