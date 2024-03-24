interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code | compile | run : Laptop");
    }
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code | compile | run : Desktop");
    }
}

class Developer{
    public void dev(Computer comp){
        comp.code();
    }
}

public class Need {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desktop = new Desktop();
        Developer probal = new Developer();
        probal.dev(lap);    // code | compile | run : Laptop
        probal.dev(desktop);    // code | compile | run : Desktop
    }
}
