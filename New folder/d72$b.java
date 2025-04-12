/*
 * Decompiled with CFR 0.152.
 */
public final class d72$b
extends Enum {
    private static final /* synthetic */ d72$b[] $VALUES;
    public static final /* enum */ d72$b BITMAP;
    public static final /* enum */ d72$b DIRECT;
    public static final /* enum */ d72$b RENDER_NODE;
    public static final /* enum */ d72$b SAVE_LAYER;

    private static /* synthetic */ d72$b[] $values() {
        d72$b d72$b = DIRECT;
        d72$b = SAVE_LAYER;
        d72$b = BITMAP;
        d72$b = RENDER_NODE;
        d72$b[] d72$bArray = new d72$b[]{d72$b, d72$b, d72$b, d72$b};
        return d72$bArray;
    }

    static {
        d72$b d72$b;
        DIRECT = d72$b = new d72$b("DIRECT", 0);
        SAVE_LAYER = d72$b = new d72$b("SAVE_LAYER", 1);
        BITMAP = d72$b = new d72$b("BITMAP", 2);
        RENDER_NODE = d72$b = new d72$b("RENDER_NODE", 3);
        $VALUES = d72$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d72$b() {
        void var2_-1;
        void var1_-1;
    }

    public static d72$b valueOf(String string2) {
        return Enum.valueOf(d72$b.class, string2);
    }

    public static d72$b[] values() {
        return (d72$b[])$VALUES.clone();
    }
}

