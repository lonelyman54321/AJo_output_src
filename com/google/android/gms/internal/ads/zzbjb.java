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
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzbjc;

public abstract class zzbjb
extends zzbae
implements zzbjc {
    public zzbjb() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbjc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        boolean bl2 = iInterface instanceof zzbjc;
        if (bl2) {
            return (zzbjc)iInterface;
        }
        iInterface = new zzbja(iBinder);
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
                IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                boolean bl2 = iInterface instanceof zzbip;
                if (bl2) {
                    object = iInterface;
                    object = (zzbip)iInterface;
                } else {
                    iInterface = new zzbin((IBinder)object);
                    object = iInterface;
                }
            }
            zzbaf.zzc(parcel);
            this.zze((zzbip)object);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

