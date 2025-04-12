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
import com.google.android.gms.fido.fido2.api.common.zzap;

public class PublicKeyCredentialRpEntity
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final String zzc;

    static {
        zzap zzap2 = new zzap();
        CREATOR = zzap2;
    }

    public PublicKeyCredentialRpEntity(String string2, String string3, String string4) {
        this.zza = string2 = (String)Preconditions.checkNotNull(string2);
        this.zzb = string2 = (String)Preconditions.checkNotNull(string3);
        this.zzc = string4;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PublicKeyCredentialRpEntity;
        if (!bl3) {
            return false;
        }
        object = (PublicKeyCredentialRpEntity)object;
        String string2 = this.zza;
        String string3 = ((PublicKeyCredentialRpEntity)object).zza;
        bl3 = Objects.equal(string2, string3);
        return bl3 && (bl3 = Objects.equal(string2 = this.zzb, string3 = ((PublicKeyCredentialRpEntity)object).zzb)) && (bl2 = Objects.equal(string2 = this.zzc, object = ((PublicKeyCredentialRpEntity)object).zzc));
    }

    public String getIcon() {
        return this.zzc;
    }

    public String getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = this.zzc;
        Object[] objectArray = new Object[]{string2, string3, string4};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getId();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.getName();
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        string3 = this.getIcon();
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

