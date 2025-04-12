/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseIntArray
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.internal.Preconditions;

public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        this(googleApiAvailability);
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        SparseIntArray sparseIntArray;
        this.zaa = sparseIntArray = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int n3) {
        return this.zaa.get(n3, -1);
    }

    public final int zab(Context context, Api$Client api$Client) {
        int n3;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(api$Client);
        int n4 = api$Client.requiresGooglePlayServices();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        int n8 = api$Client.getMinApkVersion();
        n4 = this.zaa(context, n8);
        if (n4 == (n3 = -1)) {
            GoogleApiAvailabilityLight googleApiAvailabilityLight;
            block6: {
                SparseIntArray sparseIntArray;
                int n10;
                googleApiAvailabilityLight = null;
                for (n4 = 0; n4 < (n10 = (sparseIntArray = this.zaa).size()); ++n4) {
                    SparseIntArray sparseIntArray2;
                    sparseIntArray = this.zaa;
                    n10 = sparseIntArray.keyAt(n4);
                    if (n10 <= n8 || (n10 = (sparseIntArray2 = this.zaa).get(n10)) != 0) {
                        continue;
                    }
                    break block6;
                }
                n7 = -1;
            }
            if (n7 == n3) {
                int n14;
                googleApiAvailabilityLight = this.zab;
                n4 = n14 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context, n8);
            } else {
                n4 = n7;
            }
            context = this.zaa;
            context.put(n8, n4);
        }
        return n4;
    }

    public final void zac() {
        this.zaa.clear();
    }
}

