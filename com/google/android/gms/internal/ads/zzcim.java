/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcil;
import com.google.android.gms.internal.ads.zzegk;
import java.util.Map;

public final class zzcim
extends zzcil {
    public zzcim(zzchd zzchd2, zzbdm zzbdm2, boolean bl2, zzegk zzegk2) {
        super(zzchd2, zzbdm2, bl2, zzegk2);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest object) {
        Object object2;
        if (object != null && (object2 = object.getUrl()) != null) {
            object2 = object.getUrl().toString();
            object = object.getRequestHeaders();
            return this.zzS(webView, (String)object2, (Map)object);
        }
        return null;
    }
}

