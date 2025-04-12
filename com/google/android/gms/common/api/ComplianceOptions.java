/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ComplianceOptions$Builder;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class ComplianceOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ComplianceOptions zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;

    static {
        Object object = ComplianceOptions.newBuilder();
        int n3 = -1;
        ((ComplianceOptions$Builder)object).setCallerProductId(n3);
        ((ComplianceOptions$Builder)object).setDataOwnerProductId(n3);
        ((ComplianceOptions$Builder)object).setProcessingReason(0);
        ((ComplianceOptions$Builder)object).setIsUserData(true);
        zza = ((ComplianceOptions$Builder)object).build();
        object = new zzc();
        CREATOR = object;
    }

    public ComplianceOptions(int n3, int n4, int n7, boolean bl2) {
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = bl2;
    }

    public static ComplianceOptions$Builder newBuilder() {
        ComplianceOptions$Builder complianceOptions$Builder = new ComplianceOptions$Builder();
        return complianceOptions$Builder;
    }

    public static final ComplianceOptions$Builder newBuilder(Context context) {
        return ComplianceOptions.newBuilder();
    }

    public final boolean equals(Object object) {
        int n3;
        int n4 = object instanceof ComplianceOptions;
        if (n4 == 0) {
            return false;
        }
        object = (ComplianceOptions)object;
        n4 = this.zzb;
        int n7 = ((ComplianceOptions)object).zzb;
        return n4 == n7 && (n4 = this.zzc) == (n7 = ((ComplianceOptions)object).zzc) && (n4 = this.zzd) == (n7 = ((ComplianceOptions)object).zzd) && (n4 = (int)(this.zze ? 1 : 0)) == (n3 = ((ComplianceOptions)object).zze);
    }

    public final int hashCode() {
        Integer n3 = this.zzb;
        Integer n4 = this.zzc;
        Integer n7 = this.zzd;
        Boolean bl2 = this.zze;
        Object[] objectArray = new Object[]{n3, n4, n7, bl2};
        return Objects.hashCode(objectArray);
    }

    public ComplianceOptions$Builder toBuilder() {
        ComplianceOptions$Builder complianceOptions$Builder = new ComplianceOptions$Builder();
        int bl2 = this.zzb;
        complianceOptions$Builder.setCallerProductId(bl2);
        int n3 = this.zzc;
        complianceOptions$Builder.setDataOwnerProductId(n3);
        int n4 = this.zzd;
        complianceOptions$Builder.setProcessingReason(n4);
        boolean bl3 = this.zze;
        complianceOptions$Builder.setIsUserData(bl3);
        return complianceOptions$Builder;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ComplianceOptions{callerProductId=");
        int bl2 = this.zzb;
        stringBuilder.append(bl2);
        stringBuilder.append(", dataOwnerProductId=");
        int n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append(", processingReason=");
        int n4 = this.zzd;
        stringBuilder.append(n4);
        stringBuilder.append(", isUserData=");
        boolean bl3 = this.zze;
        return Vm.a("}", bl3, stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzb;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int bl2 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        int n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        boolean bl3 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 4, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

