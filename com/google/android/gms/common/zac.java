/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.IntentSender
 */
package com.google.android.gms.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.Intrinsics;

final class zac
implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ I3 zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zac(GoogleApiAvailability googleApiAvailability, Activity activity, int n3, I3 i3) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = n3;
        this.zac = i3;
    }

    public final void onClick(DialogInterface object, int n3) {
        object.dismiss();
        object = this.zad;
        Object object2 = this.zaa;
        int n4 = this.zab;
        object = ((GoogleApiAvailability)object).getErrorResolutionPendingIntent((Context)object2, n4, 0);
        if (object == null) {
            return;
        }
        object = object.getIntentSender();
        Intrinsics.checkNotNullParameter(object, "intentSender");
        object2 = new IntentSenderRequest((IntentSender)object, null, 0, 0);
        this.zac.a(object2);
    }
}

