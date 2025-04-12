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
import com.google.android.gms.internal.ads.zzbth;

public abstract class zzbtg
extends zzbae
implements zzbth {
    public zzbtg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
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
                this.zzg((zze)object);
            } else {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzf(string2);
            }
        } else {
            String string3 = parcel.readString();
            zzbaf.zzc(parcel);
            this.zze(string3);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

