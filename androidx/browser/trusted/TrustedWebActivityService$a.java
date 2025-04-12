/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.graphics.BitmapFactory
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.service.notification.StatusBarNotification
 */
package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.ITrustedWebActivityCallback$Stub;
import android.support.customtabs.trusted.ITrustedWebActivityService$Stub;
import androidx.browser.trusted.TrustedWebActivityService;

public final class TrustedWebActivityService$a
extends ITrustedWebActivityService$Stub {
    public final /* synthetic */ TrustedWebActivityService a;

    public TrustedWebActivityService$a(TrustedWebActivityService trustedWebActivityService) {
        this.a = trustedWebActivityService;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Bundle areNotificationsEnabled(Bundle object) {
        int n3;
        String string2;
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        int n4;
        this.c();
        String string3 = "android.support.customtabs.trusted.CHANNEL_NAME";
        QS.b(object, string3);
        String string4 = object.getString(string3);
        TrustedWebActivityService trustedWebActivityService = this.a;
        Object object2 = trustedWebActivityService.a;
        if (object2 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            throw illegalStateException;
        }
        object2 = new s52((Context)trustedWebActivityService);
        int n7 = ((s52)object2).a();
        boolean bl2 = false;
        if (n7 != 0 && ((n7 = Build.VERSION.SDK_INT) < (n4 = 26) || (notificationChannel = v42_0.a(notificationManager = trustedWebActivityService.a, string2 = TrustedWebActivityService.a(string4))) == null || (n3 = w42_0.a(notificationChannel)) != 0)) {
            bl2 = true;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", bl2);
        return bundle;
    }

    public final void c() {
        Object object = this.a;
        int n3 = ((TrustedWebActivityService)((Object)object)).b;
        int n4 = -1;
        if (n3 != n4) {
            int n7 = Binder.getCallingUid();
            if (n3 == n7) {
                return;
            }
            object = new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            throw object;
        }
        PackageManager packageManager = object.getPackageManager();
        n4 = Binder.getCallingUid();
        packageManager.getPackagesForUid(n4);
        ((TrustedWebActivityService)((Object)object)).b();
        throw null;
    }

    public final void cancelNotification(Bundle object) {
        this.c();
        String string2 = "android.support.customtabs.trusted.PLATFORM_TAG";
        QS.b(object, string2);
        String string3 = "android.support.customtabs.trusted.PLATFORM_ID";
        QS.b(object, string3);
        string2 = object.getString(string2);
        int n3 = object.getInt(string3);
        string3 = this.a.a;
        if (string3 != null) {
            string3.cancel(string2, n3);
            return;
        }
        object = new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        throw object;
    }

    public final Bundle extraCommand(String string2, Bundle bundle, IBinder iBinder) {
        this.c();
        if (iBinder != null) {
            ITrustedWebActivityCallback$Stub.asInterface(iBinder);
        }
        ((Object)((Object)this.a)).getClass();
        return null;
    }

    public final Bundle getActiveNotifications() {
        this.c();
        StatusBarNotification[] statusBarNotificationArray = this.a.a;
        if (statusBarNotificationArray != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            if (n3 >= n4) {
                statusBarNotificationArray = u42_0.a((NotificationManager)statusBarNotificationArray);
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", (Parcelable[])statusBarNotificationArray);
                return bundle;
            }
            statusBarNotificationArray = new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
            throw statusBarNotificationArray;
        }
        statusBarNotificationArray = new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        throw statusBarNotificationArray;
    }

    public final Bundle getSmallIconBitmap() {
        this.c();
        TrustedWebActivityService trustedWebActivityService = this.a;
        int n3 = trustedWebActivityService.c();
        Bundle bundle = new Bundle();
        int n4 = -1;
        if (n3 != n4) {
            trustedWebActivityService = BitmapFactory.decodeResource((Resources)trustedWebActivityService.getResources(), (int)n3);
            String string2 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
            bundle.putParcelable(string2, (Parcelable)trustedWebActivityService);
        }
        return bundle;
    }

    public final int getSmallIconId() {
        this.c();
        return this.a.c();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Bundle notifyNotificationWithChannel(Bundle object) {
        boolean bl2;
        block6: {
            TrustedWebActivityService trustedWebActivityService;
            int n3;
            String string2;
            String string3;
            block7: {
                void var1_6;
                this.c();
                string3 = "android.support.customtabs.trusted.PLATFORM_TAG";
                QS.b(object, string3);
                String string4 = "android.support.customtabs.trusted.PLATFORM_ID";
                QS.b(object, string4);
                string2 = "android.support.customtabs.trusted.NOTIFICATION";
                QS.b(object, string2);
                String string5 = "android.support.customtabs.trusted.CHANNEL_NAME";
                QS.b(object, string5);
                string3 = object.getString(string3);
                n3 = object.getInt(string4);
                string2 = (Notification)object.getParcelable(string2);
                String string6 = object.getString(string5);
                trustedWebActivityService = this.a;
                Object object2 = trustedWebActivityService.a;
                if (object2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                    throw illegalStateException;
                }
                object2 = new s52((Context)trustedWebActivityService);
                int n4 = ((s52)object2).a();
                bl2 = false;
                if (n4 == 0) break block6;
                n4 = Build.VERSION.SDK_INT;
                int n7 = 26;
                if (n4 < n7) break block7;
                object2 = TrustedWebActivityService.a(string6);
                NotificationManager notificationManager = trustedWebActivityService.a;
                NotificationChannel notificationChannel = y42.a((String)object2, string6);
                x31.a(notificationManager, notificationChannel);
                NotificationChannel notificationChannel2 = v42_0.a(notificationManager, (String)object2);
                int n8 = w42_0.a(notificationChannel2);
                if (n8 == 0) {
                    n8 = 0;
                    Object var1_5 = null;
                } else {
                    Notification.Builder builder = kx_1.a((Context)trustedWebActivityService, (Notification)string2);
                    x42.a(builder, (String)object2);
                    Notification notification = builder.build();
                }
                string2 = var1_6;
                NotificationChannel notificationChannel3 = v42_0.a(trustedWebActivityService.a, (String)object2);
                if (notificationChannel3 != null && (n8 = w42_0.a(notificationChannel3)) == 0) break block6;
            }
            NotificationManager notificationManager = trustedWebActivityService.a;
            notificationManager.notify(string3, n3, (Notification)string2);
            bl2 = true;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", bl2);
        return bundle;
    }
}

