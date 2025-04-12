/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfyv;

public final class zzbb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;

    static {
        zzbc zzbc2 = new zzbc();
        CREATOR = zzbc2;
    }

    public zzbb(String string2, int n3) {
        if (string2 == null) {
            string2 = "";
        }
        this.zza = string2;
        this.zzb = n3;
    }

    public static zzbb zzb(Throwable object) {
        zze zze2 = zzfiq.zza((Throwable)object);
        Object object2 = ((Throwable)object).getMessage();
        boolean bl2 = zzfyv.zzd((String)object2);
        object = bl2 ? zze2.zzb : ((Throwable)object).getMessage();
        int n3 = zze2.zza;
        object2 = new zzbb((String)object, n3);
        return object2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final zzba zza() {
        String string2 = this.zza;
        int n3 = this.zzb;
        zzba zzba2 = new zzba(string2, n3);
        return zzba2;
    }
}

