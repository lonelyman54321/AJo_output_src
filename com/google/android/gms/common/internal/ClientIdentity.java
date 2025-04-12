/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zaa;

public class ClientIdentity
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String packageName;
    public final int uid;

    static {
        zaa zaa2 = new zaa();
        CREATOR = zaa2;
    }

    public ClientIdentity(int n3, String string2) {
        this.uid = n3;
        this.packageName = string2;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        int n3 = object instanceof ClientIdentity;
        if (n3 == 0) {
            return false;
        }
        object = (ClientIdentity)object;
        n3 = ((ClientIdentity)object).uid;
        int n4 = this.uid;
        if (n3 == n4 && (bl2 = Objects.equal(object = ((ClientIdentity)object).packageName, string2 = this.packageName))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.uid;
        stringBuilder.append(n3);
        stringBuilder.append(":");
        String string2 = this.packageName;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.uid;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.packageName;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

