/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzciz;
import com.google.android.gms.internal.ads.zzcjc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public final class zzbqw
implements Runnable {
    public final /* synthetic */ zzbqx zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbqw(zzbqx zzbqx2, Context context, String string2) {
        this.zza = zzbqx2;
        this.zzb = context;
        this.zzc = string2;
    }

    /*
     * WARNING - void declaration
     */
    public final void run() {
        void var1_5;
        Object object = this.zzb;
        zzbep.zza(object);
        Object object2 = zzbep.zzau;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            return;
        }
        object2 = new Bundle();
        object3 = zzbep.zzai;
        boolean bl3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
        object2.putBoolean("measurementEnabled", bl3);
        object3 = zzbep.zzap;
        Object object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        bl3 = (Boolean)object3;
        if (bl3) {
            object4 = "denied";
            object2.putString("ad_storage", (String)object4);
            object3 = "analytics_storage";
            object2.putString((String)object3, (String)object4);
        }
        object3 = this.zzc;
        object4 = "FA-Ads";
        String string2 = "am";
        object2 = AppMeasurementSdk.getInstance(object, (String)object4, string2, (String)object3, (Bundle)object2);
        object3 = "com.google.android.gms.ads.measurement.DynamiteMeasurementManager";
        object4 = new zzbqv();
        object3 = zzq.zzb(object, (String)object3, (zzo)object4);
        object3 = (zzcjc)object3;
        object = ObjectWrapper.wrap(object);
        object4 = new zzbqu((AppMeasurementSdk)object2);
        try {
            object3.zze((IObjectWrapper)object, (zzciz)object4);
            return;
        }
        catch (RemoteException remoteException) {
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (zzp zzp2) {
            // empty catch block
        }
        zzm.zzl("#007 Could not call remote method.", (Throwable)var1_5);
    }
}

