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
import com.google.android.gms.internal.auth-api-phone.zze;

public abstract class zzd
extends zzb
implements zze {
    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            n4 = parcel.readInt();
            zzc.zzb(parcel);
            this.zzb((Status)object, n4);
            return n7;
        }
        return false;
    }
}

