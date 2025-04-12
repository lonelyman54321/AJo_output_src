/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth-api.zbq;

public final class zbp
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final Credential zba;

    static {
        zbq zbq2 = new zbq();
        CREATOR = zbq2;
    }

    public zbp(Credential credential) {
        this.zba = credential;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Credential credential = this.zba;
        SafeParcelWriter.writeParcelable(parcel, 1, credential, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

