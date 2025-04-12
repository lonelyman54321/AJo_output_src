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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.zzam;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PublicKeyCredentialDescriptor
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private static final zzau zza;
    private final PublicKeyCredentialType zzb;
    private final byte[] zzc;
    private final List zzd;

    static {
        Object object = zzh.zza;
        zzbj zzbj2 = zzh.zzb;
        zza = zzau.zzi(object, zzbj2);
        object = new zzam();
        CREATOR = object;
    }

    public PublicKeyCredentialDescriptor(String object, byte[] object2, List list) {
        Preconditions.checkNotNull(object);
        try {
            object = PublicKeyCredentialType.fromString(object);
        }
        catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException publicKeyCredentialType$UnsupportedPublicKeyCredTypeException) {
            object2 = new IllegalArgumentException;
            super(publicKeyCredentialType$UnsupportedPublicKeyCredTypeException);
            throw object2;
        }
        this.zzb = object;
        object = (byte[])Preconditions.checkNotNull(object2);
        this.zzc = (byte[])object;
        this.zzd = list;
    }

    public boolean equals(Object object) {
        boolean bl2;
        List list;
        boolean bl3 = object instanceof PublicKeyCredentialDescriptor;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialDescriptor)object;
        Object object2 = this.zzb;
        Object object3 = ((PublicKeyCredentialDescriptor)object).zzb;
        bl3 = ((Object)object2).equals(object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zzc;
        object3 = ((PublicKeyCredentialDescriptor)object).zzc;
        bl3 = Arrays.equals((byte[])object2, (byte[])object3);
        if (!bl3) {
            return false;
        }
        object2 = this.zzd;
        boolean bl4 = true;
        if (object2 == null && (list = ((PublicKeyCredentialDescriptor)object).zzd) == null) {
            return bl4;
        }
        if (object2 != null && (list = ((PublicKeyCredentialDescriptor)object).zzd) != null && (bl3 = object2.containsAll(list)) && (bl2 = (object = ((PublicKeyCredentialDescriptor)object).zzd).containsAll((Collection<?>)(object2 = this.zzd)))) {
            return bl4;
        }
        return false;
    }

    public byte[] getId() {
        return this.zzc;
    }

    public List getTransports() {
        return this.zzd;
    }

    public PublicKeyCredentialType getType() {
        return this.zzb;
    }

    public String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        PublicKeyCredentialType publicKeyCredentialType = this.zzb;
        Integer n3 = Arrays.hashCode(this.zzc);
        List list = this.zzd;
        Object[] objectArray = new Object[]{publicKeyCredentialType, n3, list};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getTypeAsString();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.getId();
        SafeParcelWriter.writeByteArray(parcel, 3, object, false);
        object = this.getTransports();
        SafeParcelWriter.writeTypedList(parcel, 4, (List)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

