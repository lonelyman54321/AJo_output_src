/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.zzba;

public class UvmEntry
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final short zzb;
    private final short zzc;

    static {
        zzba zzba2 = new zzba();
        CREATOR = zzba2;
    }

    public UvmEntry(int n3, short s7, short s8) {
        this.zza = n3;
        this.zzb = s7;
        this.zzc = s8;
    }

    public boolean equals(Object object) {
        short s7;
        int n3 = object instanceof UvmEntry;
        if (n3 == 0) {
            return false;
        }
        object = (UvmEntry)object;
        n3 = this.zza;
        int n4 = ((UvmEntry)object).zza;
        return n3 == n4 && (n3 = (int)this.zzb) == (n4 = (int)((UvmEntry)object).zzb) && (n3 = (int)this.zzc) == (s7 = ((UvmEntry)object).zzc);
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Short s7 = this.zzb;
        Short s8 = this.zzc;
        Object[] objectArray = new Object[]{n3, s7, s8};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int s7 = this.getUserVerificationMethod();
        SafeParcelWriter.writeInt(parcel, 1, s7);
        short s8 = this.getKeyProtectionType();
        SafeParcelWriter.writeShort(parcel, 2, s8);
        short s10 = this.getMatcherProtectionType();
        SafeParcelWriter.writeShort(parcel, 3, s10);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

