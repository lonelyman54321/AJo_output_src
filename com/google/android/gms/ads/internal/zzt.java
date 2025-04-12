/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzcci;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class zzt
extends zzbt {
    private final VersionInfoParcel zza;
    private final zzq zzb;
    private final Future zzc;
    private final Context zzd;
    private final zzs zze;
    private WebView zzf;
    private zzbh zzg;
    private zzaxd zzh;
    private AsyncTask zzi;

    public zzt(Context context, zzq object, String string2, VersionInfoParcel object2) {
        this.zzd = context;
        this.zza = object2;
        this.zzb = object;
        super(context);
        this.zzf = object;
        object = zzcci.zza;
        object2 = new zzp(this);
        this.zzc = object = object.zzb((Callable)object2);
        this.zze = object = new zzs(context, string2);
        this.zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        context = this.zzf;
        object = new zzn(this);
        context.setWebViewClient((WebViewClient)object);
        context = this.zzf;
        object = new zzo(this);
        context.setOnTouchListener((View.OnTouchListener)object);
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzt zzt2) {
        return zzt2.zzd;
    }

    public static /* bridge */ /* synthetic */ WebView zze(zzt zzt2) {
        return zzt2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzaxd zzf(zzt zzt2) {
        return zzt2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbh zzh(zzt zzt2) {
        return zzt2.zzg;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzm(zzt zzt2) {
        return zzt2.zza;
    }

    public static /* bridge */ /* synthetic */ String zzo(zzt zzt2, String string2) {
        Object object = zzt2.zzh;
        if (object != null) {
            string2 = Uri.parse((String)string2);
            object = zzt2.zzh;
            zzt2 = zzt2.zzd;
            try {
                string2 = ((zzaxd)object).zza((Uri)string2, (Context)zzt2, null, null);
            }
            catch (zzaxe zzaxe2) {
                object = "Unable to process ad data";
                zzm.zzk((String)object, zzaxe2);
            }
            string2 = string2.toString();
        }
        return string2;
    }

    public static /* bridge */ /* synthetic */ Future zzu(zzt zzt2) {
        return zzt2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzv(zzt zzt2, zzaxd zzaxd2) {
        zzt2.zzh = zzaxd2;
    }

    public static /* bridge */ /* synthetic */ void zzw(zzt zzt2, String string2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        string2 = Uri.parse((String)string2);
        intent.setData((Uri)string2);
        zzt2.zzd.startActivity(intent);
    }

    public final void zzA() {
        IllegalStateException illegalStateException = new IllegalStateException("Unused method");
        throw illegalStateException;
    }

    public final void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzC(zzbe object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzD(zzbh zzbh2) {
        this.zzg = zzbh2;
    }

    public final void zzE(zzby object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzF(zzq object) {
        object = new IllegalStateException("AdSize must be set before initialization");
        throw object;
    }

    public final void zzG(zzcb object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzH(zzbcj object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzI(zzw object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzJ(zzci zzci2) {
    }

    public final void zzK(zzdu object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzL(boolean bl2) {
        IllegalStateException illegalStateException = new IllegalStateException("Unused method");
        throw illegalStateException;
    }

    public final void zzM(zzbvp object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzN(boolean bl2) {
    }

    public final void zzO(zzbfk object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzP(zzdg zzdg2) {
    }

    public final void zzQ(zzbvs object, String string2) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzR(String object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzS(zzbyn object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzT(String object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzU(zzfk object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final void zzV(int n3) {
        WebView webView = this.zzf;
        if (webView == null) {
            return;
        }
        webView = new ViewGroup.LayoutParams(-1, n3);
        this.zzf.setLayoutParams((ViewGroup.LayoutParams)webView);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
        IllegalStateException illegalStateException = new IllegalStateException("Unused method");
        throw illegalStateException;
    }

    public final boolean zzY() {
        return false;
    }

    public final boolean zzZ() {
        return false;
    }

    public final boolean zzaa() {
        return false;
    }

    public final boolean zzab(zzl object) {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        Object[] objectArray = this.zza;
        this.zze.zzf((zzl)object, (VersionInfoParcel)objectArray);
        object = new zzr(this, null);
        objectArray = new Void[]{};
        object = object.execute(objectArray);
        this.zzi = object;
        return true;
    }

    public final void zzac(zzcf object) {
        object = new IllegalStateException("Unused method");
        throw object;
    }

    public final int zzb(String string2) {
        string2 = Uri.parse((String)string2);
        String string3 = "height";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(string2 = string2.getQueryParameter(string3)));
        if (bl2) {
            return 0;
        }
        try {
            zzay.zzb();
            string3 = this.zzd;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
        int n3 = Integer.parseInt(string2);
        return com.google.android.gms.ads.internal.util.client.zzf.zzy((Context)string3, n3);
    }

    public final Bundle zzd() {
        IllegalStateException illegalStateException = new IllegalStateException("Unused method");
        throw illegalStateException;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzbh zzi() {
        IllegalStateException illegalStateException = new IllegalStateException("getIAdListener not implemented");
        throw illegalStateException;
    }

    public final zzcb zzj() {
        IllegalStateException illegalStateException = new IllegalStateException("getIAppEventListener not implemented");
        throw illegalStateException;
    }

    public final zzdn zzk() {
        return null;
    }

    public final zzdq zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    public final String zzp() {
        boolean bl2;
        Object object = new Uri.Builder();
        Object object2 = object.scheme("https://");
        Object object3 = (String)zzbfx.zzd.zze();
        object2.appendEncodedPath((String)object3);
        object2 = this.zze.zzd();
        object.appendQueryParameter("query", (String)object2);
        object2 = this.zze.zzc();
        object.appendQueryParameter("pubId", (String)object2);
        object2 = this.zze.zza();
        object.appendQueryParameter("mappver", (String)object2);
        object2 = this.zze.zze();
        object3 = object2.keySet().iterator();
        while (bl2 = object3.hasNext()) {
            String string2 = (String)object3.next();
            String string3 = (String)object2.get(string2);
            object.appendQueryParameter(string2, string3);
        }
        object = object.build();
        object2 = this.zzh;
        if (object2 != null) {
            object3 = this.zzd;
            try {
                object = ((zzaxd)object2).zzb((Uri)object, (Context)object3);
            }
            catch (zzaxe zzaxe2) {
                object3 = "Unable to process ad data";
                zzm.zzk((String)object3, zzaxe2);
            }
        }
        object2 = this.zzq();
        object = object.getEncodedQuery();
        return n1.a((String)object2, "#", (String)object);
    }

    public final String zzq() {
        boolean bl2 = true;
        String string2 = this.zze.zzb();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2 == bl3) {
            string2 = "www.google.com";
        }
        String string3 = (String)zzbfx.zzd.zze();
        return cP.a("https://", string2, string3);
    }

    public final String zzr() {
        IllegalStateException illegalStateException = new IllegalStateException("getAdUnitId not implemented");
        throw illegalStateException;
    }

    public final String zzs() {
        return null;
    }

    public final String zzt() {
        return null;
    }

    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    public final void zzy(zzl zzl2, zzbk zzbk2) {
    }

    public final void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

