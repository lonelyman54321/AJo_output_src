/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;

public final class zaae
extends zap {
    private final Np zad;
    private final GoogleApiManager zae;

    public zaae(LifecycleFragment object, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super((LifecycleFragment)object, googleApiAvailability);
        this.zad = object = new Np();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(Activity object, GoogleApiManager googleApiManager, ApiKey apiKey) {
        Object object2;
        zaae zaae2 = (zaae)(object = LifecycleCallback.getFragment((Activity)object)).getCallbackOrNull("ConnectionlessLifecycleHelper", (Class)(object2 = zaae.class));
        if (zaae2 == null) {
            object2 = GoogleApiAvailability.getInstance();
            zaae2 = new zaae((LifecycleFragment)object, googleApiManager, (GoogleApiAvailability)object2);
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaae2.zad.add(apiKey);
        googleApiManager.zaA(zaae2);
    }

    private final void zae() {
        Object object = this.zad;
        boolean bl2 = ((Np)object).isEmpty();
        if (!bl2) {
            object = this.zae;
            ((GoogleApiManager)object).zaA(this);
        }
    }

    public final void onResume() {
        super.onResume();
        this.zae();
    }

    public final void onStart() {
        super.onStart();
        this.zae();
    }

    public final void onStop() {
        super.onStop();
        this.zae.zaB(this);
    }

    public final Np zaa() {
        return this.zad;
    }

    public final void zab(ConnectionResult connectionResult, int n3) {
        this.zae.zax(connectionResult, n3);
    }

    public final void zac() {
        this.zae.zay();
    }
}

