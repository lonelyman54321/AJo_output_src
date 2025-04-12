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
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzak;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PublicKeyCredentialCreationOptions
extends RequestOptions {
    public static final Parcelable.Creator CREATOR;
    private final PublicKeyCredentialRpEntity zza;
    private final PublicKeyCredentialUserEntity zzb;
    private final byte[] zzc;
    private final List zzd;
    private final Double zze;
    private final List zzf;
    private final AuthenticatorSelectionCriteria zzg;
    private final Integer zzh;
    private final TokenBinding zzi;
    private final AttestationConveyancePreference zzj;
    private final AuthenticationExtensions zzk;

    static {
        zzak zzak2 = new zzak();
        CREATOR = zzak2;
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity object, PublicKeyCredentialUserEntity object2, byte[] byArray, List list, Double d2, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer n3, TokenBinding tokenBinding, String string2, AuthenticationExtensions authenticationExtensions) {
        object = (PublicKeyCredentialRpEntity)Preconditions.checkNotNull(object);
        this.zza = object;
        object = (PublicKeyCredentialUserEntity)Preconditions.checkNotNull(object2);
        this.zzb = object;
        object = (byte[])Preconditions.checkNotNull(byArray);
        this.zzc = (byte[])object;
        this.zzd = object = (List)Preconditions.checkNotNull(list);
        this.zze = d2;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = n3;
        this.zzi = tokenBinding;
        if (string2 != null) {
            try {
                object = AttestationConveyancePreference.fromString(string2);
            }
            catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException attestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException) {
                object2 = new IllegalArgumentException(attestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException);
                throw object2;
            }
            this.zzj = object;
        } else {
            object = null;
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
    }

    public static PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (PublicKeyCredentialCreationOptions)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredentialCreationOptions;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialCreationOptions)object;
        Object object2 = this.zza;
        Object object3 = ((PublicKeyCredentialCreationOptions)object).zza;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = this.zzb, object3 = ((PublicKeyCredentialCreationOptions)object).zzb)) && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zzc), (byte[])(object3 = (Object)((PublicKeyCredentialCreationOptions)object).zzc))) && (bl3 = Objects.equal(object2 = this.zze, object3 = ((PublicKeyCredentialCreationOptions)object).zze)) && (bl3 = (object2 = this.zzd).containsAll((Collection<?>)(object3 = ((PublicKeyCredentialCreationOptions)object).zzd))) && (bl3 = (object2 = ((PublicKeyCredentialCreationOptions)object).zzd).containsAll((Collection<?>)(object3 = this.zzd))) && ((object2 = this.zzf) == null && (object3 = ((PublicKeyCredentialCreationOptions)object).zzf) == null || object2 != null && (object3 = ((PublicKeyCredentialCreationOptions)object).zzf) != null && (bl3 = object2.containsAll((Collection<?>)object3)) && (bl3 = (object2 = ((PublicKeyCredentialCreationOptions)object).zzf).containsAll((Collection<?>)(object3 = this.zzf)))) && (bl3 = Objects.equal(object2 = this.zzg, object3 = ((PublicKeyCredentialCreationOptions)object).zzg)) && (bl3 = Objects.equal(object2 = this.zzh, object3 = ((PublicKeyCredentialCreationOptions)object).zzh)) && (bl3 = Objects.equal(object2 = this.zzi, object3 = ((PublicKeyCredentialCreationOptions)object).zzi)) && (bl3 = Objects.equal(object2 = this.zzj, object3 = ((PublicKeyCredentialCreationOptions)object).zzj)) && (bl2 = Objects.equal(object2 = this.zzk, object = ((PublicKeyCredentialCreationOptions)object).zzk));
    }

    public AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.zzj;
    }

    public String getAttestationConveyancePreferenceAsString() {
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzk;
    }

    public AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.zzg;
    }

    public byte[] getChallenge() {
        return this.zzc;
    }

    public List getExcludeList() {
        return this.zzf;
    }

    public List getParameters() {
        return this.zzd;
    }

    public Integer getRequestId() {
        return this.zzh;
    }

    public PublicKeyCredentialRpEntity getRp() {
        return this.zza;
    }

    public Double getTimeoutSeconds() {
        return this.zze;
    }

    public TokenBinding getTokenBinding() {
        return this.zzi;
    }

    public PublicKeyCredentialUserEntity getUser() {
        return this.zzb;
    }

    public int hashCode() {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.zza;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.zzb;
        Integer n3 = Arrays.hashCode(this.zzc);
        List list = this.zzd;
        Double d2 = this.zze;
        List list2 = this.zzf;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.zzg;
        Integer n4 = this.zzh;
        TokenBinding tokenBinding = this.zzi;
        AttestationConveyancePreference attestationConveyancePreference = this.zzj;
        AuthenticationExtensions authenticationExtensions = this.zzk;
        Object[] objectArray = new Object[]{publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, n3, list, d2, list2, authenticatorSelectionCriteria, n4, tokenBinding, attestationConveyancePreference, authenticationExtensions};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.getRp();
        SafeParcelWriter.writeParcelable(parcel, 2, publicKeyCredentialRpEntity, n3, false);
        Object object = this.getUser();
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        object = this.getChallenge();
        SafeParcelWriter.writeByteArray(parcel, 4, (byte[])object, false);
        object = this.getParameters();
        SafeParcelWriter.writeTypedList(parcel, 5, (List)object, false);
        object = this.getTimeoutSeconds();
        SafeParcelWriter.writeDoubleObject(parcel, 6, (Double)object, false);
        object = this.getExcludeList();
        SafeParcelWriter.writeTypedList(parcel, 7, (List)object, false);
        object = this.getAuthenticatorSelection();
        SafeParcelWriter.writeParcelable(parcel, 8, (Parcelable)object, n3, false);
        object = this.getRequestId();
        SafeParcelWriter.writeIntegerObject(parcel, 9, (Integer)object, false);
        object = this.getTokenBinding();
        SafeParcelWriter.writeParcelable(parcel, 10, (Parcelable)object, n3, false);
        object = this.getAttestationConveyancePreferenceAsString();
        SafeParcelWriter.writeString(parcel, 11, (String)object, false);
        object = this.getAuthenticationExtensions();
        SafeParcelWriter.writeParcelable(parcel, 12, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

