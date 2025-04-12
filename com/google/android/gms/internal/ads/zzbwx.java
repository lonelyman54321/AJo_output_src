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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbwy;
import java.util.Collections;
import java.util.List;

public final class zzbwx
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean zza;
    public final List zzb;

    static {
        zzbwy zzbwy2 = new zzbwy();
        CREATOR = zzbwy2;
    }

    public zzbwx() {
        List list = Collections.emptyList();
        this(false, list);
    }

    public zzbwx(boolean bl2, List list) {
        this.zza = bl2;
        this.zzb = list;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = (int)(this.zza ? 1 : 0);
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, n3 != 0);
        List list = this.zzb;
        SafeParcelWriter.writeStringList(parcel, 3, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

