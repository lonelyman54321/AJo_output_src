/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzds
extends zzbae
implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
                        n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                        zzbaf.zzc(parcel);
                        this.zzf(n3 != 0);
                    } else {
                        this.zze();
                    }
                } else {
                    this.zzg();
                }
            } else {
                this.zzh();
            }
        } else {
            this.zzi();
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

