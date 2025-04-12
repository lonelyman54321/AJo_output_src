/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.zzc;

public class Feature
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final int zzb;
    private final long zzc;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public Feature(String string2, int n3, long l2) {
        this.zza = string2;
        this.zzb = n3;
        this.zzc = l2;
    }

    public Feature(String string2, long l2) {
        this.zza = string2;
        this.zzc = l2;
        this.zzb = -1;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Feature;
        if (bl2) {
            long l2;
            long l3;
            long l4;
            long l7;
            String string2;
            object = (Feature)object;
            String string3 = this.getName();
            if ((string3 != null && (bl2 = (string3 = this.getName()).equals(string2 = ((Feature)object).getName())) || (string3 = this.getName()) == null && (string3 = ((Feature)object).getName()) == null) && (l7 = (l4 = (l3 = this.getVersion()) - (l2 = ((Feature)object).getVersion())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.zza;
    }

    public long getVersion() {
        long l2 = this.zzc;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            int n3 = this.zzb;
            l2 = n3;
        }
        return l2;
    }

    public final int hashCode() {
        String string2 = this.getName();
        Long l2 = this.getVersion();
        Object[] objectArray = new Object[]{string2, l2};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        String string2 = this.getName();
        objects$ToStringHelper.add("name", string2);
        Long l2 = this.getVersion();
        objects$ToStringHelper.add("version", l2);
        return objects$ToStringHelper.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getName();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        int n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        long l2 = this.getVersion();
        SafeParcelWriter.writeLong(parcel, 3, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

