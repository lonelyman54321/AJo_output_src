/*
 * Decompiled with CFR 0.152.
 */
public final class Ij3
extends Enum {
    private static final /* synthetic */ Ij3[] $VALUES;
    public static final /* enum */ Ij3 Copy;
    public static final /* enum */ Ij3 Cut;
    public static final /* enum */ Ij3 Paste;
    public static final /* enum */ Ij3 SelectAll;
    private final int stringId;

    private static final /* synthetic */ Ij3[] $values() {
        Ij3 ij3 = Cut;
        ij3 = Copy;
        ij3 = Paste;
        ij3 = SelectAll;
        Ij3[] ij3Array = new Ij3[]{ij3, ij3, ij3, ij3};
        return ij3Array;
    }

    static {
        Ij3 ij3;
        Cut = ij3 = new Ij3("Cut", 0, 17039363);
        Copy = ij3 = new Ij3("Copy", 1, 0x1040001);
        Paste = ij3 = new Ij3("Paste", 2, 17039371);
        SelectAll = ij3 = new Ij3("SelectAll", 3, 17039373);
        $VALUES = Ij3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ij3() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.stringId = var3_2;
    }

    public static Ij3 valueOf(String string2) {
        return Enum.valueOf(Ij3.class, string2);
    }

    public static Ij3[] values() {
        return (Ij3[])$VALUES.clone();
    }

    public final String resolvedString(b30_0 b30_02, int n3) {
        n3 = this.stringId;
        return nk_0.f(b30_02, n3);
    }
}

