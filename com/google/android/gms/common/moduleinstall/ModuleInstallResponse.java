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
import com.google.android.gms.common.moduleinstall.zad;

public class ModuleInstallResponse
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zaa;
    private final boolean zab;

    static {
        zad zad2 = new zad();
        CREATOR = zad2;
    }

    public ModuleInstallResponse(int n3) {
        this(n3, false);
    }

    public ModuleInstallResponse(int n3, boolean bl2) {
        this.zaa = n3;
        this.zab = bl2;
    }

    public boolean areModulesAlreadyInstalled() {
        int n3 = this.zaa;
        return n3 == 0;
    }

    public int getSessionId() {
        return this.zaa;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.getSessionId();
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        boolean bl3 = this.zab;
        SafeParcelWriter.writeBoolean(parcel, 2, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final boolean zaa() {
        return this.zab;
    }
}

