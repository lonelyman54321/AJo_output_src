/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.jpl.crasdk.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import kotlin.jvm.internal.Intrinsics;

public final class CRASmsBroadcastReceiver
extends BroadcastReceiver {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceive(Context object, Intent intent) {
        Object var2_7;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "intent";
        Intrinsics.checkNotNullParameter(var2_7, string2);
        try {
            int n3;
            String string3 = var2_7.getAction();
            object2 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
            int n4 = Intrinsics.areEqual(string3, object2);
            if (n4 == 0) return;
            Bundle bundle = var2_7.getExtras();
            var2_7 = null;
            if (bundle != null) {
                object2 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
                object2 = bundle.get((String)object2);
            } else {
                n3 = 0;
                object2 = null;
            }
            String string4 = "null cannot be cast to non-null type com.google.android.gms.common.api.Status";
            Intrinsics.checkNotNull(object2, string4);
            object2 = (Status)object2;
            n3 = ((Status)object2).getStatusCode();
            string4 = "smsBroadcastReceiverListener";
            if (n3 != 0) {
                n4 = 15;
                if (n3 != n4) {
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                throw null;
            }
            if (bundle != null) {
                object2 = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";
                Parcelable parcelable = bundle.getParcelable((String)object2);
                Intent intent2 = (Intent)parcelable;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            throw null;
        }
        catch (Exception exception) {
            return;
        }
    }
}

