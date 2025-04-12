/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbm;

public final class zzbbj
implements ValueCallback {
    public final /* synthetic */ zzbbk zza;
    public final /* synthetic */ zzbbc zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzbbj(zzbbk zzbbk2, zzbbc zzbbc2, WebView webView, boolean bl2) {
        this.zza = zzbbk2;
        this.zzb = zzbbc2;
        this.zzc = webView;
        this.zzd = bl2;
    }

    public final void onReceiveValue(Object object) {
        zzbbm zzbbm2 = this.zza.zze;
        zzbbc zzbbc2 = this.zzb;
        WebView webView = this.zzc;
        object = (String)object;
        boolean bl2 = this.zzd;
        zzbbm2.zzd(zzbbc2, webView, (String)object, bl2);
    }
}

