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
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbrf;

public abstract class zzbre
extends zzbae
implements zzbrf {
    public zzbre() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbrf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        boolean bl2 = iInterface instanceof zzbrf;
        if (bl2) {
            return (zzbrf)iInterface;
        }
        iInterface = new zzbrd(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        return false;
                    }
                    String string2 = parcel.readString();
                    zzbaf.zzc(parcel);
                    n3 = (int)(this.zzd(string2) ? 1 : 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(n3);
                } else {
                    Object object = parcel.readString();
                    zzbaf.zzc(parcel);
                    object = this.zzc((String)object);
                    parcel2.writeNoException();
                    zzbaf.zzf(parcel2, (IInterface)object);
                }
            } else {
                String string3 = parcel.readString();
                zzbaf.zzc(parcel);
                n3 = (int)(this.zze(string3) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
            }
        } else {
            Object object = parcel.readString();
            zzbaf.zzc(parcel);
            object = this.zzb((String)object);
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, (IInterface)object);
        }
        return n4 != 0;
    }
}

