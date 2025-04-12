/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.signin.internal.zab;

public final class zaa
extends AbstractSafeParcelable
implements Result {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private int zab;
    private Intent zac;

    static {
        zab zab2 = new zab();
        CREATOR = zab2;
    }

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int n3, int n4, Intent intent) {
        this.zaa = n3;
        this.zab = n4;
        this.zac = intent;
    }

    public final Status getStatus() {
        int n3 = this.zab;
        if (n3 == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        int n8 = this.zab;
        SafeParcelWriter.writeInt(parcel, 2, n8);
        Intent intent = this.zac;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)intent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

