/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

public final class b$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Ef0 ef0;
        int n7 = Ef0.values().length;
        int[] nArray = new int[n7];
        try {
            ef0 = Ef0.Redirected;
            n4 = ef0.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ef0 = Ef0.Cancelled;
            n4 = ef0.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ef0 = Ef0.RedirectCancelled;
            n4 = ef0.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ef0 = Ef0.None;
            n4 = ef0.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

