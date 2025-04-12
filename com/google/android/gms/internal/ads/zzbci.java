/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbcj;

public abstract class zzbci
extends zzbae
implements zzbcj {
    public zzbci() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbcj zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        boolean bl2 = iInterface instanceof zzbcj;
        if (bl2) {
            return (zzbcj)iInterface;
        }
        iInterface = new zzbch(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzc((zze)object);
            } else {
                parcel.readInt();
                zzbaf.zzc(parcel);
            }
        } else {
            Object object = parcel.readStrongBinder();
            if (object == null) {
                n3 = 0;
                object = null;
            } else {
                IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                boolean bl2 = iInterface instanceof zzbcg;
                if (bl2) {
                    object = iInterface;
                    object = (zzbcg)iInterface;
                } else {
                    iInterface = new zzbce((IBinder)object);
                    object = iInterface;
                }
            }
            zzbaf.zzc(parcel);
            this.zzd((zzbcg)object);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

