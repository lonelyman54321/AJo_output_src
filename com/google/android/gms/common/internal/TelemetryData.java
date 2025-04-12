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
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zaab;
import java.util.ArrayList;
import java.util.List;

public class TelemetryData
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zaa;
    private List zab;

    static {
        zaab zaab2 = new zaab();
        CREATOR = zaab2;
    }

    public TelemetryData(int n3, List list) {
        this.zaa = n3;
        this.zab = list;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        List list = this.zab;
        SafeParcelWriter.writeTypedList(parcel, 2, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final int zaa() {
        return this.zaa;
    }

    public final List zab() {
        return this.zab;
    }

    public final void zac(MethodInvocation methodInvocation) {
        ArrayList arrayList = this.zab;
        if (arrayList == null) {
            this.zab = arrayList = new ArrayList();
        }
        this.zab.add(methodInvocation);
    }
}

