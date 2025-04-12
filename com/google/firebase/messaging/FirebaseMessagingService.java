/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.firebase.messaging.DisplayNotification;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.FcmExecutors;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.SendException;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService
extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue recentlyReceivedMessageIds;
    private Rpc rpc;

    static {
        ArrayDeque arrayDeque;
        recentlyReceivedMessageIds = arrayDeque = new ArrayDeque(10);
    }

    private boolean alreadyReceivedMessage(String string2) {
        int n3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        Queue queue = recentlyReceivedMessageIds;
        int n4 = queue.contains(string2);
        if (n4 != 0) {
            Log.isLoggable((String)"FirebaseMessaging", (int)3);
            return true;
        }
        n4 = queue.size();
        if (n4 >= (n3 = 10)) {
            queue.remove();
        }
        queue.add(string2);
        return false;
    }

    private void dispatchMessage(Intent object) {
        Bundle bundle = object.getExtras();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Object object2 = "androidx.content.wakelockid";
        bundle.remove((String)object2);
        boolean bl2 = NotificationParams.isNotification(bundle);
        if (bl2) {
            object2 = new NotificationParams(bundle);
            ExecutorService executorService = FcmExecutors.newNetworkIOExecutor();
            DisplayNotification displayNotification = new DisplayNotification((Context)this, (NotificationParams)object2, executorService);
            try {
                bl2 = displayNotification.handleNotification();
                if (bl2) {
                    executorService.shutdown();
                    return;
                }
                executorService.shutdown();
            }
            catch (Throwable throwable) {
                executorService.shutdown();
                throw throwable;
            }
            bl2 = MessagingAnalytics.shouldUploadScionMetrics(object);
            if (bl2) {
                MessagingAnalytics.logNotificationForeground(object);
            }
        }
        object = new RemoteMessage(bundle);
        this.onMessageReceived((RemoteMessage)object);
    }

    private String getMessageId(Intent intent) {
        String string2 = intent.getStringExtra("google.message_id");
        if (string2 == null) {
            string2 = intent.getStringExtra("message_id");
        }
        return string2;
    }

    private Rpc getRpc(Context context) {
        Rpc rpc = this.rpc;
        if (rpc == null) {
            context = context.getApplicationContext();
            this.rpc = rpc = new Rpc(context);
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        Object object = intent.getStringExtra("google.message_id");
        boolean bl2 = this.alreadyReceivedMessage((String)object);
        if (!bl2) {
            this.passMessageIntentToSdk(intent);
        }
        object = this.getRpc((Context)this);
        CloudMessage cloudMessage = new CloudMessage(intent);
        ((Rpc)object).messageHandled(cloudMessage);
    }

    private void passMessageIntentToSdk(Intent object) {
        String string2;
        String string3 = "gcm";
        Object object2 = object.getStringExtra("message_type");
        if (object2 == null) {
            object2 = string3;
        }
        int n3 = -1;
        int n4 = ((String)object2).hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 814800675: {
                string3 = "send_event";
                boolean bl2 = ((String)object2).equals(string3);
                if (!bl2) break;
                n3 = 3;
                break;
            }
            case 814694033: {
                string3 = "send_error";
                boolean bl3 = ((String)object2).equals(string3);
                if (!bl3) break;
                n3 = 2;
                break;
            }
            case 102161: {
                boolean bl4 = ((String)object2).equals(string3);
                if (!bl4) break;
                n3 = 1;
                break;
            }
            case -2062414158: {
                string3 = "deleted_messages";
                boolean bl5 = ((String)object2).equals(string3);
                if (!bl5) break;
                n3 = 0;
                string2 = null;
            }
        }
        switch (n3) {
            default: {
                break;
            }
            case 3: {
                string3 = "google.message_id";
                object = object.getStringExtra(string3);
                this.onMessageSent((String)object);
                break;
            }
            case 2: {
                string3 = this.getMessageId((Intent)object);
                string2 = "error";
                object = object.getStringExtra(string2);
                object2 = new SendException((String)object);
                this.onSendError(string3, (Exception)object2);
                break;
            }
            case 1: {
                MessagingAnalytics.logNotificationReceived(object);
                this.dispatchMessage((Intent)object);
                break;
            }
            case 0: {
                this.onDeletedMessages();
            }
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return ServiceStarter.getInstance().getMessagingEvent();
    }

    public void handleIntent(Intent object) {
        String string2 = ACTION_REMOTE_INTENT;
        String string3 = object.getAction();
        boolean bl2 = string2.equals(string3);
        if (!bl2 && !(bl2 = (string2 = ACTION_DIRECT_BOOT_REMOTE_INTENT).equals(string3))) {
            string2 = ACTION_NEW_TOKEN;
            boolean bl3 = string2.equals(string3);
            if (bl3) {
                string3 = EXTRA_TOKEN;
                object = object.getStringExtra(string3);
                this.onNewToken((String)object);
            } else {
                object.getAction();
            }
        } else {
            this.handleMessageIntent((Intent)object);
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String string2) {
    }

    public void onNewToken(String string2) {
    }

    public void onSendError(String string2, Exception exception) {
    }

    public void setRpcForTesting(Rpc rpc) {
        this.rpc = rpc;
    }
}

