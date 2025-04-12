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
import com.google.android.gms.fido.fido2.api.common.zzy;
import java.util.Arrays;

public class FidoCredentialDetails
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        zzy zzy2 = new zzy();
        CREATOR = zzy2;
    }

    public FidoCredentialDetails(String string2, String string3, byte[] byArray, byte[] byArray2, boolean bl2, boolean bl3) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = byArray;
        this.zzd = byArray2;
        this.zze = bl2;
        this.zzf = bl3;
    }

    public static FidoCredentialDetails deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (FidoCredentialDetails)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = object instanceof FidoCredentialDetails;
        if (!bl4) {
            return false;
        }
        object = (FidoCredentialDetails)object;
        Object object2 = this.zza;
        Object object3 = ((FidoCredentialDetails)object).zza;
        bl4 = Objects.equal(object2, object3);
        return bl4 && (bl4 = Objects.equal(object2 = this.zzb, object3 = ((FidoCredentialDetails)object).zzb)) && (bl4 = Arrays.equals((byte[])(object2 = (Object)this.zzc), (byte[])(object3 = (Object)((FidoCredentialDetails)object).zzc))) && (bl4 = Arrays.equals((byte[])(object2 = (Object)this.zzd), (byte[])(object3 = (Object)((FidoCredentialDetails)object).zzd))) && (bl4 = this.zze) == (bl3 = ((FidoCredentialDetails)object).zze) && (bl4 = this.zzf) == (bl2 = ((FidoCredentialDetails)object).zzf);
    }

    public byte[] getCredentialId() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public String getUserDisplayName() {
        return this.zzb;
    }

    public byte[] getUserId() {
        return this.zzc;
    }

    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        String string2 = this.zza;
        String string3 = this.zzb;
        byte[] byArray = this.zzc;
        byte[] byArray2 = this.zzd;
        Boolean bl2 = this.zze;
        Boolean bl3 = this.zzf;
        Object[] objectArray = new Object[]{string2, string3, byArray, byArray2, bl2, bl3};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getUserName();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.getUserDisplayName();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.getUserId();
        SafeParcelWriter.writeByteArray(parcel, 3, (byte[])object, false);
        object = this.getCredentialId();
        SafeParcelWriter.writeByteArray(parcel, 4, (byte[])object, false);
        boolean bl2 = this.getIsDiscoverable();
        SafeParcelWriter.writeBoolean(parcel, 5, bl2);
        bl2 = this.getIsPaymentCredential();
        SafeParcelWriter.writeBoolean(parcel, 6, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

