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
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class zal
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    final String zab;
    final ArrayList zac;

    static {
        zap zap2 = new zap();
        CREATOR = zap2;
    }

    public zal(int n3, String string2, ArrayList arrayList) {
        this.zaa = n3;
        this.zab = string2;
        this.zac = arrayList;
    }

    public zal(String arrayList, Map map2) {
        int n3;
        this.zaa = n3 = 1;
        this.zab = arrayList;
        if (map2 == null) {
            arrayList = null;
        } else {
            boolean bl2;
            arrayList = new ArrayList<zam>();
            Iterator iterator = map2.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)map2.get(string2);
                zam zam2 = new zam(string2, fastJsonResponse$Field);
                arrayList.add(zam2);
            }
        }
        this.zac = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zaa;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.zab;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        ArrayList arrayList = this.zac;
        SafeParcelWriter.writeTypedList(parcel, 3, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

