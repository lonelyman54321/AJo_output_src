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
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Scope
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    private final String zzb;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public Scope(int n3, String string2) {
        Preconditions.checkNotEmpty(string2, "scopeUri must not be null or empty");
        this.zza = n3;
        this.zzb = string2;
    }

    public Scope(String string2) {
        this(1, string2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof Scope;
        if (!bl2) {
            return false;
        }
        String string2 = this.zzb;
        object = ((Scope)object).zzb;
        return string2.equals(object);
    }

    public String getScopeUri() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.getScopeUri();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

