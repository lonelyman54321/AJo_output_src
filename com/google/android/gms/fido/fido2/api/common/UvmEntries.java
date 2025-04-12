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
import com.google.android.gms.fido.fido2.api.common.zzaz;
import java.util.HashSet;
import java.util.List;

public class UvmEntries
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zza;

    static {
        zzaz zzaz2 = new zzaz();
        CREATOR = zzaz2;
    }

    public UvmEntries(List list) {
        this.zza = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        List list;
        boolean bl2 = object instanceof UvmEntries;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (UvmEntries)object;
        List list2 = this.zza;
        if (list2 == null) {
            list = ((UvmEntries)object).zza;
            if (list == null) return true;
        }
        if (list2 == null) return bl3;
        list = ((UvmEntries)object).zza;
        if (list == null) return bl3;
        bl2 = list2.containsAll(list);
        if (!bl2) return bl3;
        object = ((UvmEntries)object).zza;
        list2 = this.zza;
        boolean bl4 = object.containsAll(list2);
        if (!bl4) return bl3;
        return true;
    }

    public List getUvmEntryList() {
        return this.zza;
    }

    public int hashCode() {
        Object[] objectArray = this.zza;
        HashSet hashSet = new HashSet(objectArray);
        objectArray = new Object[]{hashSet};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.getUvmEntryList();
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

