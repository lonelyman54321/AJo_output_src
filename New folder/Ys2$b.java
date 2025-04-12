/*
 * Decompiled with CFR 0.152.
 */
public final class Ys2$b
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Ys2$b[] $VALUES;
    public static final /* enum */ Ys2$b Browser;
    public static final /* enum */ Ys2$b Node;

    private static final /* synthetic */ Ys2$b[] $values() {
        Ys2$b ys2$b = Browser;
        ys2$b = Node;
        Ys2$b[] ys2$bArray = new Ys2$b[]{ys2$b, ys2$b};
        return ys2$bArray;
    }

    static {
        Enum[] enumArray = new Ys2$b("Browser", 0);
        Browser = enumArray;
        enumArray = new Ys2$b("Node", 1);
        Node = enumArray;
        enumArray = Ys2$b.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ys2$b() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Ys2$b valueOf(String string2) {
        return Enum.valueOf(Ys2$b.class, string2);
    }

    public static Ys2$b[] values() {
        return (Ys2$b[])$VALUES.clone();
    }
}

