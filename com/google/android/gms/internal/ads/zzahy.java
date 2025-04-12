/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.List;

final class zzahy
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        String string2 = object.readString();
        string2.getClass();
        String string3 = object.readString();
        object = object.createStringArray();
        object.getClass();
        object = zzgbc.zzl(object);
        zzahz zzahz2 = new zzahz(string2, string3, (List)object);
        return zzahz2;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzahz[n3];
    }
}

