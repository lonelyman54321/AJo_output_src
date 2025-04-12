/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Service
 */
package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.Service;

public final class SystemForegroundService$a {
    public static void a(Service service, int n3, Notification notification, int n4) {
        service.startForeground(n3, notification, n4);
    }
}

