/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.zzaa;

final class zzz
implements IntentSenderForResultStarter {
    final /* synthetic */ Activity zza;

    public zzz(zzaa zzaa2, Activity activity) {
        this.zza = activity;
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        this.zza.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8);
    }
}

