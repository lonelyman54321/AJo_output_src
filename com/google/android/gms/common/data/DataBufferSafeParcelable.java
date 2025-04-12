/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolder$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DataBufferSafeParcelable
extends AbstractDataBuffer {
    private static final String[] zaa = new String[]{"data"};
    private final Parcelable.Creator zab;

    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator creator) {
        super(dataHolder);
        this.zab = creator;
    }

    public static void addValue(DataHolder$Builder dataHolder$Builder, SafeParcelable safeParcelable) {
        Parcel parcel = Parcel.obtain();
        safeParcelable.writeToParcel(parcel, 0);
        safeParcelable = new ContentValues();
        byte[] byArray = parcel.marshall();
        safeParcelable.put("data", byArray);
        dataHolder$Builder.withRow((ContentValues)safeParcelable);
        parcel.recycle();
    }

    public static DataHolder$Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    public SafeParcelable get(int n3) {
        DataHolder dataHolder = (DataHolder)Preconditions.checkNotNull(this.mDataHolder);
        int n4 = dataHolder.getWindowIndex(n3);
        Object object = dataHolder.getByteArray("data", n3, n4);
        dataHolder = Parcel.obtain();
        n4 = ((byte[])object).length;
        dataHolder.unmarshall((byte[])object, 0, n4);
        dataHolder.setDataPosition(0);
        object = (SafeParcelable)this.zab.createFromParcel((Parcel)dataHolder);
        dataHolder.recycle();
        return object;
    }
}

