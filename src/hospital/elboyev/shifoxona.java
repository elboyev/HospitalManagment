package hospital.elboyev;

public class shifoxona {

    private final int maksimalbemorlar = 100;
    private final int maksimalshifokorlar = 100;

    private bemor[] bemorlar = new bemor[maksimalbemorlar];
    private shifokor[] shifokors = new shifokor[maksimalshifokorlar];

    private int bsoni = 0;
    private int shsoni = 0;

    public void addbemor(bemor kasal){
        if (bsoni<maksimalbemorlar){
            bemorlar[bsoni] = kasal;
            bsoni++;
        }
        else
            System.out.println("Bo'sh o'rin qolmadi...");
    }

    public void printbemor(){
        for (int i=0; i<bsoni; i++)
            System.out.println(bemorlar[i].getIsm().toUpperCase() +" "+ bemorlar[i].getFamilya().toUpperCase() +" "+ bemorlar[i].getId());
    }

    public void addshifokor(shifokor duxtir){
        if (shsoni<maksimalshifokorlar){
            shifokors[shsoni] = duxtir;
            shsoni++;
        }
        else
            System.out.println("Bo'sh ish o'rin qolmadi...");
    }

    public void printshifokor(){
        for (int i=0; i<shsoni; i++)
            System.out.println(shifokors[i].getIsm().toUpperCase() +" "+ shifokors[i].getFamilya().toUpperCase() +" "+ shifokors[i].getId());
    }


}
