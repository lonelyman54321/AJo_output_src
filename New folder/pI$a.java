/*
 * Decompiled with CFR 0.152.
 */
public final class pI$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        qi_1 qi_12;
        int n7 = qi_1.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            qi_12 = qi_1.SimpleMessage;
            n4 = qi_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            qi_12 = qi_1.IconMessage;
            n4 = qi_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            qi_12 = qi_1.CarouselMessage;
            n4 = qi_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            qi_12 = qi_1.CarouselImageMessage;
            n4 = qi_12.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

