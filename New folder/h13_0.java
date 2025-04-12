/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from H13
 */
public final class h13_0
extends Enum
implements Up0 {
    private static final /* synthetic */ h13_0[] $VALUES;
    public static final /* enum */ h13_0 HASHTAG;
    public static final /* enum */ h13_0 LINK_SHARE_QUOTES;
    public static final /* enum */ h13_0 MULTIMEDIA;
    public static final /* enum */ h13_0 PHOTOS;
    public static final /* enum */ h13_0 SHARE_DIALOG;
    public static final /* enum */ h13_0 VIDEO;
    private final int minVersion;

    private static final /* synthetic */ h13_0[] $values() {
        h13_0 h13_02 = SHARE_DIALOG;
        h13_02 = PHOTOS;
        h13_02 = VIDEO;
        h13_02 = MULTIMEDIA;
        h13_02 = HASHTAG;
        h13_02 = LINK_SHARE_QUOTES;
        h13_0[] h13_0Array = new h13_0[]{h13_02, h13_02, h13_02, h13_02, h13_02, h13_02};
        return h13_0Array;
    }

    static {
        h13_0 h13_02;
        SHARE_DIALOG = h13_02 = new h13_0("SHARE_DIALOG", 0, 20130618);
        PHOTOS = h13_02 = new h13_0("PHOTOS", 1, 20140204);
        VIDEO = h13_02 = new h13_0("VIDEO", 2, 20141028);
        int n3 = 20160327;
        MULTIMEDIA = h13_02 = new h13_0("MULTIMEDIA", 3, n3);
        HASHTAG = h13_02 = new h13_0("HASHTAG", 4, n3);
        LINK_SHARE_QUOTES = h13_02 = new h13_0("LINK_SHARE_QUOTES", 5, n3);
        $VALUES = h13_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h13_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.minVersion = var3_2;
    }

    public static h13_0 valueOf(String string2) {
        return Enum.valueOf(h13_0.class, string2);
    }

    public static h13_0[] values() {
        return (h13_0[])$VALUES.clone();
    }

    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

