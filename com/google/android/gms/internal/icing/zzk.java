/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzl;
import com.google.android.gms.internal.icing.zzq;
import com.google.android.gms.internal.icing.zzr;
import com.google.android.gms.internal.icing.zzs;

public final class zzk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int zza;
    private static final zzs zzf;
    public final String zzb;
    final zzs zzc;
    public final int zzd;
    public final byte[] zze;

    static {
        zza = Integer.parseInt("-1");
        Object object = new zzl();
        CREATOR = object;
        object = new zzr("SsbContext");
        ((zzr)object).zzb(true);
        ((zzr)object).zza("blob");
        zzf = ((zzr)object).zze();
    }

    public zzk(String string2, zzs object, int n3, byte[] byArray) {
        CharSequence charSequence;
        int n4 = zza;
        boolean bl2 = true;
        if (n3 != n4 && (charSequence = zzq.zza(n3)) == null) {
            bl2 = false;
        }
        int n7 = 32;
        charSequence = new StringBuilder(n7);
        String string3 = "Invalid section type ";
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(n3);
        charSequence = ((StringBuilder)charSequence).toString();
        Preconditions.checkArgument(bl2, charSequence);
        this.zzb = string2;
        this.zzc = object;
        this.zzd = n3;
        this.zze = byArray;
        if (n3 != n4 && (object = zzq.zza(n3)) == null) {
            string2 = tk3_2.a(n7, n3, string3);
        } else {
            object = null;
            string2 = string2 != null && byArray != null ? "Both content and blobContent set" : null;
        }
        if (string2 == null) {
            return;
        }
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public zzk(byte[] byArray, zzs zzs2) {
        int n3 = zza;
        this(null, zzs2, n3, byArray);
    }

    public static zzk zza(byte[] byArray) {
        zzs zzs2 = zzf;
        int n3 = zza;
        zzk zzk2 = new zzk(null, zzs2, n3, byArray);
        return zzk2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 1, (String)object, false);
        zzs zzs2 = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, zzs2, n3, false);
        int n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        object = this.zze;
        SafeParcelWriter.writeByteArray(parcel, 5, (byte[])object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

