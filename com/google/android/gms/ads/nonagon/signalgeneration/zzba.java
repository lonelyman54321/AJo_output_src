/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import java.util.concurrent.Callable;

public final class zzba
implements Callable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzba(TaggingLibraryJsInterface taggingLibraryJsInterface, String string2) {
        this.zza = taggingLibraryJsInterface;
        this.zzb = string2;
    }

    public final Object call() {
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.zza;
        String string2 = this.zzb;
        return taggingLibraryJsInterface.getClickSignals(string2);
    }
}

