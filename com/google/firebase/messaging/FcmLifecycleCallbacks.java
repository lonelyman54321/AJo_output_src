/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.a;
import java.util.ArrayDeque;
import java.util.Queue;

class FcmLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks {
    private static final int RECENTLY_LOGGED_MESSAGE_IDS_MAX_SIZE = 10;
    private final Queue recentlyLoggedMessageIds;

    public FcmLifecycleCallbacks() {
        ArrayDeque arrayDeque;
        this.recentlyLoggedMessageIds = arrayDeque = new ArrayDeque(10);
    }

    public static /* synthetic */ void a(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        fcmLifecycleCallbacks.lambda$onActivityCreated$0(intent);
    }

    private /* synthetic */ void lambda$onActivityCreated$0(Intent intent) {
        this.logNotificationOpen(intent);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void logNotificationOpen(Intent intent) {
        boolean bl2;
        Bundle bundle;
        block5: {
            String string2;
            block6: {
                bundle = null;
                try {
                    intent = intent.getExtras();
                    if (intent == null) break block5;
                    string2 = MessagingAnalytics.getMessageId((Bundle)intent);
                    boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                    if (bl3) break block6;
                    Queue queue = this.recentlyLoggedMessageIds;
                    bl3 = queue.contains(string2);
                    if (bl3) {
                        return;
                    }
                    queue = this.recentlyLoggedMessageIds;
                    queue.add(string2);
                }
                catch (RuntimeException runtimeException) {
                    break block5;
                }
            }
            string2 = "gcm.n.analytics_data";
            {
                bundle = intent.getBundle(string2);
            }
        }
        if (bl2 = MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if ((activity = activity.getIntent()) == null) {
            return;
        }
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 25;
        if (n3 <= n4) {
            Object object = Looper.getMainLooper();
            bundle = new Handler(object);
            object = new a(this, (Intent)activity);
            bundle.post((Runnable)object);
        } else {
            this.logNotificationOpen((Intent)activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}

