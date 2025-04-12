/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 */
package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity
extends Activity {
    private ResultReceiver zza;

    private final void zza() {
        ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            int n3 = 3;
            resultReceiver.send(n3, bundle);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(n3, n4, intent);
        if (n3 == 0 && (resultReceiver = this.zza) != null) {
            int n7 = -1;
            if (n4 == n7) {
                Bundle bundle = new Bundle();
                n7 = 1;
                resultReceiver.send(n7, bundle);
            } else if (n4 == 0) {
                Bundle bundle = new Bundle();
                n7 = 2;
                resultReceiver.send(n7, bundle);
            }
        }
        this.finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object object = this.getIntent();
        String string2 = "window_flags";
        int n3 = object.getIntExtra(string2, 0);
        Object object2 = null;
        if (n3 != 0) {
            this.getWindow().getDecorView().setSystemUiVisibility(n3);
            Intent intent2 = new Intent();
            intent2.putExtra(string2, n3);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        object = "result_receiver";
        if (bundle == null) {
            bundle = (ResultReceiver)this.getIntent().getParcelableExtra((String)object);
            this.zza = bundle;
            bundle = this.getIntent().getExtras();
            if (bundle != null) {
                object2 = object = bundle.get("confirmation_intent");
                object2 = (PendingIntent)object;
            }
            if (bundle != null && object2 != null) {
                IntentSender intentSender;
                try {
                    intentSender = object2.getIntentSender();
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    this.zza();
                    this.finish();
                    return;
                }
                this.startIntentSenderForResult(intentSender, 0, intent, 0, 0, 0);
                return;
            }
            this.zza();
            this.finish();
            return;
        }
        bundle = (ResultReceiver)bundle.getParcelable((String)object);
        this.zza = bundle;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.zza;
        bundle.putParcelable("result_receiver", (Parcelable)resultReceiver);
    }
}

