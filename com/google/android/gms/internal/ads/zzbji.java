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
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbjh;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbjs;

public abstract class zzbji
extends zzbae
implements zzbjj {
    public zzbji() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbjj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        boolean bl2 = iInterface instanceof zzbjj;
        if (bl2) {
            return (zzbjj)iInterface;
        }
        iInterface = new zzbjh(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Object object = parcel.readStrongBinder();
            if (object == null) {
                n3 = 0;
                object = null;
            } else {
                IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                boolean bl2 = iInterface instanceof zzbjs;
                if (bl2) {
                    object = iInterface;
                    object = (zzbjs)iInterface;
                } else {
                    iInterface = new zzbjq((IBinder)object);
                    object = iInterface;
                }
            }
            zzbaf.zzc(parcel);
            this.zze((zzbjs)object);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

