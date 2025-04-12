/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from sO1
 */
public final class so1_0
extends Enum
implements Up0 {
    private static final /* synthetic */ so1_0[] $VALUES;
    public static final /* enum */ so1_0 MESSAGE_DIALOG;
    public static final /* enum */ so1_0 MESSENGER_GENERIC_TEMPLATE;
    public static final /* enum */ so1_0 MESSENGER_MEDIA_TEMPLATE;
    public static final /* enum */ so1_0 MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
    public static final /* enum */ so1_0 PHOTOS;
    public static final /* enum */ so1_0 VIDEO;
    private int minVersion;

    static {
        so1_0 so1_02;
        so1_0 so1_03;
        so1_0 so1_04;
        so1_0 so1_05;
        so1_0 so1_06;
        so1_0 so1_07;
        MESSAGE_DIALOG = so1_07 = new so1_0("MESSAGE_DIALOG", 0, 20140204);
        int n3 = 1;
        PHOTOS = so1_06 = new so1_0("PHOTOS", n3, 20140324);
        int n4 = 2;
        VIDEO = so1_05 = new so1_0("VIDEO", n4, 20141218);
        int n7 = 3;
        int n8 = 20171115;
        MESSENGER_GENERIC_TEMPLATE = so1_04 = new so1_0("MESSENGER_GENERIC_TEMPLATE", n7, n8);
        int n10 = 4;
        MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE = so1_03 = new so1_0("MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE", n10, n8);
        int n14 = 5;
        MESSENGER_MEDIA_TEMPLATE = so1_02 = new so1_0("MESSENGER_MEDIA_TEMPLATE", n14, n8);
        so1_0[] so1_0Array = new so1_0[6];
        so1_0Array[0] = so1_07;
        so1_0Array[n3] = so1_06;
        so1_0Array[n4] = so1_05;
        so1_0Array[n7] = so1_04;
        so1_0Array[n10] = so1_03;
        so1_0Array[n14] = so1_02;
        $VALUES = so1_0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private so1_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.minVersion = var3_2;
    }

    public static so1_0 valueOf(String string2) {
        return Enum.valueOf(so1_0.class, string2);
    }

    public static so1_0[] values() {
        return (so1_0[])$VALUES.clone();
    }

    public String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}

