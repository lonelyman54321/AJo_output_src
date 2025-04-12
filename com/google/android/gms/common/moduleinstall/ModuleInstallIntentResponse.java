/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.moduleinstall.zab;

public class ModuleInstallIntentResponse
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent zaa;

    static {
        zab zab2 = new zab();
        CREATOR = zab2;
    }

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.zaa = pendingIntent;
    }

    public PendingIntent getPendingIntent() {
        return this.zaa;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        PendingIntent pendingIntent = this.getPendingIntent();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)pendingIntent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

