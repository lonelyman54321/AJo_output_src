/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.internal.zaaw;

final class zaak
implements Runnable {
    final /* synthetic */ zaaw zaa;

    public zaak(zaaw zaaw2) {
        this.zaa = zaaw2;
    }

    public final void run() {
        zaaw zaaw2 = this.zaa;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = zaaw.zaf(zaaw2);
        zaaw2 = zaaw.zac(zaaw2);
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications((Context)zaaw2);
    }
}

