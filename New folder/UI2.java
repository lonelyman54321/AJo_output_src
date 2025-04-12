/*
 * Decompiled with CFR 0.152.
 */
public final class UI2
extends Enum {
    private static final /* synthetic */ UI2[] $VALUES;
    public static final /* enum */ UI2 AUTOMATIC;
    public static final /* enum */ UI2 HARDWARE;
    public static final /* enum */ UI2 SOFTWARE;

    private static /* synthetic */ UI2[] $values() {
        UI2 uI2 = AUTOMATIC;
        uI2 = HARDWARE;
        uI2 = SOFTWARE;
        UI2[] uI2Array = new UI2[]{uI2, uI2, uI2};
        return uI2Array;
    }

    static {
        UI2 uI2;
        AUTOMATIC = uI2 = new UI2("AUTOMATIC", 0);
        HARDWARE = uI2 = new UI2("HARDWARE", 1);
        SOFTWARE = uI2 = new UI2("SOFTWARE", 2);
        $VALUES = UI2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UI2() {
        void var2_-1;
        void var1_-1;
    }

    public static UI2 valueOf(String string2) {
        return Enum.valueOf(UI2.class, string2);
    }

    public static UI2[] values() {
        return (UI2[])$VALUES.clone();
    }

    public boolean useSoftwareRendering(int n3, boolean n4, int n7) {
        boolean bl2 = this.ordinal();
        boolean bl3 = false;
        boolean bl4 = true;
        if (bl2 != bl4) {
            boolean bl5 = 2 != 0;
            if (bl2 != bl5) {
                if (n4 != 0 && n3 < (n4 = 28)) {
                    return bl4;
                }
                n4 = 4;
                if (n7 > n4) {
                    return bl4;
                }
                n4 = 25;
                if (n3 <= n4) {
                    bl3 = true;
                }
                return bl3;
            }
            return bl4;
        }
        return false;
    }
}

