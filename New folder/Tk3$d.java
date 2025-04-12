/*
 * Decompiled with CFR 0.152.
 */
public final class Tk3$d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        v21_0 v21_02;
        int n7 = v21_0.values().length;
        int[] nArray = new int[n7];
        try {
            v21_02 = v21_0.Cursor;
            n4 = v21_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v21_02 = v21_0.SelectionStart;
            n4 = v21_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            v21_02 = v21_0.SelectionEnd;
            n4 = v21_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

