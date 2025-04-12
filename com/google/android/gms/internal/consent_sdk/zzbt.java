/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.consent_sdk.zzbs;
import com.google.android.gms.internal.consent_sdk.zzbu;

final class zzbt
extends WebViewClient {
    final /* synthetic */ zzbu zza;

    public /* synthetic */ zzbt(zzbu zzbu2, zzbs zzbs2) {
        this.zza = zzbu2;
    }

    public final void onLoadResource(WebView object, String string2) {
        object = this.zza;
        boolean bl2 = zzbu.zzf((zzbu)((Object)object), string2);
        if (bl2) {
            object = zzbu.zza(this.zza);
            object.zze(string2);
        }
    }

    public final void onPageFinished(WebView webView, String string2) {
        webView = this.zza;
        boolean bl2 = zzbu.zze((zzbu)webView);
        if (!bl2) {
            webView = this.zza;
            boolean bl3 = true;
            zzbu.zzb((zzbu)webView, bl3);
        }
    }

    public final void onReceivedError(WebView webView, int n3, String string2, String string3) {
        zzbu.zza(this.zza).zzf(n3, string2, string3);
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest object2) {
        object2 = this.zza;
        object = object2.getUrl().toString();
        boolean bl2 = zzbu.zzf((zzbu)((Object)object2), (String)object);
        if (bl2) {
            zzbu.zza(this.zza).zze((String)object);
            return true;
        }
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        webView = this.zza;
        boolean bl2 = zzbu.zzf((zzbu)webView, string2);
        if (bl2) {
            zzbu.zza(this.zza).zze(string2);
            return true;
        }
        return false;
    }
}

