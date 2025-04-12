/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    static {
        zzfl zzfl2 = new zzfl();
        CREATOR = zzfl2;
    }

    public zzfk(VideoOptions videoOptions) {
        boolean bl2 = videoOptions.getStartMuted();
        boolean bl3 = videoOptions.getCustomControlsRequested();
        boolean bl4 = videoOptions.getClickToExpandRequested();
        this(bl2, bl3, bl4);
    }

    public zzfk(boolean bl2, boolean bl3, boolean bl4) {
        this.zza = bl2;
        this.zzb = bl3;
        this.zzc = bl4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = (int)(this.zza ? 1 : 0);
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, n3 != 0);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

