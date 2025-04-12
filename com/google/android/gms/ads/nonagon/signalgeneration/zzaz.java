/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;

public final class zzaz
implements Runnable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzaz(TaggingLibraryJsInterface taggingLibraryJsInterface, String string2) {
        this.zza = taggingLibraryJsInterface;
        this.zzb = string2;
    }

    public final void run() {
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.zza;
        String string2 = this.zzb;
        taggingLibraryJsInterface.zzd(string2);
    }
}

