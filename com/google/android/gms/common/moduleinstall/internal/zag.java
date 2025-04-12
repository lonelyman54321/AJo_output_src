/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.zah;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zag
extends zab
implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    public final boolean zaa(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = ModuleInstallStatusUpdate.CREATOR;
            object = (ModuleInstallStatusUpdate)zac.zaa(parcel, object);
            zac.zab(parcel);
            this.zab((ModuleInstallStatusUpdate)object);
            return n7;
        }
        return false;
    }
}

