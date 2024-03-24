// subclasses extending a sealed class either need to be sealed, non-sealed, or final
// final classes cannot be further extended
// child interfaces extending a sealed interface either need to be sealed or non-sealed. Interfaces cannot be final

sealed class A permits B,C{

}

non-sealed class B extends A{

}

final class C extends A{

}

class D extends B{

}

sealed interface X permits Y{

}

non-sealed interface Y extends X{

}

public class Main {
    public static void main(String[] args) {
        
    }
}
