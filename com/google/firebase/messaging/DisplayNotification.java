/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.KeyguardManager
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Process
 *  android.os.SystemClock
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.CommonNotificationBuilder$DisplayNotificationInfo;
import com.google.firebase.messaging.ImageDownload;
import com.google.firebase.messaging.NotificationParams;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class DisplayNotification {
    private static final int IMAGE_DOWNLOAD_TIMEOUT_SECONDS = 5;
    private final Context context;
    private final ExecutorService networkIoExecutor;
    private final NotificationParams params;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context;
        this.params = notificationParams;
    }

    private boolean isAppForeground() {
        KeyguardManager keyguardManager = (KeyguardManager)this.context.getSystemService("keyguard");
        int n3 = keyguardManager.inKeyguardRestrictedInputMode();
        boolean bl2 = false;
        if (n3 != 0) {
            return false;
        }
        n3 = PlatformVersion.isAtLeastLollipop();
        if (n3 == 0) {
            long l2 = 10;
            SystemClock.sleep((long)l2);
        }
        n3 = Process.myPid();
        Object object = this.context;
        String string2 = "activity";
        if ((object = ((ActivityManager)object.getSystemService(string2)).getRunningAppProcesses()) != null) {
            boolean bl3;
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                string2 = (ActivityManager.RunningAppProcessInfo)object.next();
                int n4 = ((ActivityManager.RunningAppProcessInfo)string2).pid;
                if (n4 != n3) continue;
                n3 = ((ActivityManager.RunningAppProcessInfo)string2).importance;
                int n7 = 100;
                if (n3 != n7) break;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }

    private void showNotification(CommonNotificationBuilder$DisplayNotificationInfo commonNotificationBuilder$DisplayNotificationInfo) {
        Log.isLoggable((String)"FirebaseMessaging", (int)3);
        NotificationManager notificationManager = (NotificationManager)this.context.getSystemService("notification");
        String string2 = commonNotificationBuilder$DisplayNotificationInfo.tag;
        int n3 = commonNotificationBuilder$DisplayNotificationInfo.id;
        commonNotificationBuilder$DisplayNotificationInfo = commonNotificationBuilder$DisplayNotificationInfo.notificationBuilder.a();
        notificationManager.notify(string2, n3, (Notification)commonNotificationBuilder$DisplayNotificationInfo);
    }

    private ImageDownload startImageDownloadInBackground() {
        Object object = this.params;
        Object object2 = "gcm.n.image";
        if ((object = ImageDownload.create(((NotificationParams)object).getString((String)object2))) != null) {
            object2 = this.networkIoExecutor;
            ((ImageDownload)object).start((ExecutorService)object2);
        }
        return object;
    }

    private void waitForAndApplyImageDownload(J42 object, ImageDownload imageDownload) {
        block14: {
            if (imageDownload == null) {
                return;
            }
            Object object2 = imageDownload.getTask();
            Object object3 = TimeUnit.SECONDS;
            long l2 = 5;
            object2 = Tasks.await((Task)object2, l2, (TimeUnit)((Object)object3));
            object2 = (Bitmap)object2;
            ((J42)object).e((Bitmap)object2);
            object3 = new U42();
            ((F42)object3).m((Bitmap)object2);
            boolean bl2 = false;
            object2 = null;
            ((F42)object3).f = null;
            bl2 = true;
            ((F42)object3).g = bl2;
            try {
                ((J42)object).g((U42)object3);
                break block14;
            }
            catch (ExecutionException executionException) {
            }
            catch (TimeoutException timeoutException) {
                imageDownload.close();
                break block14;
            }
            catch (InterruptedException interruptedException) {
                imageDownload.close();
                object = Thread.currentThread();
                ((Thread)object).interrupt();
                break block14;
            }
            Throwable throwable = executionException.getCause();
            Objects.toString(throwable);
        }
    }

    public boolean handleNotification() {
        Object object = this.params;
        String string2 = "gcm.n.noui";
        boolean bl2 = ((NotificationParams)object).getBoolean(string2);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        bl2 = this.isAppForeground();
        if (bl2) {
            return false;
        }
        object = this.startImageDownloadInBackground();
        Object object2 = this.context;
        Object object3 = this.params;
        object2 = CommonNotificationBuilder.createNotificationInfo(object2, (NotificationParams)object3);
        object3 = object2.notificationBuilder;
        this.waitForAndApplyImageDownload((J42)object3, (ImageDownload)object);
        this.showNotification((CommonNotificationBuilder$DisplayNotificationInfo)object2);
        return bl3;
    }
}

