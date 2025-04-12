/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Network
 */
package com.google.android.gms.internal.ads;

import android.net.Network;
import com.google.android.gms.internal.ads.zzfue;
import com.google.android.gms.internal.ads.zzfuf;
import com.google.android.gms.internal.ads.zzfug;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfum;
import com.google.android.gms.internal.ads.zzfun;
import com.google.android.gms.internal.ads.zzfuo;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfyw;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzfuq
extends zzfue {
    private zzfyw zza;
    private zzfyw zzb;
    private zzfup zzc;
    private HttpURLConnection zzd;

    public zzfuq() {
        zzfug zzfug2 = new zzfug();
        zzfuh zzfuh2 = new zzfuh();
        this(zzfug2, zzfuh2, null);
    }

    public zzfuq(zzfyw zzfyw2, zzfyw zzfyw3, zzfup zzfup2) {
        this.zza = zzfyw2;
        this.zzb = zzfyw3;
        this.zzc = zzfup2;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static /* synthetic */ Integer zzh(int n3) {
        return n3;
    }

    public static /* synthetic */ Integer zzi(int n3) {
        return n3;
    }

    public static /* synthetic */ Integer zzj(int n3) {
        return n3;
    }

    public static /* synthetic */ Integer zzk(int n3) {
        return n3;
    }

    public static /* synthetic */ Integer zzl(int n3) {
        return n3;
    }

    public static /* synthetic */ URLConnection zzp(URL uRL) {
        return uRL.openConnection();
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL uRL) {
        return network.openConnection(uRL);
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfuf.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzfuq.zzs(this.zzd);
    }

    public HttpURLConnection zzm() {
        int n3 = (Integer)this.zza.zza();
        int n4 = (Integer)this.zzb.zza();
        zzfuf.zzb(n3, n4);
        Object object = this.zzc;
        object.getClass();
        this.zzd = object = (HttpURLConnection)object.zza();
        return object;
    }

    public HttpURLConnection zzn(zzfup zzfup2, int n3, int n4) {
        zzfui zzfui2 = new zzfui(n3);
        this.zza = zzfui2;
        zzfuj zzfuj2 = new zzfuj(n4);
        this.zzb = zzfuj2;
        this.zzc = zzfup2;
        return this.zzm();
    }

    public HttpURLConnection zzo(Network network, URL uRL, int n3, int n4) {
        zzfuk zzfuk2 = new zzfuk(n3);
        this.zza = zzfuk2;
        Object object = new zzful(n4);
        this.zzb = object;
        this.zzc = object = new zzfum(network, uRL);
        return this.zzm();
    }

    public URLConnection zzr(URL uRL, int n3) {
        zzfun zzfun2 = new zzfun(n3);
        this.zza = zzfun2;
        zzfuo zzfuo2 = new zzfuo(uRL);
        this.zzc = zzfuo2;
        return this.zzm();
    }
}

