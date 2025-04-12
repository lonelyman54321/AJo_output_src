/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;
import com.google.android.gms.internal.auth.zzk;

public abstract class zzj
extends zzb
implements zzk {
    public zzj() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            parcel2 = Bundle.CREATOR;
            parcel2 = (Bundle)zzc.zza(parcel, (Parcelable.Creator)parcel2);
            zzc.zzb(parcel);
            this.zzb((Status)object, (Bundle)parcel2);
            return true;
        }
        return false;
    }
}

