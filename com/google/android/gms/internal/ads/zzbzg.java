/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbzh;

public abstract class zzbzg
extends zzbae
implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
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
                this.zzf((zze)object);
            } else {
                n3 = parcel.readInt();
                zzbaf.zzc(parcel);
                this.zze(n3);
            }
        } else {
            this.zzg();
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

