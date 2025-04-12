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
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.zzc;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;

public class AuthenticationExtensionsClientOutputs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final UvmEntries zza;
    private final zzf zzb;
    private final AuthenticationExtensionsCredPropsOutputs zzc;
    private final zzh zzd;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzf2, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzh2) {
        this.zza = uvmEntries;
        this.zzb = zzf2;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzh2;
    }

    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (AuthenticationExtensionsClientOutputs)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthenticationExtensionsClientOutputs;
        if (!bl3) {
            return false;
        }
        object = (AuthenticationExtensionsClientOutputs)object;
        AbstractSafeParcelable abstractSafeParcelable = this.zza;
        AbstractSafeParcelable abstractSafeParcelable2 = ((AuthenticationExtensionsClientOutputs)object).zza;
        bl3 = Objects.equal(abstractSafeParcelable, abstractSafeParcelable2);
        return bl3 && (bl3 = Objects.equal(abstractSafeParcelable = this.zzb, abstractSafeParcelable2 = ((AuthenticationExtensionsClientOutputs)object).zzb)) && (bl3 = Objects.equal(abstractSafeParcelable = this.zzc, abstractSafeParcelable2 = ((AuthenticationExtensionsClientOutputs)object).zzc)) && (bl2 = Objects.equal(abstractSafeParcelable = this.zzd, object = ((AuthenticationExtensionsClientOutputs)object).zzd));
    }

    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        UvmEntries uvmEntries = this.zza;
        zzf zzf2 = this.zzb;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzc;
        zzh zzh2 = this.zzd;
        Object[] objectArray = new Object[]{uvmEntries, zzf2, authenticationExtensionsCredPropsOutputs, zzh2};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        UvmEntries uvmEntries = this.getUvmEntries();
        SafeParcelWriter.writeParcelable(parcel, 1, uvmEntries, n3, false);
        AbstractSafeParcelable abstractSafeParcelable = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 2, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.getCredProps();
        SafeParcelWriter.writeParcelable(parcel, 3, abstractSafeParcelable, n3, false);
        abstractSafeParcelable = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, abstractSafeParcelable, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

