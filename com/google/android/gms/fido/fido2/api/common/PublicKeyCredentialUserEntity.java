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
import com.google.android.gms.fido.fido2.api.common.zzar;
import java.util.Arrays;

public class PublicKeyCredentialUserEntity
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    static {
        zzar zzar2 = new zzar();
        CREATOR = zzar2;
    }

    public PublicKeyCredentialUserEntity(byte[] object, String string2, String string3, String string4) {
        object = (byte[])Preconditions.checkNotNull(object);
        this.zza = object;
        object = (String)Preconditions.checkNotNull(string2);
        this.zzb = object;
        this.zzc = string3;
        object = (String)Preconditions.checkNotNull(string4);
        this.zzd = object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredentialUserEntity;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialUserEntity)object;
        Object object2 = this.zza;
        Object object3 = ((PublicKeyCredentialUserEntity)object).zza;
        bl3 = Arrays.equals(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = (Object)this.zzb, object3 = (Object)((PublicKeyCredentialUserEntity)object).zzb)) && (bl3 = Objects.equal(object2 = (Object)this.zzc, object3 = (Object)((PublicKeyCredentialUserEntity)object).zzc)) && (bl2 = Objects.equal(object2 = (Object)this.zzd, object = ((PublicKeyCredentialUserEntity)object).zzd));
    }

    public String getDisplayName() {
        return this.zzd;
    }

    public String getIcon() {
        return this.zzc;
    }

    public byte[] getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        byte[] byArray = this.zza;
        String string2 = this.zzb;
        String string3 = this.zzc;
        String string4 = this.zzd;
        Object[] objectArray = new Object[]{byArray, string2, string3, string4};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] byArray = this.getId();
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        String string2 = this.getName();
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        string2 = this.getIcon();
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        string2 = this.getDisplayName();
        SafeParcelWriter.writeString(parcel, 5, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

