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
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.zzan;

public class PublicKeyCredentialParameters
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PublicKeyCredentialType zza;
    private final COSEAlgorithmIdentifier zzb;

    static {
        zzan zzan2 = new zzan();
        CREATOR = zzan2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKeyCredentialParameters(String object, int n3) {
        Preconditions.checkNotNull(object);
        try {
            object = PublicKeyCredentialType.fromString(object);
            this.zza = object;
        }
        catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException publicKeyCredentialType$UnsupportedPublicKeyCredTypeException) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(publicKeyCredentialType$UnsupportedPublicKeyCredTypeException);
            throw illegalArgumentException;
        }
        object = n3;
        Preconditions.checkNotNull(object);
        try {
            object = COSEAlgorithmIdentifier.fromCoseValue(n3);
            this.zzb = object;
            return;
        }
        catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException cOSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(cOSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException);
            throw illegalArgumentException;
        }
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredentialParameters;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialParameters)object;
        Parcelable parcelable = this.zza;
        PublicKeyCredentialType publicKeyCredentialType = ((PublicKeyCredentialParameters)object).zza;
        bl3 = parcelable.equals((Object)publicKeyCredentialType);
        return bl3 && (bl2 = (parcelable = this.zzb).equals(object = ((PublicKeyCredentialParameters)object).zzb));
    }

    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        PublicKeyCredentialType publicKeyCredentialType = this.zza;
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.zzb;
        Object[] objectArray = new Object[]{publicKeyCredentialType, cOSEAlgorithmIdentifier};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getTypeAsString();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.getAlgorithmIdAsInteger();
        SafeParcelWriter.writeIntegerObject(parcel, 3, (Integer)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

