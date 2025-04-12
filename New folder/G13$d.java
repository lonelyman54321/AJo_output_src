/*
 * Decompiled with CFR 0.152.
 */
public final class G13$d
extends Enum {
    private static final /* synthetic */ G13$d[] $VALUES;
    public static final /* enum */ G13$d AUTOMATIC;
    public static final /* enum */ G13$d FEED;
    public static final /* enum */ G13$d NATIVE;
    public static final /* enum */ G13$d WEB;

    private static final /* synthetic */ G13$d[] $values() {
        G13$d g13$d = AUTOMATIC;
        g13$d = NATIVE;
        g13$d = WEB;
        g13$d = FEED;
        G13$d[] g13$dArray = new G13$d[]{g13$d, g13$d, g13$d, g13$d};
        return g13$dArray;
    }

    static {
        G13$d g13$d;
        AUTOMATIC = g13$d = new G13$d("AUTOMATIC", 0);
        NATIVE = g13$d = new G13$d("NATIVE", 1);
        WEB = g13$d = new G13$d("WEB", 2);
        FEED = g13$d = new G13$d("FEED", 3);
        $VALUES = G13$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private G13$d() {
        void var2_-1;
        void var1_-1;
    }

    public static G13$d valueOf(String string2) {
        return Enum.valueOf(G13$d.class, string2);
    }

    public static G13$d[] values() {
        return (G13$d[])$VALUES.clone();
    }
}

