/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

public final class ServerSideVerificationOptions$Builder {
    private String zza;
    private String zzb;

    public ServerSideVerificationOptions$Builder() {
        String string2;
        this.zza = string2 = "";
        this.zzb = string2;
    }

    public static /* bridge */ /* synthetic */ String zza(ServerSideVerificationOptions$Builder serverSideVerificationOptions$Builder) {
        return serverSideVerificationOptions$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ String zzb(ServerSideVerificationOptions$Builder serverSideVerificationOptions$Builder) {
        return serverSideVerificationOptions$Builder.zza;
    }

    public ServerSideVerificationOptions build() {
        ServerSideVerificationOptions serverSideVerificationOptions = new ServerSideVerificationOptions(this, null);
        return serverSideVerificationOptions;
    }

    public ServerSideVerificationOptions$Builder setCustomData(String string2) {
        this.zzb = string2;
        return this;
    }

    public ServerSideVerificationOptions$Builder setUserId(String string2) {
        this.zza = string2;
        return this;
    }
}

