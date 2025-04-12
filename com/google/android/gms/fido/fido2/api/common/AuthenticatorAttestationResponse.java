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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.zzk;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

public class AuthenticatorAttestationResponse
extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final String[] zzd;

    static {
        zzk zzk2 = new zzk();
        CREATOR = zzk2;
    }

    public AuthenticatorAttestationResponse(byte[] objectArray, byte[] byArray, byte[] byArray2, String[] stringArray) {
        objectArray = (byte[])Preconditions.checkNotNull(objectArray);
        this.zza = objectArray;
        objectArray = (byte[])Preconditions.checkNotNull(byArray);
        this.zzb = objectArray;
        objectArray = (byte[])Preconditions.checkNotNull(byArray2);
        this.zzc = objectArray;
        objectArray = (String[])Preconditions.checkNotNull(stringArray);
        this.zzd = (String[])objectArray;
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (AuthenticatorAttestationResponse)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthenticatorAttestationResponse;
        if (!bl3) {
            return false;
        }
        object = (AuthenticatorAttestationResponse)object;
        byte[] byArray = this.zza;
        byte[] byArray2 = ((AuthenticatorAttestationResponse)object).zza;
        bl3 = Arrays.equals(byArray, byArray2);
        return bl3 && (bl3 = Arrays.equals(byArray = this.zzb, byArray2 = ((AuthenticatorAttestationResponse)object).zzb)) && (bl2 = Arrays.equals(byArray = this.zzc, (byte[])(object = (Object)((AuthenticatorAttestationResponse)object).zzc)));
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        Integer n3 = Arrays.hashCode(this.zza);
        Integer n4 = Arrays.hashCode(this.zzb);
        Integer n7 = Arrays.hashCode(this.zzc);
        Object[] objectArray = new Object[]{n3, n4, n7};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        Object object = zzbf.zzd();
        byte[] byArray = this.zza;
        int n3 = byArray.length;
        object = ((zzbf)object).zze(byArray, 0, n3);
        zzaj2.zzb("keyHandle", object);
        object = zzbf.zzd();
        byArray = this.zzb;
        n3 = byArray.length;
        object = ((zzbf)object).zze(byArray, 0, n3);
        zzaj2.zzb("clientDataJSON", object);
        object = zzbf.zzd();
        byArray = this.zzc;
        n3 = byArray.length;
        object = ((zzbf)object).zze(byArray, 0, n3);
        zzaj2.zzb("attestationObject", object);
        object = Arrays.toString(this.zzd);
        zzaj2.zzb("transports", object);
        return zzaj2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] byArray = this.getKeyHandle();
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        Object[] objectArray = this.getClientDataJSON();
        SafeParcelWriter.writeByteArray(parcel, 3, objectArray, false);
        objectArray = this.getAttestationObject();
        SafeParcelWriter.writeByteArray(parcel, 4, objectArray, false);
        objectArray = this.getTransports();
        SafeParcelWriter.writeStringArray(parcel, 5, (String[])objectArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

