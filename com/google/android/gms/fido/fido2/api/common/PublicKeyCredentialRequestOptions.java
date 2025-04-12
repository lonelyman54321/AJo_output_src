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
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzao;
import com.google.android.gms.fido.fido2.api.common.zzax;
import com.google.android.gms.fido.fido2.api.common.zzay;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PublicKeyCredentialRequestOptions
extends RequestOptions {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final Double zzb;
    private final String zzc;
    private final List zzd;
    private final Integer zze;
    private final TokenBinding zzf;
    private final zzay zzg;
    private final AuthenticationExtensions zzh;
    private final Long zzi;

    static {
        zzao zzao2 = new zzao();
        CREATOR = zzao2;
    }

    public PublicKeyCredentialRequestOptions(byte[] object, Double serializable, String string2, List list, Integer n3, TokenBinding tokenBinding, String string3, AuthenticationExtensions authenticationExtensions, Long l2) {
        object = (byte[])Preconditions.checkNotNull(object);
        this.zza = object;
        this.zzb = serializable;
        object = (String)Preconditions.checkNotNull(string2);
        this.zzc = object;
        this.zzd = list;
        this.zze = n3;
        this.zzf = tokenBinding;
        this.zzi = l2;
        if (string3 != null) {
            try {
                object = (Object)zzay.zza(string3);
            }
            catch (zzax zzax2) {
                super(zzax2);
                throw serializable;
            }
            this.zzg = (zzay)((Object)object);
        } else {
            object = null;
            this.zzg = null;
        }
        this.zzh = authenticationExtensions;
    }

    public static PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (PublicKeyCredentialRequestOptions)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredentialRequestOptions;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialRequestOptions)object;
        Object object2 = this.zza;
        Object object3 = ((PublicKeyCredentialRequestOptions)object).zza;
        bl3 = Arrays.equals(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = (Object)this.zzb, object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzb)) && (bl3 = Objects.equal(object2 = (Object)this.zzc, object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzc)) && ((object2 = (Object)this.zzd) == null && (object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzd) == null || object2 != null && (object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzd) != null && (bl3 = object2.containsAll((Collection<?>)object3)) && (bl3 = (object2 = ((PublicKeyCredentialRequestOptions)object).zzd).containsAll((Collection<?>)(object3 = (Object)this.zzd)))) && (bl3 = Objects.equal(object2 = (Object)this.zze, object3 = (Object)((PublicKeyCredentialRequestOptions)object).zze)) && (bl3 = Objects.equal(object2 = this.zzf, object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzf)) && (bl3 = Objects.equal(object2 = this.zzg, object3 = (Object)((Object)((PublicKeyCredentialRequestOptions)object).zzg))) && (bl3 = Objects.equal(object2 = (Object)this.zzh, object3 = (Object)((PublicKeyCredentialRequestOptions)object).zzh)) && (bl2 = Objects.equal(object2 = (Object)this.zzi, object = ((PublicKeyCredentialRequestOptions)object).zzi));
    }

    public List getAllowList() {
        return this.zzd;
    }

    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    public byte[] getChallenge() {
        return this.zza;
    }

    public Integer getRequestId() {
        return this.zze;
    }

    public String getRpId() {
        return this.zzc;
    }

    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    public TokenBinding getTokenBinding() {
        return this.zzf;
    }

    public int hashCode() {
        Integer n3 = Arrays.hashCode(this.zza);
        Double d2 = this.zzb;
        String string2 = this.zzc;
        List list = this.zzd;
        Integer n4 = this.zze;
        TokenBinding tokenBinding = this.zzf;
        zzay zzay2 = this.zzg;
        AuthenticationExtensions authenticationExtensions = this.zzh;
        Long l2 = this.zzi;
        Object[] objectArray = new Object[]{n3, d2, string2, list, n4, tokenBinding, zzay2, authenticationExtensions, l2};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getChallenge();
        int n7 = 2;
        SafeParcelWriter.writeByteArray(parcel, n7, (byte[])object, false);
        Object object2 = this.getTimeoutSeconds();
        SafeParcelWriter.writeDoubleObject(parcel, 3, (Double)object2, false);
        object2 = this.getRpId();
        SafeParcelWriter.writeString(parcel, 4, (String)object2, false);
        object2 = this.getAllowList();
        SafeParcelWriter.writeTypedList(parcel, 5, (List)object2, false);
        object2 = this.getRequestId();
        SafeParcelWriter.writeIntegerObject(parcel, 6, (Integer)object2, false);
        int n8 = 7;
        object2 = this.getTokenBinding();
        SafeParcelWriter.writeParcelable(parcel, n8, (Parcelable)object2, n3, false);
        object = (Object)this.zzg;
        if (object == null) {
            n8 = 0;
            object = null;
        } else {
            object = ((zzay)((Object)object)).toString();
        }
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        object2 = this.getAuthenticationExtensions();
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)object2, n3, false);
        object = this.zzi;
        SafeParcelWriter.writeLongObject(parcel, 10, (Long)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final zzay zza() {
        return this.zzg;
    }
}

