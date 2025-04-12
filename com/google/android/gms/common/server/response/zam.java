/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.zak;

public final class zam
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    final String zab;
    final FastJsonResponse$Field zac;

    static {
        zak zak2 = new zak();
        CREATOR = zak2;
    }

    public zam(int n3, String string2, FastJsonResponse$Field fastJsonResponse$Field) {
        this.zaa = n3;
        this.zab = string2;
        this.zac = fastJsonResponse$Field;
    }

    public zam(String string2, FastJsonResponse$Field fastJsonResponse$Field) {
        this.zaa = 1;
        this.zab = string2;
        this.zac = fastJsonResponse$Field;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zab;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        FastJsonResponse$Field fastJsonResponse$Field = this.zac;
        SafeParcelWriter.writeParcelable(parcel, 3, fastJsonResponse$Field, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

