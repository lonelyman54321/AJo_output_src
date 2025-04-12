/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;
import com.google.android.gms.internal.auth.zzm;

public abstract class zzl
extends zzb
implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel object, int n4) {
        int n7 = 2;
        if (n3 == n7) {
            Object object2 = Status.CREATOR;
            object2 = (Status)zzc.zza(parcel, object2);
            object = AccountChangeEventsResponse.CREATOR;
            object = (AccountChangeEventsResponse)zzc.zza(parcel, (Parcelable.Creator)object);
            zzc.zzb(parcel);
            this.zzb((Status)object2, (AccountChangeEventsResponse)object);
            return true;
        }
        return false;
    }
}

