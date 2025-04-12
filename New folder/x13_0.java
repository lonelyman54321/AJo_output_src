/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from X13
 */
public final class x13_0
extends Enum
implements Up0 {
    private static final /* synthetic */ x13_0[] $VALUES;
    public static final /* enum */ x13_0 SHARE_STORY_ASSET;
    private final int minVersion;

    private static final /* synthetic */ x13_0[] $values() {
        x13_0 x13_02 = SHARE_STORY_ASSET;
        x13_0[] x13_0Array = new x13_0[]{x13_02};
        return x13_0Array;
    }

    static {
        x13_0 x13_02;
        SHARE_STORY_ASSET = x13_02 = new x13_0("SHARE_STORY_ASSET", 0, 20170417);
        $VALUES = x13_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x13_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.minVersion = var3_2;
    }

    public static x13_0 valueOf(String string2) {
        return Enum.valueOf(x13_0.class, string2);
    }

    public static x13_0[] values() {
        return (x13_0[])$VALUES.clone();
    }

    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

