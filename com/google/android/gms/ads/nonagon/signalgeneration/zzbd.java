/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbe;

public final class zzbd
implements Runnable {
    public final /* synthetic */ zzbe zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbd(zzbe zzbe2, String string2) {
        this.zza = zzbe2;
        this.zzb = string2;
    }

    public final void run() {
        WebView webView = TaggingLibraryJsInterface.zza(this.zza.zzb);
        String string2 = this.zzb;
        webView.evaluateJavascript(string2, null);
    }
}

