/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata$Builder;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

public final class ApiMetadata
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = com.google.android.gms.common.api.zza.zza();
    private static final ApiMetadata zza = ApiMetadata.newBuilder().build();
    private final ComplianceOptions zzb;

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.zzb = complianceOptions;
    }

    public static final ApiMetadata fromComplianceOptions(ComplianceOptions complianceOptions) {
        ApiMetadata$Builder apiMetadata$Builder = ApiMetadata.newBuilder();
        apiMetadata$Builder.setComplianceOptions(complianceOptions);
        return apiMetadata$Builder.build();
    }

    public static final ApiMetadata getEmptyInstance() {
        return zza;
    }

    public static ApiMetadata$Builder newBuilder() {
        ApiMetadata$Builder apiMetadata$Builder = new ApiMetadata$Builder();
        return apiMetadata$Builder;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ApiMetadata;
        if (!bl2) {
            return false;
        }
        object = (ApiMetadata)object;
        ComplianceOptions complianceOptions = this.zzb;
        object = ((ApiMetadata)object).zzb;
        return Objects.equals(complianceOptions, object);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzb);
        return cP.a("ApiMetadata(complianceOptions=", string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.zzb;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, complianceOptions, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

