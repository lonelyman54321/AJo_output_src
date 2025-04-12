/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.plus.internal.zzl;

public class PlusCommonExtras
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzw;
    private String zzx;
    private String zzy;

    static {
        zzl zzl2 = new zzl();
        CREATOR = zzl2;
    }

    public PlusCommonExtras() {
        String string2;
        this.zzw = 1;
        this.zzx = string2 = "";
        this.zzy = string2;
    }

    public PlusCommonExtras(int n3, String string2, String string3) {
        this.zzw = n3;
        this.zzx = string2;
        this.zzy = string3;
    }

    public boolean equals(Object object) {
        boolean bl2;
        String string2;
        String string3;
        int n3 = object instanceof PlusCommonExtras;
        if (n3 == 0) {
            return false;
        }
        object = (PlusCommonExtras)object;
        n3 = this.zzw;
        int n4 = ((PlusCommonExtras)object).zzw;
        return n3 == n4 && (n3 = (int)(Objects.equal(string3 = this.zzx, string2 = ((PlusCommonExtras)object).zzx) ? 1 : 0)) != 0 && (bl2 = Objects.equal(string3 = this.zzy, object = ((PlusCommonExtras)object).zzy));
    }

    public int hashCode() {
        Integer n3 = this.zzw;
        String string2 = this.zzx;
        String string3 = this.zzy;
        Object[] objectArray = new Object[]{n3, string2, string3};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        Integer n3 = this.zzw;
        objects$ToStringHelper = objects$ToStringHelper.add("versionCode", n3);
        String string2 = this.zzx;
        objects$ToStringHelper = objects$ToStringHelper.add("Gpsrc", string2);
        string2 = this.zzy;
        return objects$ToStringHelper.add("ClientCallingPackage", string2).toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zzx;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.zzy;
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        int n4 = this.zzw;
        SafeParcelWriter.writeInt(parcel, 1000, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

