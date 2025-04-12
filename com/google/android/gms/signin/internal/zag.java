/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.signin.internal.zah;
import java.util.List;

public final class zag
extends AbstractSafeParcelable
implements Result {
    public static final Parcelable.Creator CREATOR;
    private final List zaa;
    private final String zab;

    static {
        zah zah2 = new zah();
        CREATOR = zah2;
    }

    public zag(List list, String string2) {
        this.zaa = list;
        this.zab = string2;
    }

    public final Status getStatus() {
        String string2 = this.zab;
        if (string2 != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        List list = this.zaa;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, list, false);
        String string2 = this.zab;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

