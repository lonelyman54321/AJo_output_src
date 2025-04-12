/*
 * Decompiled with CFR 0.152.
 */
public final class FS2$f$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Vl vl;
        int n7 = Vl.values().length;
        int[] nArray = new int[n7];
        try {
            vl = Vl.Paragraph;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.Span;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.VerbatimTts;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.Url;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.Link;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.Clickable;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vl = Vl.String;
            n4 = vl.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

