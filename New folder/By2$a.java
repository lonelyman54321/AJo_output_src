/*
 * Decompiled with CFR 0.152.
 */
public final class By2$a
extends Enum {
    private static final /* synthetic */ By2$a[] $VALUES;
    public static final /* enum */ By2$a none;
    public static final /* enum */ By2$a xMaxYMax;
    public static final /* enum */ By2$a xMaxYMid;
    public static final /* enum */ By2$a xMaxYMin;
    public static final /* enum */ By2$a xMidYMax;
    public static final /* enum */ By2$a xMidYMid;
    public static final /* enum */ By2$a xMidYMin;
    public static final /* enum */ By2$a xMinYMax;
    public static final /* enum */ By2$a xMinYMid;
    public static final /* enum */ By2$a xMinYMin;

    static {
        By2$a by2$a;
        By2$a by2$a2;
        By2$a by2$a3;
        By2$a by2$a4;
        By2$a by2$a5;
        By2$a by2$a6;
        By2$a by2$a7;
        By2$a by2$a8;
        By2$a by2$a9;
        By2$a by2$a10;
        none = by2$a10 = new By2$a("none", 0);
        int n3 = 1;
        xMinYMin = by2$a9 = new By2$a("xMinYMin", n3);
        int n4 = 2;
        xMidYMin = by2$a8 = new By2$a("xMidYMin", n4);
        int n7 = 3;
        xMaxYMin = by2$a7 = new By2$a("xMaxYMin", n7);
        xMinYMid = by2$a6 = new By2$a("xMinYMid", 4);
        xMidYMid = by2$a5 = new By2$a("xMidYMid", 5);
        xMaxYMid = by2$a4 = new By2$a("xMaxYMid", 6);
        xMinYMax = by2$a3 = new By2$a("xMinYMax", 7);
        xMidYMax = by2$a2 = new By2$a("xMidYMax", 8);
        int n8 = 9;
        xMaxYMax = by2$a = new By2$a("xMaxYMax", n8);
        By2$a[] by2$aArray = new By2$a[10];
        by2$aArray[0] = by2$a10;
        by2$aArray[n3] = by2$a9;
        by2$aArray[n4] = by2$a8;
        by2$aArray[n7] = by2$a7;
        by2$aArray[4] = by2$a6;
        by2$aArray[5] = by2$a5;
        by2$aArray[6] = by2$a4;
        by2$aArray[7] = by2$a3;
        by2$aArray[8] = by2$a2;
        by2$aArray[n8] = by2$a;
        $VALUES = by2$aArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private By2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static By2$a valueOf(String string2) {
        return Enum.valueOf(By2$a.class, string2);
    }

    public static By2$a[] values() {
        return (By2$a[])$VALUES.clone();
    }
}

