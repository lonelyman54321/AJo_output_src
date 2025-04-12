/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.zza;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEvent
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    final long zzb;
    final String zzc;
    final int zzd;
    final int zze;
    final String zzf;

    static {
        zza zza2 = new zza();
        CREATOR = zza2;
    }

    public AccountChangeEvent(int n3, long l2, String string2, int n4, int n7, String string3) {
        String string4;
        this.zza = n3;
        this.zzb = l2;
        this.zzc = string4 = (String)Preconditions.checkNotNull(string2);
        this.zzd = n4;
        this.zze = n7;
        this.zzf = string3;
    }

    public AccountChangeEvent(long l2, String string2, int n3, int n4, String string3) {
        String string4;
        this.zza = 1;
        this.zzb = l2;
        this.zzc = string4 = (String)Preconditions.checkNotNull(string2);
        this.zzd = n3;
        this.zze = n4;
        this.zzf = string3;
    }

    public boolean equals(Object object) {
        boolean bl2;
        String string2;
        String string3;
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl3 = object instanceof AccountChangeEvent;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (object == this) {
            return bl3;
        }
        object = (AccountChangeEvent)object;
        int n3 = this.zza;
        int n4 = ((AccountChangeEvent)object).zza;
        if (n3 == n4 && (l7 = (l4 = (l3 = this.zzb) - (l2 = ((AccountChangeEvent)object).zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n3 = (int)(Objects.equal(string3 = this.zzc, string2 = ((AccountChangeEvent)object).zzc) ? 1 : 0)) != 0 && (n3 = this.zzd) == (n4 = ((AccountChangeEvent)object).zzd) && (n3 = this.zze) == (n4 = ((AccountChangeEvent)object).zze) && (bl2 = Objects.equal(string3 = this.zzf, object = ((AccountChangeEvent)object).zzf))) {
            return bl3;
        }
        return false;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Long l2 = this.zzb;
        String string2 = this.zzc;
        Integer n4 = this.zzd;
        Integer n7 = this.zze;
        String string3 = this.zzf;
        Object[] objectArray = new Object[]{n3, l2, string2, n4, n7, string3};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        int n3 = this.zzd;
        int n4 = 1;
        CharSequence charSequence = n3 != n4 ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? (n3 != (n4 = 4) ? "UNKNOWN" : "RENAMED_TO") : "RENAMED_FROM") : "REMOVED") : "ADDED";
        String string2 = this.zzc;
        String string3 = this.zzf;
        int n7 = this.zze;
        charSequence = og_1.a("AccountChangeEvent {accountName = ", string2, ", changeType = ", (String)charSequence, ", changeData = ");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", eventIndex = ");
        ((StringBuilder)charSequence).append(n7);
        ((StringBuilder)charSequence).append("}");
        return ((StringBuilder)charSequence).toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        n4 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, n4);
        String string3 = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

