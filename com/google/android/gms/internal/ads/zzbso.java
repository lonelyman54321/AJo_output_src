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
import com.google.android.gms.internal.ads.zzbsp;

public abstract class zzbso
extends zzbae
implements zzbsp {
    public zzbso() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    return false;
                }
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzf((zze)object);
            } else {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zze(string2);
            }
        } else {
            this.zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}

