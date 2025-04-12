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
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaha
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    static {
        zzagz zzagz2 = new zzagz();
        CREATOR = zzagz2;
    }

    public zzaha(int n3, String string2, String string3, String string4, boolean bl2, int n4) {
        int n7 = -1;
        boolean bl3 = true;
        if (n4 != n7 && n4 <= 0) {
            bl3 = false;
        }
        zzeq.zzd(bl3);
        this.zza = n3;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = bl2;
        this.zzf = n4;
    }

    public zzaha(Parcel parcel) {
        int n3;
        String string2;
        int n4;
        this.zza = n4 = parcel.readInt();
        this.zzb = string2 = parcel.readString();
        this.zzc = string2 = parcel.readString();
        this.zzd = string2 = parcel.readString();
        n4 = zzgd.zza;
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        this.zze = n4;
        this.zzf = n3 = parcel.readInt();
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
        if (object != null && (object3 = zzaha.class) == (object2 = object.getClass())) {
            int n3;
            object = (zzaha)object;
            int n4 = this.zza;
            int n7 = ((zzaha)object).zza;
            if (n4 == n7 && (n4 = (int)(zzgd.zzG(object2 = this.zzb, object3 = ((zzaha)object).zzb) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzc, object3 = ((zzaha)object).zzc) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzd, object3 = ((zzaha)object).zzd) ? 1 : 0)) != 0 && (n4 = (int)(this.zze ? 1 : 0)) == (n7 = (int)(((zzaha)object).zze ? 1 : 0)) && (n4 = this.zzf) == (n3 = ((zzaha)object).zzf)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.zzb;
        int n7 = 0;
        if (string2 != null) {
            n4 = string2.hashCode();
        } else {
            n4 = 0;
            string2 = null;
        }
        int n8 = this.zza;
        String string3 = this.zzc;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n8 = (n8 + 527) * 31 + n4;
        string2 = this.zzd;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        n8 = ((n8 * 31 + n3) * 31 + n7) * 31;
        n4 = (int)(this.zze ? 1 : 0);
        n8 = (n8 + n4) * 31;
        n4 = this.zzf;
        return n8 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IcyHeaders: name=\"");
        String string2 = this.zzc;
        stringBuilder.append(string2);
        stringBuilder.append("\", genre=\"");
        string2 = this.zzb;
        stringBuilder.append(string2);
        stringBuilder.append("\", bitrate=");
        int n3 = this.zza;
        stringBuilder.append(n3);
        stringBuilder.append(", metadataInterval=");
        n3 = this.zzf;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        parcel.writeInt(n3);
        String string2 = this.zzb;
        parcel.writeString(string2);
        string2 = this.zzc;
        parcel.writeString(string2);
        string2 = this.zzd;
        parcel.writeString(string2);
        n3 = zzgd.zza;
        n3 = (int)(this.zze ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.zzf;
        parcel.writeInt(n3);
    }

    public final void zza(zzby zzby2) {
        String string2 = this.zzc;
        if (string2 != null) {
            zzby2.zzp(string2);
        }
        if ((string2 = this.zzb) != null) {
            zzby2.zzi(string2);
        }
    }
}

