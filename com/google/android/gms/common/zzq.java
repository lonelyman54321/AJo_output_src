/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.zzd;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzx;

public final class zzq
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzr zzr2 = new zzr();
        CREATOR = zzr2;
    }

    /*
     * WARNING - void declaration
     */
    public zzq(boolean bl2, String string2, int n3, int n4) {
        void var4_6;
        int n7;
        void var3_5;
        int n8;
        void var2_4;
        this.zza = bl2;
        this.zzb = var2_4;
        this.zzc = n8 = zzx.zza((int)var3_5) + -1;
        this.zzd = n7 = com.google.android.gms.common.zzd.zza((int)var4_6) + -1;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeBoolean(parcel, 1, n4 != 0);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return com.google.android.gms.common.zzd.zza(this.zzd);
    }

    public final int zzd() {
        return zzx.zza(this.zzc);
    }
}

