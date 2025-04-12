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
import com.google.android.gms.fido.fido2.api.common.zzt;
import java.util.HashSet;
import java.util.List;

public final class zzs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zza;

    static {
        zzt zzt2 = new zzt();
        CREATOR = zzt2;
    }

    public zzs(List list) {
        this.zza = list = (List)Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzs;
        if (!bl3) {
            return false;
        }
        object = (zzs)object;
        List list = this.zza;
        List list2 = ((zzs)object).zza;
        bl3 = list.containsAll(list2);
        return bl3 && (bl2 = (object = ((zzs)object).zza).containsAll(list = this.zza));
    }

    public final int hashCode() {
        Object[] objectArray = this.zza;
        HashSet hashSet = new HashSet(objectArray);
        objectArray = new Object[]{hashSet};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.zza;
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

