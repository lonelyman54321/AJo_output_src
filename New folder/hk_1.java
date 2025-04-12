/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hK
 */
public final class hk_1
extends Enum
implements Up0 {
    private static final /* synthetic */ hk_1[] $VALUES;
    public static final /* enum */ hk_1 SHARE_CAMERA_EFFECT;
    private final int minVersion;

    private static final /* synthetic */ hk_1[] $values() {
        hk_1 hk_12 = SHARE_CAMERA_EFFECT;
        hk_1[] hk_1Array = new hk_1[]{hk_12};
        return hk_1Array;
    }

    static {
        hk_1 hk_12;
        SHARE_CAMERA_EFFECT = hk_12 = new hk_1("SHARE_CAMERA_EFFECT", 0, 20170417);
        $VALUES = hk_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hk_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.minVersion = var3_2;
    }

    public static hk_1 valueOf(String string2) {
        return Enum.valueOf(hk_1.class, string2);
    }

    public static hk_1[] values() {
        return (hk_1[])$VALUES.clone();
    }

    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

