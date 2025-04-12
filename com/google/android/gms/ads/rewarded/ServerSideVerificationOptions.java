/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions$Builder;
import com.google.android.gms.ads.rewarded.zzd;

public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    public /* synthetic */ ServerSideVerificationOptions(ServerSideVerificationOptions$Builder object, zzd object2) {
        this.zza = object2 = ServerSideVerificationOptions$Builder.zzb((ServerSideVerificationOptions$Builder)object);
        this.zzb = object = ServerSideVerificationOptions$Builder.zza((ServerSideVerificationOptions$Builder)object);
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}

