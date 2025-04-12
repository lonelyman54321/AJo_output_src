/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzb;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zzv;

public abstract class zzu
extends zzb
implements zzv {
    public zzu() {
        super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            Parcelable.Creator creator = PendingIntent.CREATOR;
            creator = (PendingIntent)zzc.zza(parcel, creator);
            zzc.zzc(parcel);
            this.zzb((Status)object, (PendingIntent)creator);
            return n7;
        }
        return false;
    }
}

