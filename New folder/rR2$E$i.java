/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$i
extends Enum {
    private static final /* synthetic */ rR2$E$i[] $VALUES;
    public static final /* enum */ rR2$E$i NonScalingStroke;
    public static final /* enum */ rR2$E$i None;

    static {
        rR2$E$i rR2$E$i;
        rR2$E$i rR2$E$i2;
        None = rR2$E$i2 = new rR2$E$i("None", 0);
        int n3 = 1;
        NonScalingStroke = rR2$E$i = new rR2$E$i("NonScalingStroke", n3);
        rR2$E$i[] rR2$E$iArray = new rR2$E$i[2];
        rR2$E$iArray[0] = rR2$E$i2;
        rR2$E$iArray[n3] = rR2$E$i;
        $VALUES = rR2$E$iArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$i() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$i valueOf(String string2) {
        return Enum.valueOf(rR2$E$i.class, string2);
    }

    public static rR2$E$i[] values() {
        return (rR2$E$i[])$VALUES.clone();
    }
}

