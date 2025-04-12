/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;

public final class zaa
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final StringToIntConverter zab;

    static {
        zab zab2 = new zab();
        CREATOR = zab2;
    }

    public zaa(int n3, StringToIntConverter stringToIntConverter) {
        this.zaa = n3;
        this.zab = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.zaa = 1;
        this.zab = stringToIntConverter;
    }

    public static zaa zaa(FastJsonResponse$FieldConverter object) {
        boolean bl2 = object instanceof StringToIntConverter;
        if (bl2) {
            object = (StringToIntConverter)object;
            zaa zaa2 = new zaa((StringToIntConverter)object);
            return zaa2;
        }
        object = new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        throw object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        StringToIntConverter stringToIntConverter = this.zab;
        SafeParcelWriter.writeParcelable(parcel, 2, stringToIntConverter, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }

    public final FastJsonResponse$FieldConverter zab() {
        Object object = this.zab;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        throw object;
    }
}

