/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzbr;
import com.google.android.gms.internal.consent_sdk.zzbw;
import com.google.android.gms.internal.consent_sdk.zzca;
import java.util.Objects;

public final class zzbu
extends WebView {
    private final Handler zza;
    private final zzca zzb;
    private boolean zzc = false;

    public zzbu(zzbw zzbw2, Handler handler, zzca zzca2) {
        super((Context)zzbw2);
        this.zza = handler;
        this.zzb = zzca2;
    }

    public static /* bridge */ /* synthetic */ zzca zza(zzbu zzbu2) {
        return zzbu2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzbu zzbu2, boolean bl2) {
        zzbu2.zzc = true;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbu zzbu2) {
        return zzbu2.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbu object, String string2) {
        boolean bl2;
        return string2 != null && (bl2 = string2.startsWith((String)(object = "consent://")));
    }

    public final void zzc() {
        zzca zzca2 = this.zzb;
        Objects.requireNonNull(zzca2);
        zzbr zzbr2 = new zzbr(zzca2);
        this.zza.post((Runnable)zzbr2);
    }

    public final void zzd(String string2, String object) {
        string2 = y02.a(string2, "(", (String)object, ");");
        object = new zzbq(this, string2);
        this.zza.post((Runnable)object);
    }
}

