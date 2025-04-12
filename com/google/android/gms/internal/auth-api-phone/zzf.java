/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth-api-phone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api-phone.zzb;
import com.google.android.gms.internal.auth-api-phone.zzc;
import com.google.android.gms.internal.auth-api-phone.zzg;

public abstract class zzf
extends zzb
implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
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
            zzc.zzb(parcel);
            this.zzb((Status)object, bl2);
            return n4 != 0;
        }
        return false;
    }
}

