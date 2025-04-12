/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbm;

final class zzbbk
implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbbc zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbm zze;

    public zzbbk(zzbbm object, zzbbc zzbbc2, WebView webView, boolean bl2) {
        this.zzb = zzbbc2;
        this.zzc = webView;
        this.zzd = bl2;
        this.zze = object;
        object = new zzbbj(this, zzbbc2, webView, bl2);
        this.zza = object;
    }

    public final void run() {
        WebSettings webSettings = this.zzc.getSettings();
        boolean bl2 = webSettings.getJavaScriptEnabled();
        if (bl2) {
            webSettings = this.zzc;
            String string2 = "(function() { return  {text:document.body.innerText}})();";
            ValueCallback valueCallback = this.zza;
            try {
                webSettings.evaluateJavascript(string2, valueCallback);
                return;
            }
            catch (Throwable throwable) {
                webSettings = this.zza;
                string2 = "";
                webSettings.onReceiveValue((Object)string2);
            }
        }
    }
}

