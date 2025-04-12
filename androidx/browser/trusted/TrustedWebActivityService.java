/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 */
package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import androidx.browser.trusted.TrustedWebActivityService$a;
import java.util.Locale;

public abstract class TrustedWebActivityService
extends Service {
    public NotificationManager a;
    public int b = -1;
    public final TrustedWebActivityService$a c;

    public TrustedWebActivityService() {
        TrustedWebActivityService$a trustedWebActivityService$a;
        this.c = trustedWebActivityService$a = new TrustedWebActivityService$a(this);
    }

    public static String a(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale).replace(' ', '_');
        stringBuilder.append(string2);
        stringBuilder.append("_channel_id");
        return stringBuilder.toString();
    }

    public abstract bo3 b();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int c() {
        PackageManager packageManager;
        int n3 = -1;
        try {
            packageManager = this.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return n3;
        }
        Class<?> clazz = ((Object)((Object)this)).getClass();
        ComponentName componentName = new ComponentName((Context)this, clazz);
        int n4 = 128;
        packageManager = packageManager.getServiceInfo(componentName, n4);
        packageManager = packageManager.metaData;
        if (packageManager == null) {
            return n3;
        }
        String string2 = "android.support.customtabs.trusted.SMALL_ICON";
        return packageManager.getInt(string2, n3);
    }

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        NotificationManager notificationManager;
        super.onCreate();
        this.a = notificationManager = (NotificationManager)this.getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.b = -1;
        return super.onUnbind(intent);
    }
}

