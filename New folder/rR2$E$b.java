/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$b
extends Enum {
    private static final /* synthetic */ rR2$E$b[] $VALUES;
    public static final /* enum */ rR2$E$b Italic;
    public static final /* enum */ rR2$E$b Normal;
    public static final /* enum */ rR2$E$b Oblique;

    static {
        rR2$E$b rR2$E$b;
        rR2$E$b rR2$E$b2;
        rR2$E$b rR2$E$b3;
        Normal = rR2$E$b3 = new rR2$E$b("Normal", 0);
        int n3 = 1;
        Italic = rR2$E$b2 = new rR2$E$b("Italic", n3);
        int n4 = 2;
        Oblique = rR2$E$b = new rR2$E$b("Oblique", n4);
        rR2$E$b[] rR2$E$bArray = new rR2$E$b[3];
        rR2$E$bArray[0] = rR2$E$b3;
        rR2$E$bArray[n3] = rR2$E$b2;
        rR2$E$bArray[n4] = rR2$E$b;
        $VALUES = rR2$E$bArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$b() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$b valueOf(String string2) {
        return Enum.valueOf(rR2$E$b.class, string2);
    }

    public static rR2$E$b[] values() {
        return (rR2$E$b[])$VALUES.clone();
    }
}

