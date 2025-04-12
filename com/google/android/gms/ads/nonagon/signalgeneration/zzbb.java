/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

public final class zzbb
implements Runnable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ QueryInfoGenerationCallback zzc;

    public /* synthetic */ zzbb(TaggingLibraryJsInterface taggingLibraryJsInterface, Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = taggingLibraryJsInterface;
        this.zzb = bundle;
        this.zzc = queryInfoGenerationCallback;
    }

    public final void run() {
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.zza;
        Bundle bundle = this.zzb;
        QueryInfoGenerationCallback queryInfoGenerationCallback = this.zzc;
        taggingLibraryJsInterface.zzc(bundle, queryInfoGenerationCallback);
    }
}

