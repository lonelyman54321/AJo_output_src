/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfiq;

final class zzn
extends WebViewClient {
    final /* synthetic */ zzt zza;

    public zzn(zzt zzt2) {
        this.zza = zzt2;
    }

    public final void onReceivedError(WebView object, WebResourceRequest object2, WebResourceError object3) {
        int n3;
        object = this.zza;
        object2 = zzt.zzh((zzt)object);
        object3 = "#007 Could not call remote method.";
        if (object2 != null) {
            object = zzt.zzh((zzt)object);
            n3 = 1;
            object2 = zzfiq.zzd(n3, null, null);
            try {
                object.zzf((zze)object2);
            }
            catch (RemoteException remoteException) {
                zzm.zzl((String)object3, remoteException);
            }
        }
        if ((object2 = zzt.zzh((zzt)(object = this.zza))) != null) {
            object = zzt.zzh((zzt)object);
            n3 = 0;
            object2 = null;
            try {
                object.zze(0);
                return;
            }
            catch (RemoteException remoteException) {
                zzm.zzl((String)object3, remoteException);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView object, String object2) {
        object = this.zza.zzq();
        boolean n3 = ((String)object2).startsWith((String)object);
        zzbh zzbh2 = null;
        if (n3) {
            return false;
        }
        object = "gmsg://noAdLoaded";
        boolean bl2 = ((String)object2).startsWith((String)object);
        boolean bl3 = true;
        String string2 = "#007 Could not call remote method.";
        if (bl2) {
            object = this.zza;
            object2 = zzt.zzh((zzt)object);
            int n4 = 3;
            if (object2 != null) {
                object = zzt.zzh((zzt)object);
                object2 = zzfiq.zzd(n4, null, null);
                try {
                    object.zzf((zze)object2);
                }
                catch (RemoteException remoteException) {
                    zzm.zzl(string2, remoteException);
                }
            }
            if ((object2 = zzt.zzh((zzt)(object = this.zza))) != null) {
                object = zzt.zzh((zzt)object);
                try {
                    object.zze(n4);
                }
                catch (RemoteException remoteException) {
                    zzm.zzl(string2, remoteException);
                }
            }
            this.zza.zzV(0);
            return bl3;
        }
        object = "gmsg://scriptLoadFailed";
        boolean bl4 = ((String)object2).startsWith((String)object);
        if (bl4) {
            object = this.zza;
            object2 = zzt.zzh((zzt)object);
            if (object2 != null) {
                object = zzt.zzh((zzt)object);
                object2 = zzfiq.zzd((int)(bl3 ? 1 : 0), null, null);
                try {
                    object.zzf((zze)object2);
                }
                catch (RemoteException remoteException) {
                    zzm.zzl(string2, remoteException);
                }
            }
            if ((object2 = zzt.zzh((zzt)(object = this.zza))) != null) {
                object = zzt.zzh((zzt)object);
                try {
                    object.zze(0);
                }
                catch (RemoteException remoteException) {
                    zzm.zzl(string2, remoteException);
                }
            }
            this.zza.zzV(0);
            return bl3;
        }
        object = "gmsg://adResized";
        boolean bl5 = ((String)object2).startsWith((String)object);
        if (bl5) {
            object = this.zza;
            zzbh2 = zzt.zzh((zzt)object);
            if (zzbh2 != null) {
                object = zzt.zzh((zzt)object);
                try {
                    object.zzi();
                }
                catch (RemoteException remoteException) {
                    zzm.zzl(string2, remoteException);
                }
            }
            int n7 = this.zza.zzb((String)object2);
            this.zza.zzV(n7);
            return bl3;
        }
        object = "gmsg://";
        boolean bl6 = ((String)object2).startsWith((String)object);
        if (bl6) {
            return bl3;
        }
        object = this.zza;
        zzbh2 = zzt.zzh((zzt)object);
        if (zzbh2 != null) {
            object = zzt.zzh((zzt)object);
            object.zzc();
            object = this.zza;
            object = zzt.zzh((zzt)object);
            try {
                object.zzh();
            }
            catch (RemoteException remoteException) {
                zzm.zzl(string2, remoteException);
            }
        }
        object = zzt.zzo(this.zza, (String)object2);
        zzt.zzw(this.zza, (String)object);
        return bl3;
    }
}

