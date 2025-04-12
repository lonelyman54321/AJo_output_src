/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 */
package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

public final class SystemForegroundService$b {
    public static void a(Service object, int n3, Notification notification, int n4) {
        try {
            object.startForeground(n3, notification, n4);
        }
        catch (SecurityException securityException) {
            object = qx1.a();
            n3 = SystemForegroundService.e;
            object.getClass();
        }
        catch (ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
            object = qx1.a();
            n3 = SystemForegroundService.e;
            object.getClass();
        }
    }
}

