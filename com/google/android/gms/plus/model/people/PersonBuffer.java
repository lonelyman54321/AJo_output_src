/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.plus.model.people;

import android.os.Parcelable;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.plus.zzac;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.model.people.Person;

public final class PersonBuffer
extends AbstractDataBuffer {
    private final DataBufferSafeParcelable zzcm;

    public PersonBuffer(DataHolder dataHolder) {
        super(dataHolder);
        String string2;
        boolean bl2;
        Object object = dataHolder.getMetadata();
        if (object != null && (bl2 = (object = dataHolder.getMetadata()).getBoolean(string2 = "com.google.android.gms.plus.IsSafeParcelable", false))) {
            string2 = zzr.CREATOR;
            super(dataHolder, (Parcelable.Creator)string2);
            this.zzcm = object;
            return;
        }
        this.zzcm = null;
    }

    public final Person get(int n3) {
        Object object = this.zzcm;
        if (object != null) {
            return (Person)((Object)((DataBufferSafeParcelable)object).get(n3));
        }
        DataHolder dataHolder = this.mDataHolder;
        object = new zzac(dataHolder, n3);
        return object;
    }
}

