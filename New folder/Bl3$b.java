/*
 * Decompiled with CFR 0.152.
 */
public final class Bl3$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Bl3$a bl3$a;
        int n7 = Bl3$a.values().length;
        int[] nArray = new int[n7];
        try {
            bl3$a = Bl3$a.StartInput;
            n4 = bl3$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bl3$a = Bl3$a.StopInput;
            n4 = bl3$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bl3$a = Bl3$a.ShowKeyboard;
            n4 = bl3$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bl3$a = Bl3$a.HideKeyboard;
            n4 = bl3$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

