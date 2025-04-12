/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vH
 */
public final class vh_2
extends Enum {
    private static final /* synthetic */ vh_2[] $VALUES;
    public static final /* enum */ vh_2 LOGIN;
    public static final /* enum */ vh_2 UPDATE_PROFILE;

    private static final /* synthetic */ vh_2[] $values() {
        vh_2 vh_22 = LOGIN;
        vh_22 = UPDATE_PROFILE;
        vh_2[] vh_2Array = new vh_2[]{vh_22, vh_22};
        return vh_2Array;
    }

    static {
        vh_2 vh_22;
        LOGIN = vh_22 = new vh_2("LOGIN", 0);
        UPDATE_PROFILE = vh_22 = new vh_2("UPDATE_PROFILE", 1);
        $VALUES = vh_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vh_2() {
        void var2_-1;
        void var1_-1;
    }

    public static vh_2 valueOf(String string2) {
        return Enum.valueOf(vh_2.class, string2);
    }

    public static vh_2[] values() {
        return (vh_2[])$VALUES.clone();
    }
}

