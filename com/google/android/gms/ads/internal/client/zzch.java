/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzch
extends zzbae
implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
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
                        n7 = 5;
                        if (n3 != n7) {
                            return false;
                        }
                        this.zzb();
                    } else {
                        this.zze();
                    }
                } else {
                    this.zzc();
                }
            } else {
                this.zzf();
            }
        } else {
            Object object = zze.CREATOR;
            object = (zze)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zzd((zze)object);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

