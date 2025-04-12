/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;

public final class qd$e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        i$a i$a;
        int n7 = i$a.values().length;
        int[] nArray = new int[n7];
        try {
            i$a = i$a.ON_RESUME;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            i$a = i$a.ON_PAUSE;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            i$a = i$a.ON_CREATE;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            i$a = i$a.ON_START;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            i$a = i$a.ON_STOP;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            i$a = i$a.ON_DESTROY;
            n4 = i$a.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

