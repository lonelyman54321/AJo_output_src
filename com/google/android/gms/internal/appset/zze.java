/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.appset.zzb;
import com.google.android.gms.internal.appset.zzc;
import com.google.android.gms.internal.appset.zzf;

public abstract class zze
extends zzb
implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public final boolean zza(int n3, Parcel object, Parcel parcel, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object2 = Status.CREATOR;
            object2 = (Status)zzc.zza(object, object2);
            Parcelable.Creator creator = com.google.android.gms.appset.zzc.CREATOR;
            object = (com.google.android.gms.appset.zzc)zzc.zza(object, creator);
            this.zzb((Status)object2, (com.google.android.gms.appset.zzc)object);
            return n7;
        }
        return false;
    }
}

