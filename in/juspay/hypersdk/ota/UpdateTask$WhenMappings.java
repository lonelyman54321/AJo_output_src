/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Stage;

public final class UpdateTask$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        UpdateTask$Stage updateTask$Stage;
        int n7 = UpdateTask$Stage.values().length;
        int[] nArray = new int[n7];
        try {
            updateTask$Stage = UpdateTask$Stage.INITIALIZING;
            n4 = updateTask$Stage.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            updateTask$Stage = UpdateTask$Stage.FETCHING_RC;
            n4 = updateTask$Stage.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            updateTask$Stage = UpdateTask$Stage.DOWNLOADING_UPDATES;
            n4 = updateTask$Stage.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            updateTask$Stage = UpdateTask$Stage.INSTALLING;
            n4 = updateTask$Stage.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            updateTask$Stage = UpdateTask$Stage.FINISHED;
            n4 = updateTask$Stage.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

