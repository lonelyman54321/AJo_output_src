/*
 * Decompiled with CFR 0.152.
 */
package androidx.loader.content;

import androidx.loader.content.ModernAsyncTask$f;

public final class ModernAsyncTask$c {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ModernAsyncTask$f modernAsyncTask$f;
        int n7 = ModernAsyncTask$f.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            modernAsyncTask$f = ModernAsyncTask$f.RUNNING;
            n4 = modernAsyncTask$f.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            modernAsyncTask$f = ModernAsyncTask$f.FINISHED;
            n4 = modernAsyncTask$f.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

