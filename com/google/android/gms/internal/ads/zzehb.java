/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzehd;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfou;

public interface zzehb {
    public zzehg zza(String var1, WebView var2, String var3, String var4, String var5, zzehd var6, zzehc var7, String var8);

    public zzehg zzb(String var1, WebView var2, String var3, String var4, String var5, String var6, zzehd var7, zzehc var8, String var9);

    public zzfou zze(VersionInfoParcel var1, WebView var2, boolean var3);

    public String zzf(Context var1);

    public void zzg(zzfoj var1, View var2);

    public void zzh(zzfou var1, View var2);

    public void zzi(zzfoj var1);

    public void zzj(zzfoj var1, View var2);

    public void zzk(zzfoj var1);

    public boolean zzl(Context var1);

    public void zzm(zzfou var1, zzchs var2);
}

