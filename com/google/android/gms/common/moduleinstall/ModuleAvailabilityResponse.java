/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.moduleinstall.zaa;

public class ModuleAvailabilityResponse
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zaa;
    private final int zab;

    static {
        zaa zaa2 = new zaa();
        CREATOR = zaa2;
    }

    public ModuleAvailabilityResponse(boolean bl2, int n3) {
        this.zaa = bl2;
        this.zab = n3;
    }

    public boolean areModulesAvailable() {
        return this.zaa;
    }

    public int getAvailabilityStatus() {
        return this.zab;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.areModulesAvailable();
        SafeParcelWriter.writeBoolean(parcel, 1, n4 != 0);
        n4 = this.getAvailabilityStatus();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

