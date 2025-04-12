/*
 * Decompiled with CFR 0.152.
 */
public final class Yi0
extends Enum {
    private static final /* synthetic */ Yi0[] $VALUES;
    public static final Yi0 DEFAULT;
    public static final /* enum */ Yi0 PREFER_ARGB_8888;
    public static final /* enum */ Yi0 PREFER_RGB_565;

    private static /* synthetic */ Yi0[] $values() {
        Yi0 yi0 = PREFER_ARGB_8888;
        yi0 = PREFER_RGB_565;
        Yi0[] yi0Array = new Yi0[]{yi0, yi0};
        return yi0Array;
    }

    static {
        Yi0 yi0;
        Yi0 yi02;
        PREFER_ARGB_8888 = yi02 = new Yi0("PREFER_ARGB_8888", 0);
        PREFER_RGB_565 = yi0 = new Yi0("PREFER_RGB_565", 1);
        $VALUES = Yi0.$values();
        DEFAULT = yi02;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Yi0() {
        void var2_-1;
        void var1_-1;
    }

    public static Yi0 valueOf(String string2) {
        return Enum.valueOf(Yi0.class, string2);
    }

    public static Yi0[] values() {
        return (Yi0[])$VALUES.clone();
    }
}

