/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.CoroutineScheduler$b;

public final class CoroutineScheduler$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        CoroutineScheduler$b coroutineScheduler$b;
        int n7 = CoroutineScheduler$b.values().length;
        int[] nArray = new int[n7];
        try {
            coroutineScheduler$b = CoroutineScheduler$b.PARKING;
            n4 = coroutineScheduler$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            coroutineScheduler$b = CoroutineScheduler$b.BLOCKING;
            n4 = coroutineScheduler$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            coroutineScheduler$b = CoroutineScheduler$b.CPU_ACQUIRED;
            n4 = coroutineScheduler$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            coroutineScheduler$b = CoroutineScheduler$b.DORMANT;
            n4 = coroutineScheduler$b.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            coroutineScheduler$b = CoroutineScheduler$b.TERMINATED;
            n4 = coroutineScheduler$b.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

