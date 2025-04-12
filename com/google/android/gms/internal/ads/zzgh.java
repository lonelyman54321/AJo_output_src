/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzgf;
import com.google.android.gms.internal.ads.zzgg;
import java.util.Arrays;

public final class zzgh
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    static {
        zzgf zzgf2 = new zzgf();
        CREATOR = zzgf2;
    }

    public /* synthetic */ zzgh(Parcel parcel, zzgg object) {
        int n3;
        int n4;
        object = parcel.readString();
        this.zza = object;
        object = parcel.createByteArray();
        this.zzb = (byte[])object;
        this.zzc = n4 = parcel.readInt();
        this.zzd = n3 = parcel.readInt();
    }

    public zzgh(String string2, byte[] byArray, int n3, int n4) {
        this.zza = string2;
        this.zzb = byArray;
        this.zzc = n3;
        this.zzd = n4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzgh.class) == (object2 = object.getClass())) {
            int n3;
            int n4;
            int n7;
            int n8;
            boolean bl3;
            object = (zzgh)object;
            object2 = this.zza;
            object3 = ((zzgh)object).zza;
            boolean n74 = ((String)object2).equals(object3);
            if (n74 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzb), (byte[])(object3 = (Object)((zzgh)object).zzb))) && (n8 = this.zzc) == (n7 = ((zzgh)object).zzc) && (n4 = this.zzd) == (n3 = ((zzgh)object).zzd)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() + 527;
        byte[] byArray = this.zzb;
        int n4 = (Arrays.hashCode(byArray) + (n3 *= 31)) * 31;
        n3 = this.zzc;
        n4 = (n4 + n3) * 31;
        n3 = this.zzd;
        return n4 + n3;
    }

    public final String toString() {
        CharSequence charSequence;
        Object object;
        int n3 = this.zzd;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 23;
            if (n3 != n4) {
                n4 = 67;
                if (n3 != n4) {
                    char c2;
                    object = this.zzb;
                    int n7 = ((Object)object).length;
                    n7 += n7;
                    charSequence = new StringBuilder(n7);
                    for (n7 = 0; n7 < (c2 = ((Object)object).length); ++n7) {
                        c2 = object[n7] >> 4 & 0xF;
                        int n8 = 16;
                        c2 = Character.forDigit(c2, n8);
                        ((StringBuilder)charSequence).append(c2);
                        c2 = Character.forDigit(object[n7] & 0xF, n8);
                        ((StringBuilder)charSequence).append(c2);
                    }
                    object = ((StringBuilder)charSequence).toString();
                } else {
                    n3 = zzgea.zzd(this.zzb);
                    object = String.valueOf(n3);
                }
            } else {
                n3 = zzgea.zzd(this.zzb);
                float f5 = Float.intBitsToFloat(n3);
                object = String.valueOf(f5);
            }
        } else {
            object = zzgd.zzA(this.zzb);
        }
        charSequence = this.zza;
        return UX.c("mdta: key=", (String)charSequence, ", value=", (String)object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        parcel.writeString((String)object);
        object = this.zzb;
        parcel.writeByteArray((byte[])object);
        n3 = this.zzc;
        parcel.writeInt(n3);
        n3 = this.zzd;
        parcel.writeInt(n3);
    }

    public final /* synthetic */ void zza(zzby zzby2) {
    }
}

