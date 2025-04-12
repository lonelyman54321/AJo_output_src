/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.Collections;
import java.util.List;

public final class zzey
extends zzcn {
    private zzbnu zza;

    public final /* synthetic */ void zzb() {
        zzbnu zzbnu2 = this.zza;
        if (zzbnu2 != null) {
            Object object = Collections.emptyList();
            try {
                zzbnu2.zzb((List)object);
                return;
            }
            catch (RemoteException remoteException) {
                object = "Could not notify onComplete event.";
                zzm.zzk((String)object, remoteException);
            }
        }
    }

    public final float zze() {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() {
        return Collections.emptyList();
    }

    public final void zzh(String string2) {
    }

    public final void zzi() {
    }

    public final void zzj(boolean bl2) {
    }

    public final void zzk() {
        zzm.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        Handler handler = zzf.zza;
        zzex zzex2 = new zzex(this);
        handler.post((Runnable)zzex2);
    }

    public final void zzl(String string2, IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(zzda zzda2) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String string2) {
    }

    public final void zzo(zzbrf zzbrf2) {
    }

    public final void zzp(boolean bl2) {
    }

    public final void zzq(float f5) {
    }

    public final void zzr(String string2) {
    }

    public final void zzs(zzbnu zzbnu2) {
        this.zza = zzbnu2;
    }

    public final void zzt(String string2) {
    }

    public final void zzu(zzff zzff2) {
    }

    public final boolean zzv() {
        return false;
    }
}

