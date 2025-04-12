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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zan;

public class MethodInvocation
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;
    private final String zaf;
    private final String zag;
    private final int zah;
    private final int zai;

    static {
        zan zan2 = new zan();
        CREATOR = zan2;
    }

    public MethodInvocation(int n3, int n4, int n7, long l2, long l3, String string2, String string3, int n8) {
        this(n3, n4, n7, l2, l3, string2, string3, n8, -1);
    }

    public MethodInvocation(int n3, int n4, int n7, long l2, long l3, String string2, String string3, int n8, int n10) {
        this.zaa = n3;
        this.zab = n4;
        this.zac = n7;
        this.zad = l2;
        this.zae = l3;
        this.zaf = string2;
        this.zag = string3;
        this.zah = n8;
        this.zai = n10;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zaa;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zab;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.zac;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        long l2 = this.zad;
        SafeParcelWriter.writeLong(parcel, 4, l2);
        l2 = this.zae;
        SafeParcelWriter.writeLong(parcel, 5, l2);
        String string2 = this.zaf;
        SafeParcelWriter.writeString(parcel, 6, string2, false);
        String string3 = this.zag;
        SafeParcelWriter.writeString(parcel, 7, string3, false);
        n7 = this.zah;
        SafeParcelWriter.writeInt(parcel, 8, n7);
        n7 = this.zai;
        SafeParcelWriter.writeInt(parcel, 9, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

