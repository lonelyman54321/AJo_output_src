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
import com.google.android.gms.internal.ads.zzagy;
import com.google.android.gms.internal.ads.zzain;

public final class zzaio
extends zzagy {
    public static final Parcelable.Creator CREATOR;

    static {
        zzain zzain2 = new zzain();
        CREATOR = zzain2;
    }

    public zzaio(Parcel parcel) {
        super(parcel);
    }

    public zzaio(String string2, String string3) {
        super(string2, string3);
    }
}

