/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zau;

final class zad
extends zau {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        this.zaa = googleApiAvailability;
        googleApiAvailability = Looper.myLooper();
        googleApiAvailability = googleApiAvailability == null ? Looper.getMainLooper() : Looper.myLooper();
        super((Looper)googleApiAvailability);
        googleApiAvailability = context.getApplicationContext();
        this.zab = googleApiAvailability;
    }

    public final void handleMessage(Message object) {
        int n3 = ((Message)object).what;
        int n4 = 1;
        if (n3 != n4) {
            return;
        }
        object = this.zaa;
        Context context = this.zab;
        n4 = ((GoogleApiAvailability)object).isGooglePlayServicesAvailable(context);
        n3 = (int)(((GoogleApiAvailability)object).isUserResolvableError(n4) ? 1 : 0);
        if (n3 != 0) {
            object = this.zaa;
            Context context2 = this.zab;
            ((GoogleApiAvailability)object).showErrorNotification(context2, n4);
        }
    }
}

