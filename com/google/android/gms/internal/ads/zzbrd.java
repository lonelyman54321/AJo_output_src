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
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbte;

public final class zzbrd
extends zzbad
implements zzbrf {
    public zzbrd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final zzbri zzb(String string2) {
        Object object = this.zza();
        object.writeString(string2);
        int n3 = 1;
        string2 = this.zzdb(n3, (Parcel)object);
        object = string2.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            boolean bl2 = iInterface instanceof zzbri;
            if (bl2) {
                object = iInterface;
                object = (zzbri)iInterface;
            } else {
                iInterface = new zzbrg((IBinder)object);
                object = iInterface;
            }
        }
        string2.recycle();
        return object;
    }

    public final zzbte zzc(String string2) {
        Object object = this.zza();
        object.writeString(string2);
        string2 = this.zzdb(3, (Parcel)object);
        object = zzbtd.zzb(string2.readStrongBinder());
        string2.recycle();
        return object;
    }

    public final boolean zzd(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        string2 = this.zzdb(4, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)string2);
        string2.recycle();
        return bl2;
    }

    public final boolean zze(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        string2 = this.zzdb(2, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)string2);
        string2.recycle();
        return bl2;
    }
}

