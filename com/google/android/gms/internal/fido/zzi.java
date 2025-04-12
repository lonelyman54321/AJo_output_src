/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.IntentSender
 */
package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.fido.fido2.Fido2PendingIntent;

public final class zzi
implements Fido2PendingIntent {
    private final PendingIntent zza;

    public zzi(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final boolean hasPendingIntent() {
        PendingIntent pendingIntent = this.zza;
        return pendingIntent != null;
    }

    public final void launchPendingIntent(Activity object, int n3) {
        PendingIntent pendingIntent = this.zza;
        if (pendingIntent != null) {
            IntentSender intentSender = pendingIntent.getIntentSender();
            object.startIntentSenderForResult(intentSender, n3, null, 0, 0, 0);
            return;
        }
        object = new IllegalStateException("No PendingIntent available");
        throw object;
    }
}

