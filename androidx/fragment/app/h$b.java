/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.lifecycle.i$b;

public final class h$b {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        i$b i$b;
        int n7 = i$b.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            i$b = i$b.RESUMED;
            n4 = i$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            i$b = i$b.STARTED;
            n4 = i$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            i$b = i$b.CREATED;
            n4 = i$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            i$b = i$b.INITIALIZED;
            n4 = i$b.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

