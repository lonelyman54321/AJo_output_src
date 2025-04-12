/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from av
 */
public final class av_2
extends Enum {
    private static final /* synthetic */ av_2[] $VALUES;
    public static final /* enum */ av_2 FADE;
    public static final /* enum */ av_2 NONE;

    private static final /* synthetic */ av_2[] $values() {
        av_2 av_22 = NONE;
        av_22 = FADE;
        av_2[] av_2Array = new av_2[]{av_22, av_22};
        return av_2Array;
    }

    static {
        av_2 av_22;
        NONE = av_22 = new av_2("NONE", 0);
        FADE = av_22 = new av_2("FADE", 1);
        $VALUES = av_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private av_2() {
        void var2_-1;
        void var1_-1;
    }

    public static av_2 valueOf(String string2) {
        return Enum.valueOf(av_2.class, string2);
    }

    public static av_2[] values() {
        return (av_2[])$VALUES.clone();
    }
}

