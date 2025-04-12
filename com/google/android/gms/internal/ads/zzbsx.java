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
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbsy;

public abstract class zzbsx
extends zzbae
implements zzbsy {
    public zzbsx() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
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
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zze(string2);
            }
        } else {
            zzbru zzbru2 = zzbrt.zzb(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            this.zzg(zzbru2);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

