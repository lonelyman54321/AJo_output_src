/*
 * Decompiled with CFR 0.152.
 */
public final class Vl
extends Enum {
    private static final /* synthetic */ Vl[] $VALUES;
    public static final /* enum */ Vl Clickable;
    public static final /* enum */ Vl Link;
    public static final /* enum */ Vl Paragraph;
    public static final /* enum */ Vl Span;
    public static final /* enum */ Vl String;
    public static final /* enum */ Vl Url;
    public static final /* enum */ Vl VerbatimTts;

    private static final /* synthetic */ Vl[] $values() {
        Vl vl = Paragraph;
        vl = Span;
        vl = VerbatimTts;
        vl = Url;
        vl = Link;
        vl = Clickable;
        vl = String;
        Vl[] vlArray = new Vl[]{vl, vl, vl, vl, vl, vl, vl};
        return vlArray;
    }

    static {
        Vl vl;
        Paragraph = vl = new Vl("Paragraph", 0);
        Span = vl = new Vl("Span", 1);
        VerbatimTts = vl = new Vl("VerbatimTts", 2);
        Url = vl = new Vl("Url", 3);
        Link = vl = new Vl("Link", 4);
        Clickable = vl = new Vl("Clickable", 5);
        String = vl = new Vl("String", 6);
        $VALUES = Vl.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Vl() {
        void var2_-1;
        void var1_-1;
    }

    public static Vl valueOf(String string2) {
        return Enum.valueOf(Vl.class, string2);
    }

    public static Vl[] values() {
        return (Vl[])$VALUES.clone();
    }
}

