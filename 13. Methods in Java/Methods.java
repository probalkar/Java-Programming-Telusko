class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getMeAPen(int cost){
        if(cost>=10){
            return "Pen";
        }

        return "Nothing";
    }
}

public class Methods {
    public static void main(String[] args) {
        int cost = 10;

        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(cost);
        System.out.println(str);
    }
}
