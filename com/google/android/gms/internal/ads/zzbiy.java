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
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbiz;

public abstract class zzbiy
extends zzbae
implements zzbiz {
    public zzbiy() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbiz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        boolean bl2 = iInterface instanceof zzbiz;
        if (bl2) {
            return (zzbiz)iInterface;
        }
        iInterface = new zzbix(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Object object;
            Object object2 = parcel.readStrongBinder();
            if (object2 == null) {
                n3 = 0;
                object2 = null;
            } else {
                object = object2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                boolean bl2 = object instanceof zzbip;
                if (bl2) {
                    object2 = object;
                    object2 = (zzbip)object;
                } else {
                    object = new zzbin((IBinder)object2);
                    object2 = object;
                }
            }
            object = parcel.readString();
            zzbaf.zzc(parcel);
            this.zze((zzbip)object2, (String)object);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

