/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import java.util.concurrent.Callable;

public final class zzay
implements Callable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;

    public /* synthetic */ zzay(TaggingLibraryJsInterface taggingLibraryJsInterface) {
        this.zza = taggingLibraryJsInterface;
    }

    public final Object call() {
        return this.zza.getViewSignals();
    }
}

