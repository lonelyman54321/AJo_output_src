/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 */
package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.converter.zad;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter
extends AbstractSafeParcelable
implements FastJsonResponse$FieldConverter {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    static {
        zad zad2 = new zad();
        CREATOR = zad2;
    }

    public StringToIntConverter() {
        SparseArray sparseArray;
        this.zaa = 1;
        this.zab = sparseArray = new HashMap();
        this.zac = sparseArray = new SparseArray();
    }

    public StringToIntConverter(int n3, ArrayList arrayList) {
        SparseArray sparseArray;
        this.zaa = n3;
        this.zab = sparseArray = new HashMap();
        this.zac = sparseArray = new SparseArray();
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            zac zac2 = (zac)arrayList.get(i3);
            String string2 = zac2.zab;
            int n4 = zac2.zac;
            this.add(string2, n4);
        }
    }

    public StringToIntConverter add(String string2, int n3) {
        Integer n4 = n3;
        this.zab.put(string2, n4);
        this.zac.put(n3, (Object)string2);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        n3 = this.zaa;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = 1;
        SafeParcelWriter.writeInt(parcel, n7, n3);
        ArrayList<zac> arrayList = new ArrayList<zac>();
        Iterator iterator = this.zab.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Serializable serializable = this.zab;
            serializable = (Integer)((HashMap)serializable).get(string2);
            int n8 = (Integer)serializable;
            zac zac2 = new zac(string2, n8);
            arrayList.add(zac2);
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final int zaa() {
        return 7;
    }

    public final int zab() {
        return 0;
    }
}

