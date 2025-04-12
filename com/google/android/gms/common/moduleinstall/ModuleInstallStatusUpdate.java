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
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$ProgressInfo;
import com.google.android.gms.common.moduleinstall.zae;

public class ModuleInstallStatusUpdate
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zaa;
    private final int zab;
    private final Long zac;
    private final Long zad;
    private final int zae;
    private final ModuleInstallStatusUpdate$ProgressInfo zaf;

    static {
        zae zae2 = new zae();
        CREATOR = zae2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public ModuleInstallStatusUpdate(int n3, int n4, Long l2, Long l3, int n7) {
        ModuleInstallStatusUpdate$ProgressInfo moduleInstallStatusUpdate$ProgressInfo;
        long l4;
        long l7;
        long l8;
        this.zaa = n3;
        this.zab = n4;
        this.zac = l2;
        this.zad = l3;
        this.zae = n7;
        if (l2 != null && l3 != null && (n7 = (int)((l8 = (l7 = l3.longValue()) - (l4 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) != 0) {
            long l12 = l2;
            long l14 = l3;
            moduleInstallStatusUpdate$ProgressInfo = new ModuleInstallStatusUpdate$ProgressInfo(l12, l14);
        } else {
            n3 = 0;
            moduleInstallStatusUpdate$ProgressInfo = null;
        }
        this.zaf = moduleInstallStatusUpdate$ProgressInfo;
    }

    public int getErrorCode() {
        return this.zae;
    }

    public int getInstallState() {
        return this.zab;
    }

    public ModuleInstallStatusUpdate$ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getSessionId();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.getInstallState();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        Long l2 = this.zac;
        SafeParcelWriter.writeLongObject(parcel, 3, l2, false);
        Long l3 = this.zad;
        SafeParcelWriter.writeLongObject(parcel, 4, l3, false);
        n4 = this.getErrorCode();
        SafeParcelWriter.writeInt(parcel, 5, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

