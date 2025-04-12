/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzo;

public abstract class zzn
extends zzb
implements zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        boolean bl2 = false;
        n4 = 1;
        if (n3 == n4) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            int n7 = parcel.readInt();
            if (n7 != 0) {
                bl2 = true;
            }
            zzc.zzd(parcel);
            this.zzb((Status)object, bl2);
            return n4 != 0;
        }
        return false;
    }
}

