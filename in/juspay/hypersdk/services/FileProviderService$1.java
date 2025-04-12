/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.services;

import in.juspay.hypersdk.services.FileProviderService$Mode;

class FileProviderService$1 {
    static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FileProviderService$Mode fileProviderService$Mode;
        int n7 = FileProviderService$Mode.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode = nArray;
        try {
            fileProviderService$Mode = FileProviderService$Mode.NEW;
            n4 = fileProviderService$Mode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode;
            fileProviderService$Mode = FileProviderService$Mode.RE_OPEN;
            n4 = fileProviderService$Mode.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

