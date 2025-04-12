/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zay;

public final class zax
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final int zab;
    private final int zac;
    private final Scope[] zad;

    static {
        zay zay2 = new zay();
        CREATOR = zay2;
    }

    public zax(int n3, int n4, int n7, Scope[] scopeArray) {
        this.zaa = n3;
        this.zab = n4;
        this.zac = n7;
        this.zad = scopeArray;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        int n8 = this.zab;
        SafeParcelWriter.writeInt(parcel, 2, n8);
        n8 = this.zac;
        SafeParcelWriter.writeInt(parcel, 3, n8);
        Parcelable[] parcelableArray = this.zad;
        SafeParcelWriter.writeTypedArray(parcel, 4, parcelableArray, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

