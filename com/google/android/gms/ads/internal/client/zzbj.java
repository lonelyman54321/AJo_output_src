/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzbj
extends zzbae
implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            Object object = zze.CREATOR;
            object = (zze)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zzb((zze)object);
        } else {
            this.zzc();
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

