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
import com.google.android.gms.internal.ads.zzbcn;

public abstract class zzbcm
extends zzbae
implements zzbcn {
    public zzbcm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    int n8 = 4;
                    if (n3 != n8) {
                        n8 = 5;
                        if (n3 != n8) {
                            return false;
                        }
                        this.zzb();
                    } else {
                        this.zze();
                    }
                } else {
                    Object object = zze.CREATOR;
                    object = (zze)zzbaf.zza(parcel, object);
                    zzbaf.zzc(parcel);
                    this.zzd((zze)object);
                }
            } else {
                this.zzc();
            }
        } else {
            this.zzf();
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

