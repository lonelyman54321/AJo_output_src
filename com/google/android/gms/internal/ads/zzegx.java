/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzfou;
import com.google.android.gms.internal.ads.zzfow;

public final class zzegx
implements zzegz {
    public final /* synthetic */ VersionInfoParcel zza;
    public final /* synthetic */ WebView zzb;

    public /* synthetic */ zzegx(VersionInfoParcel versionInfoParcel, WebView webView, boolean bl2) {
        this.zza = versionInfoParcel;
        this.zzb = webView;
    }

    public final Object zza() {
        Object object = this.zza;
        int n3 = ((VersionInfoParcel)object).buddyApkVersion;
        int n4 = ((VersionInfoParcel)object).clientJarVersion;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(".");
        stringBuilder.append(n4);
        object = stringBuilder.toString();
        object = zzfow.zza("Google", (String)object);
        WebView webView = this.zzb;
        return zzfou.zza((zzfow)object, webView, true);
    }
}

