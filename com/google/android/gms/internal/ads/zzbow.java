/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbov;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbpv;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class zzbow
implements zzboo,
zzbom {
    private final zzchd zza;

    public zzbow(Context context, VersionInfoParcel versionInfoParcel, zzaxd zzaxd2, zza zza2) {
        zzu.zzz();
        Object object = zzcix.zza();
        zzbdm zzbdm2 = zzbdm.zza();
        Object object2 = context;
        object2 = zzchq.zza(context, (zzcix)object, "", false, false, null, null, versionInfoParcel, null, null, null, zzbdm2, null, null, null, null);
        object = this;
        this.zza = object2;
        ((View)object2).setWillNotDraw(true);
    }

    private static final void zzs(Runnable object) {
        zzay.zzb();
        boolean bl2 = zzf.zzv();
        if (bl2) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            object.run();
            return;
        }
        zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        zzfuv zzfuv2 = zzt.zza;
        boolean bl3 = zzfuv2.post((Runnable)object);
        if (!bl3) {
            object = "runOnUiThread > the runnable could not be placed to the message queue";
            zzm.zzj((String)object);
        }
    }

    public final void zza(String string2) {
        zze.zza("invokeJavascript on adWebView from js");
        zzbos zzbos2 = new zzbos(this, string2);
        zzbow.zzs(zzbos2);
    }

    public final /* synthetic */ void zzb(String string2, String string3) {
        zzbol.zzc(this, string2, string3);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String string2, Map map2) {
        zzbol.zza(this, string2, map2);
    }

    public final /* synthetic */ void zze(String string2, JSONObject jSONObject) {
        zzbol.zzb(this, string2, jSONObject);
    }

    public final void zzf(String string2) {
        zze.zza("loadHtml on adWebView from html");
        zzbot zzbot2 = new zzbot(this, string2);
        zzbow.zzs(zzbot2);
    }

    public final void zzg(String string2) {
        Object object = String.valueOf(string2);
        zze.zza("loadHtmlWrapper on adWebView from path: ".concat((String)object));
        object = new zzboq(this, string2);
        zzbow.zzs((Runnable)object);
    }

    public final void zzh(String string2) {
        Object object = String.valueOf(string2);
        zze.zza("loadJavascript on adWebView from path: ".concat((String)object));
        object = new StringBuilder("<!DOCTYPE html><html><head><script src=\"");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("\"></script></head><body></body></html>");
        string2 = ((StringBuilder)object).toString();
        object = new zzbou(this, string2);
        zzbow.zzs((Runnable)object);
    }

    public final boolean zzi() {
        return this.zza.zzaE();
    }

    public final zzbpv zzj() {
        zzbpv zzbpv2 = new zzbpv(this);
        return zzbpv2;
    }

    public final void zzk(zzbpc zzbpc2) {
        zzciv zzciv2 = this.zza.zzN();
        Objects.requireNonNull(zzbpc2);
        zzbor zzbor2 = new zzbor(zzbpc2);
        zzciv2.zzH(zzbor2);
    }

    public final /* synthetic */ void zzl(String string2, JSONObject jSONObject) {
        zzbol.zzd(this, string2, jSONObject);
    }

    public final /* synthetic */ void zzm(String string2) {
        this.zza.zza(string2);
    }

    public final /* synthetic */ void zzn(String string2) {
        this.zza.loadData(string2, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String string2) {
        this.zza.loadUrl(string2);
    }

    public final /* synthetic */ void zzp(String string2) {
        this.zza.loadData(string2, "text/html", "UTF-8");
    }

    public final void zzq(String string2, zzblp zzblp2) {
        zzbov zzbov2 = new zzbov(this, zzblp2);
        this.zza.zzag(string2, zzbov2);
    }

    public final void zzr(String string2, zzblp zzblp2) {
        zzbop zzbop2 = new zzbop(zzblp2);
        this.zza.zzaA(string2, zzbop2);
    }
}

