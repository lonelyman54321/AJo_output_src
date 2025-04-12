/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$g
extends Enum {
    private static final /* synthetic */ rR2$E$g[] $VALUES;
    public static final /* enum */ rR2$E$g Blink;
    public static final /* enum */ rR2$E$g LineThrough;
    public static final /* enum */ rR2$E$g None;
    public static final /* enum */ rR2$E$g Overline;
    public static final /* enum */ rR2$E$g Underline;

    static {
        rR2$E$g rR2$E$g;
        rR2$E$g rR2$E$g2;
        rR2$E$g rR2$E$g3;
        rR2$E$g rR2$E$g4;
        rR2$E$g rR2$E$g5;
        None = rR2$E$g5 = new rR2$E$g("None", 0);
        int n3 = 1;
        Underline = rR2$E$g4 = new rR2$E$g("Underline", n3);
        int n4 = 2;
        Overline = rR2$E$g3 = new rR2$E$g("Overline", n4);
        int n7 = 3;
        LineThrough = rR2$E$g2 = new rR2$E$g("LineThrough", n7);
        int n8 = 4;
        Blink = rR2$E$g = new rR2$E$g("Blink", n8);
        rR2$E$g[] rR2$E$gArray = new rR2$E$g[5];
        rR2$E$gArray[0] = rR2$E$g5;
        rR2$E$gArray[n3] = rR2$E$g4;
        rR2$E$gArray[n4] = rR2$E$g3;
        rR2$E$gArray[n7] = rR2$E$g2;
        rR2$E$gArray[n8] = rR2$E$g;
        $VALUES = rR2$E$gArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$g() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$g valueOf(String string2) {
        return Enum.valueOf(rR2$E$g.class, string2);
    }

    public static rR2$E$g[] values() {
        return (rR2$E$g[])$VALUES.clone();
    }
}

