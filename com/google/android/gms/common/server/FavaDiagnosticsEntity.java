/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.zaa;

public class FavaDiagnosticsEntity
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    public final String zab;
    public final int zac;

    static {
        zaa zaa2 = new zaa();
        CREATOR = zaa2;
    }

    public FavaDiagnosticsEntity(int n3, String string2, int n4) {
        this.zaa = n3;
        this.zab = string2;
        this.zac = n4;
    }

    public FavaDiagnosticsEntity(String string2, int n3) {
        this.zaa = 1;
        this.zab = string2;
        this.zac = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zaa;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.zab;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int n7 = this.zac;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

