/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.zzal;
import java.util.Arrays;

public class PublicKeyCredential
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final byte[] zzc;
    private final AuthenticatorAttestationResponse zzd;
    private final AuthenticatorAssertionResponse zze;
    private final AuthenticatorErrorResponse zzf;
    private final AuthenticationExtensionsClientOutputs zzg;
    private final String zzh;

    static {
        zzal zzal2 = new zzal();
        CREATOR = zzal2;
    }

    public PublicKeyCredential(String string2, String string3, byte[] byArray, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String string4) {
        boolean bl2 = true;
        if (!(authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null || authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null || authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null)) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2);
        this.zza = string2;
        this.zzb = string3;
        this.zzc = byArray;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = string4;
    }

    public static PublicKeyCredential deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (PublicKeyCredential)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredential;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredential)object;
        Object object2 = this.zza;
        Object object3 = ((PublicKeyCredential)object).zza;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = this.zzb, object3 = ((PublicKeyCredential)object).zzb)) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzc), (byte[])(object3 = (Object)((PublicKeyCredential)object).zzc))) && (bl3 = Objects.equal(object2 = this.zzd, object3 = ((PublicKeyCredential)object).zzd)) && (bl3 = Objects.equal(object2 = this.zze, object3 = ((PublicKeyCredential)object).zze)) && (bl3 = Objects.equal(object2 = this.zzf, object3 = ((PublicKeyCredential)object).zzf)) && (bl3 = Objects.equal(object2 = this.zzg, object3 = ((PublicKeyCredential)object).zzg)) && (bl2 = Objects.equal(object2 = this.zzh, object = ((PublicKeyCredential)object).zzh));
    }

    public String getAuthenticatorAttachment() {
        return this.zzh;
    }

    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.zzg;
    }

    public String getId() {
        return this.zza;
    }

    public byte[] getRawId() {
        return this.zzc;
    }

    public AuthenticatorResponse getResponse() {
        Object object = this.zzd;
        if (object != null) {
            return object;
        }
        object = this.zze;
        if (object != null) {
            return object;
        }
        object = this.zzf;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("No response set.");
        throw object;
    }

    public String getType() {
        return this.zzb;
    }

    public int hashCode() {
        String string2 = this.zza;
        String string3 = this.zzb;
        byte[] byArray = this.zzc;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.zzg;
        String string4 = this.zzh;
        Object[] objectArray = new Object[]{string2, string3, byArray, authenticatorAssertionResponse, authenticatorAttestationResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, string4};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getId();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.getType();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.getRawId();
        SafeParcelWriter.writeByteArray(parcel, 3, (byte[])object, false);
        object = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        object = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)object, n3, false);
        object = this.zzf;
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)object, n3, false);
        object = this.getClientExtensionResults();
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object, n3, false);
        string2 = this.getAuthenticatorAttachment();
        SafeParcelWriter.writeString(parcel, 8, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

