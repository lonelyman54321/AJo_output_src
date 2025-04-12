/*
 * Decompiled with CFR 0.152.
 */
public final class kO1$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        jO1$a jO1$a;
        int n7 = jO1$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            jO1$a = jO1$a.MERGE;
            n4 = jO1$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            jO1$a = jO1$a.ADD;
            n4 = jO1$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            jO1$a = jO1$a.SUBTRACT;
            n4 = jO1$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            jO1$a = jO1$a.INTERSECT;
            n4 = jO1$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            jO1$a = jO1$a.EXCLUDE_INTERSECTIONS;
            n4 = jO1$a.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

