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
import com.google.android.gms.fido.fido2.api.common.zzj;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

public class AuthenticatorAssertionResponse
extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public AuthenticatorAssertionResponse(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        this.zza = byArray;
        byArray = (byte[])Preconditions.checkNotNull(byArray2);
        this.zzb = byArray;
        byArray = (byte[])Preconditions.checkNotNull(byArray3);
        this.zzc = byArray;
        byArray = (byte[])Preconditions.checkNotNull(byArray4);
        this.zzd = byArray;
        this.zze = byArray5;
    }

    public static AuthenticatorAssertionResponse deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (AuthenticatorAssertionResponse)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthenticatorAssertionResponse;
        if (!bl3) {
            return false;
        }
        object = (AuthenticatorAssertionResponse)object;
        byte[] byArray = this.zza;
        byte[] byArray2 = ((AuthenticatorAssertionResponse)object).zza;
        bl3 = Arrays.equals(byArray, byArray2);
        return bl3 && (bl3 = Arrays.equals(byArray = this.zzb, byArray2 = ((AuthenticatorAssertionResponse)object).zzb)) && (bl3 = Arrays.equals(byArray = this.zzc, byArray2 = ((AuthenticatorAssertionResponse)object).zzc)) && (bl3 = Arrays.equals(byArray = this.zzd, byArray2 = ((AuthenticatorAssertionResponse)object).zzd)) && (bl2 = Arrays.equals(byArray = this.zze, (byte[])(object = (Object)((AuthenticatorAssertionResponse)object).zze)));
    }

    public byte[] getAuthenticatorData() {
        return this.zzc;
    }

    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignature() {
        return this.zzd;
    }

    public byte[] getUserHandle() {
        return this.zze;
    }

    public int hashCode() {
        Integer n3 = Arrays.hashCode(this.zza);
        Integer n4 = Arrays.hashCode(this.zzb);
        Integer n7 = Arrays.hashCode(this.zzc);
        Integer n8 = Arrays.hashCode(this.zzd);
        Integer n10 = Arrays.hashCode(this.zze);
        Object[] objectArray = new Object[]{n3, n4, n7, n8, n10};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        Object object = zzbf.zzd();
        Object object2 = this.zza;
        int n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb("keyHandle", object);
        object = zzbf.zzd();
        object2 = this.zzb;
        n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb("clientDataJSON", object);
        object = zzbf.zzd();
        object2 = this.zzc;
        n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb("authenticatorData", object);
        object = zzbf.zzd();
        object2 = this.zzd;
        n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        object2 = "signature";
        zzaj2.zzb((String)object2, object);
        object = this.zze;
        if (object != null) {
            int n4 = ((Object)object).length;
            zzbf zzbf2 = zzbf.zzd();
            object = zzbf2.zze((byte[])object, 0, n4);
            object2 = "userHandle";
            zzaj2.zzb((String)object2, object);
        }
        return zzaj2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] byArray = this.getKeyHandle();
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        byte[] byArray2 = this.getClientDataJSON();
        SafeParcelWriter.writeByteArray(parcel, 3, byArray2, false);
        byArray2 = this.getAuthenticatorData();
        SafeParcelWriter.writeByteArray(parcel, 4, byArray2, false);
        byArray2 = this.getSignature();
        SafeParcelWriter.writeByteArray(parcel, 5, byArray2, false);
        byArray2 = this.getUserHandle();
        SafeParcelWriter.writeByteArray(parcel, 6, byArray2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

