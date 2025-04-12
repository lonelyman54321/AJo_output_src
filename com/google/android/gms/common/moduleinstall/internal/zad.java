/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zae;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zad
extends zab
implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    public final boolean zaa(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        return false;
                    }
                    Object object = Status.CREATOR;
                    object = (Status)zac.zaa(parcel, object);
                    zac.zab(parcel);
                    this.zab((Status)object);
                } else {
                    Object object = Status.CREATOR;
                    object = (Status)zac.zaa(parcel, object);
                    Object object2 = ModuleInstallIntentResponse.CREATOR;
                    object2 = (ModuleInstallIntentResponse)zac.zaa(parcel, object2);
                    zac.zab(parcel);
                    this.zac((Status)object, (ModuleInstallIntentResponse)object2);
                }
            } else {
                Object object = Status.CREATOR;
                object = (Status)zac.zaa(parcel, object);
                Object object3 = ModuleInstallResponse.CREATOR;
                object3 = (ModuleInstallResponse)zac.zaa(parcel, object3);
                zac.zab(parcel);
                this.zad((Status)object, (ModuleInstallResponse)object3);
            }
        } else {
            Object object = Status.CREATOR;
            object = (Status)zac.zaa(parcel, object);
            Object object4 = ModuleAvailabilityResponse.CREATOR;
            object4 = (ModuleAvailabilityResponse)zac.zaa(parcel, object4);
            zac.zab(parcel);
            this.zae((Status)object, (ModuleAvailabilityResponse)object4);
        }
        return n7;
    }
}

