/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrb;

public final class zzbmv {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbmr zzc;

    public zzbmv(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbep.zza(context);
    }

    public static final boolean zzc(String string2) {
        boolean bl2;
        boolean bl3;
        Object object = zzbep.zzjU;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (!n3) {
            return false;
        }
        Preconditions.checkNotNull(string2);
        int n4 = string2.length();
        Object object2 = zzbep.zzjW;
        zzben zzben2 = zzba.zzc();
        object2 = (Integer)zzben2.zza((zzbeg)object2);
        int n7 = (Integer)object2;
        if (n4 > n7) {
            zzm.zze("H5 GMSG exceeds max length");
            return false;
        }
        object2 = "gmsg";
        object = (string2 = Uri.parse((String)string2)).getScheme();
        boolean bl4 = ((String)object2).equals(object);
        return bl4 && (bl3 = ((String)(object2 = "mobileads.google.com")).equals(object = string2.getHost())) && (bl2 = ((String)(object = "/h5ads")).equals(string2 = string2.getPath()));
    }

    private final void zzd() {
        zzbmr zzbmr2 = this.zzc;
        if (zzbmr2 != null) {
            return;
        }
        zzbmr2 = this.zza;
        zzaw zzaw2 = zzay.zza();
        zzbrb zzbrb2 = new zzbrb();
        OnH5AdsEventListener onH5AdsEventListener = this.zzb;
        this.zzc = zzbmr2 = zzaw2.zzl((Context)zzbmr2, zzbrb2, onH5AdsEventListener);
    }

    public final void zza() {
        Object object = zzbep.zzjU;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzd();
            object = this.zzc;
            if (object != null) {
                try {
                    object.zze();
                    return;
                }
                catch (RemoteException remoteException) {
                    object2 = "#007 Could not call remote method.";
                    zzm.zzl((String)object2, remoteException);
                }
            }
        }
    }

    public final boolean zzb(String string2) {
        boolean bl2 = zzbmv.zzc(string2);
        if (!bl2) {
            return false;
        }
        this.zzd();
        Object object = this.zzc;
        if (object != null) {
            try {
                object.zzf(string2);
            }
            catch (RemoteException remoteException) {
                object = "#007 Could not call remote method.";
                zzm.zzl((String)object, remoteException);
            }
            return true;
        }
        return false;
    }
}

