/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Rn
 */
public final class rn_0
extends Enum {
    private static final /* synthetic */ rn_0[] $VALUES;
    public static final /* enum */ rn_0 CUSTOM;
    public static final Rn$a Companion;
    public static final /* enum */ rn_0 MOBILE_APP_INSTALL;
    public static final /* enum */ rn_0 OTHER;

    private static final /* synthetic */ rn_0[] $values() {
        rn_0 rn_02 = MOBILE_APP_INSTALL;
        rn_02 = CUSTOM;
        rn_02 = OTHER;
        rn_0[] rn_0Array = new rn_0[]{rn_02, rn_02, rn_02};
        return rn_0Array;
    }

    static {
        Object object;
        MOBILE_APP_INSTALL = object = new rn_0("MOBILE_APP_INSTALL", 0);
        CUSTOM = object = new rn_0("CUSTOM", 1);
        OTHER = object = new rn_0("OTHER", 2);
        $VALUES = rn_0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rn_0() {
        void var2_-1;
        void var1_-1;
    }

    public static rn_0 valueOf(String string2) {
        return Enum.valueOf(rn_0.class, string2);
    }

    public static rn_0[] values() {
        return (rn_0[])$VALUES.clone();
    }
}

