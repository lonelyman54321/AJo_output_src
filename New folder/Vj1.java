/*
 * Decompiled with CFR 0.152.
 */
public final class Vj1
extends Enum {
    private static final /* synthetic */ Vj1[] $VALUES;
    public static final /* enum */ Vj1 Height;
    public static final /* enum */ Vj1 Width;

    private static final /* synthetic */ Vj1[] $values() {
        Vj1 vj1 = Width;
        vj1 = Height;
        Vj1[] vj1Array = new Vj1[]{vj1, vj1};
        return vj1Array;
    }

    static {
        Vj1 vj1;
        Width = vj1 = new Vj1("Width", 0);
        Height = vj1 = new Vj1("Height", 1);
        $VALUES = Vj1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Vj1() {
        void var2_-1;
        void var1_-1;
    }

    public static Vj1 valueOf(String string2) {
        return Enum.valueOf(Vj1.class, string2);
    }

    public static Vj1[] values() {
        return (Vj1[])$VALUES.clone();
    }
}

