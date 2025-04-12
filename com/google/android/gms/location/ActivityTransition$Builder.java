/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityTransition;

public class ActivityTransition$Builder {
    private int zza;
    private int zzb;

    public ActivityTransition$Builder() {
        int n3;
        this.zza = n3 = -1;
        this.zzb = n3;
    }

    public ActivityTransition build() {
        ActivityTransition activityTransition;
        int n3 = this.zza;
        int n4 = 0;
        int n7 = 1;
        int n8 = -1;
        if (n3 != n8) {
            n3 = 1;
        } else {
            n3 = 0;
            activityTransition = null;
        }
        String string2 = "Activity type not set.";
        Preconditions.checkState(n3 != 0, string2);
        n3 = this.zzb;
        if (n3 != n8) {
            n4 = 1;
        }
        Preconditions.checkState(n4 != 0, "Activity transition type not set.");
        n4 = this.zza;
        n7 = this.zzb;
        activityTransition = new ActivityTransition(n4, n7);
        return activityTransition;
    }

    public ActivityTransition$Builder setActivityTransition(int n3) {
        ActivityTransition.zza(n3);
        this.zzb = n3;
        return this;
    }

    public ActivityTransition$Builder setActivityType(int n3) {
        this.zza = n3;
        return this;
    }
}

