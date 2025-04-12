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
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzbxk;

public abstract class zzbxg
extends zzbae
implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 0;
        IInterface iInterface = null;
        int n7 = 1;
        String string2 = "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener";
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                n8 = 3;
                if (n3 != n8) {
                    return false;
                }
                Object object = zzbwz.CREATOR;
                object = (zzbwz)zzbaf.zza(parcel, object);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    iInterface = iBinder.queryLocalInterface(string2);
                    boolean bl2 = iInterface instanceof zzbxk;
                    iInterface = bl2 ? (zzbxk)iInterface : new zzbxi(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zze((zzbwz)object, (zzbxk)iInterface);
            } else {
                Object object = zzbwv.CREATOR;
                object = (zzbwv)zzbaf.zza(parcel, object);
                object = parcel.readStrongBinder();
                if (object != null && (n4 = (object = object.queryLocalInterface(string2)) instanceof zzbxk) != 0) {
                    object = (zzbxk)object;
                }
                zzbaf.zzc(parcel);
            }
        } else {
            Object object = zzbwv.CREATOR;
            object = (zzbwv)zzbaf.zza(parcel, object);
            IBinder iBinder = parcel.readStrongBinder();
            if (iBinder != null) {
                iInterface = iBinder.queryLocalInterface(string2);
                boolean bl3 = iInterface instanceof zzbxk;
                iInterface = bl3 ? (zzbxk)iInterface : new zzbxi(iBinder);
            }
            zzbaf.zzc(parcel);
            this.zzf((zzbwv)object, (zzbxk)iInterface);
        }
        parcel2.writeNoException();
        return n7;
    }
}

