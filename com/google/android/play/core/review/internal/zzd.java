/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.play.core.review.internal.zza;
import com.google.android.play.core.review.internal.zzf;
import com.google.android.play.core.review.internal.zzh;

public final class zzd
extends zza
implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    public final void zzc(String string2, Bundle bundle, zzh zzh2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        parcel.writeStrongBinder((IBinder)zzh2);
        this.zzb(2, parcel);
    }
}

