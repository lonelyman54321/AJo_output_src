/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.location.zzr;

public abstract class zzq
extends zzb
implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                return false;
            }
            this.zze();
        } else {
            Object object = zzl.CREATOR;
            object = (zzl)zzc.zza(parcel, object);
            zzc.zzd(parcel);
            this.zzd((zzl)object);
        }
        return n7;
    }
}

