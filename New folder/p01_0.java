/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 */
import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.io.File;
import java.nio.file.Path;

/*
 * Renamed from p01
 */
public final class p01_0 {
    public static /* bridge */ /* synthetic */ NotificationChannel a(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("com.google.android.gms.availability");
    }

    public static /* bridge */ /* synthetic */ File b(Path path) {
        return path.toFile();
    }
}

