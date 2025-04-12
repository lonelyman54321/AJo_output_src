/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zam;
import com.google.android.gms.common.api.internal.zan;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.Preconditions;

final class zao
implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    public zao(zap zap2, zam zam2) {
        this.zaa = zap2;
        this.zab = zam2;
    }

    public final void run() {
        int n3;
        Object object = this.zaa;
        boolean bl2 = ((zap)object).zaa;
        if (!bl2) {
            return;
        }
        object = this.zab.zab();
        boolean n4 = ((ConnectionResult)object).hasResolution();
        if (n4) {
            zap object2 = this.zaa;
            LifecycleFragment activity = object2.mLifecycleFragment;
            object2 = object2.getActivity();
            object = (PendingIntent)Preconditions.checkNotNull(((ConnectionResult)object).getResolution());
            int n8 = this.zab.zaa();
            object = GoogleApiActivity.zaa((Context)object2, (PendingIntent)object, n8, false);
            activity.startActivityForResult((Intent)object, 1);
            return;
        }
        Object object2 = this.zaa;
        Activity activity = ((LifecycleCallback)object2).getActivity();
        int n7 = ((ConnectionResult)object).getErrorCode();
        object2 = ((zap)object2).zac;
        LifecycleFragment lifecycleFragment = null;
        if ((object2 = ((GoogleApiAvailability)object2).getErrorResolutionIntent((Context)activity, n7, null)) != null) {
            object2 = this.zaa;
            Activity zan2 = ((LifecycleCallback)object2).getActivity();
            lifecycleFragment = ((LifecycleCallback)object2).mLifecycleFragment;
            int n8 = ((ConnectionResult)object).getErrorCode();
            zap zap2 = this.zaa;
            ((zap)object2).zac.zag(zan2, lifecycleFragment, n8, 2, zap2);
            return;
        }
        int n10 = ((ConnectionResult)object).getErrorCode();
        if (n10 == (n3 = 18)) {
            object = this.zaa;
            object2 = ((zap)object).zac;
            activity = ((LifecycleCallback)object).getActivity();
            object = ((GoogleApiAvailability)object2).zab(activity, (DialogInterface.OnCancelListener)object);
            object2 = this.zaa;
            activity = ((LifecycleCallback)object2).getActivity().getApplicationContext();
            zan zan2 = new zan(this, (Dialog)object);
            ((zap)object2).zac.zac((Context)activity, zan2);
            return;
        }
        object2 = this.zaa;
        n3 = this.zab.zaa();
        zap.zaf((zap)object2, (ConnectionResult)object, n3);
    }
}

