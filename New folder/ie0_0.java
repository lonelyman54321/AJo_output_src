/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ie0
 */
public final class ie0_0
extends Enum {
    private static final /* synthetic */ ie0_0[] $VALUES;
    public static final /* enum */ ie0_0 FILES;
    public static final /* enum */ ie0_0 GIF;
    public static final /* enum */ ie0_0 IMAGE;

    private static final /* synthetic */ ie0_0[] $values() {
        ie0_0 ie0_02 = IMAGE;
        ie0_02 = GIF;
        ie0_02 = FILES;
        ie0_0[] ie0_0Array = new ie0_0[]{ie0_02, ie0_02, ie0_02};
        return ie0_0Array;
    }

    static {
        ie0_0 ie0_02;
        IMAGE = ie0_02 = new ie0_0("IMAGE", 0);
        GIF = ie0_02 = new ie0_0("GIF", 1);
        FILES = ie0_02 = new ie0_0("FILES", 2);
        $VALUES = ie0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ie0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ie0_0 valueOf(String string2) {
        return Enum.valueOf(ie0_0.class, string2);
    }

    public static ie0_0[] values() {
        return (ie0_0[])$VALUES.clone();
    }
}

