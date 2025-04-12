/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver
extends CloudMessagingReceiver {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String string2, Bundle bundle) {
        context = new Intent(string2);
        return context.putExtras(bundle);
    }

    public int onMessageReceive(Context object, CloudMessage cloudMessage) {
        FcmBroadcastProcessor fcmBroadcastProcessor = new FcmBroadcastProcessor((Context)object);
        object = cloudMessage.getIntent();
        object = fcmBroadcastProcessor.process((Intent)object);
        object = Tasks.await((Task)object);
        object = (Integer)object;
        try {
            return (Integer)object;
        }
        catch (InterruptedException | ExecutionException exception) {
            return 500;
        }
    }

    public void onNotificationDismissed(Context context, Bundle bundle) {
        String string2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        boolean bl2 = MessagingAnalytics.shouldUploadScionMetrics((Intent)(context = FirebaseInstanceIdReceiver.createServiceIntent(context, string2, bundle)));
        if (bl2) {
            MessagingAnalytics.logNotificationDismiss((Intent)context);
        }
    }
}

