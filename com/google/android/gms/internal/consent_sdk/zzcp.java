/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcq;
import java.util.concurrent.ThreadFactory;

public final class zzcp
implements ThreadFactory {
    public final /* synthetic */ zzcq zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcp(zzcq zzcq2, String string2) {
        this.zza = zzcq2;
        this.zzb = "Google consent worker";
    }

    public final Thread newThread(Runnable runnable2) {
        zzcq zzcq2 = this.zza;
        String string2 = this.zzb;
        return zzcq2.zza(string2, runnable2);
    }
}

