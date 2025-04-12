/*
 * Decompiled with CFR 0.152.
 */
public final class By2$b
extends Enum {
    private static final /* synthetic */ By2$b[] $VALUES;
    public static final /* enum */ By2$b meet;
    public static final /* enum */ By2$b slice;

    static {
        By2$b by2$b;
        By2$b by2$b2;
        meet = by2$b2 = new By2$b("meet", 0);
        int n3 = 1;
        slice = by2$b = new By2$b("slice", n3);
        By2$b[] by2$bArray = new By2$b[2];
        by2$bArray[0] = by2$b2;
        by2$bArray[n3] = by2$b;
        $VALUES = by2$bArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private By2$b() {
        void var2_-1;
        void var1_-1;
    }

    public static By2$b valueOf(String string2) {
        return Enum.valueOf(By2$b.class, string2);
    }

    public static By2$b[] values() {
        return (By2$b[])$VALUES.clone();
    }
}

